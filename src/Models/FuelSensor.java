/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Esper.Config;
import Events.FuelSensorReading;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author infolos
 */
public class FuelSensor extends Thread implements Sensor_Interface {

    private int currentFuelPercent;
    private int consumtionRatePerSecond;
    private final BufferedWriter file;
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private boolean run = false;
    
    public int getCurrentFuelPercent() {
        return currentFuelPercent;
    }

    public FuelSensor(int currentFuelPercent, int consumtionRatePerSecond, BufferedWriter file) {
        this.currentFuelPercent = currentFuelPercent;
        this.consumtionRatePerSecond = consumtionRatePerSecond;
        this.file = file;
    }

    @Override
    public void Observe() {
        currentFuelPercent = currentFuelPercent - consumtionRatePerSecond;
        if (currentFuelPercent < 0) {
            currentFuelPercent = 0;
        }
    }

    public void setRun(boolean run) {
        this.run = run;
    }
    
    @Override
    public void run() {
        while (!run) {
            try {
                try {
                    synchronized (file) {
                        this.Observe();
                        file.write(sdf.format(d) + " " + currentFuelPercent + " Fuel \n");
                    }
                } catch (IOException ex) {
//                    Logger.getLogger(FuelSensor.class.getName()).log(Level.SEVERE, null, ex);
                }
                FuelSensor.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(FuelSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Config.sendEvent(new FuelSensorReading(currentFuelPercent, consumtionRatePerSecond));
        }

    }

}
