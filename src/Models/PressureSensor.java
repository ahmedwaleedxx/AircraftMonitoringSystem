/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Esper.Config;
import Events.PressureSensorReading;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author infolos
 */
public class PressureSensor extends Thread implements Sensor_Interface {

    private int currentPressure;
    private final BufferedWriter file;
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private boolean run = false;
    
    public int getCurrentPressure() {
        return currentPressure;
    }

    public void setCurrentPressure(int currentPressure) {
        this.currentPressure = currentPressure;
    }

        public void setRun(boolean run) {
        this.run = run;
    }
    
    static private int randomPressure(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max pressure must be greater than min pressure");
        }
        Random num = new Random();
        return num.nextInt((max - min) + 1) + min;
    }

    public PressureSensor(int currentPressure, BufferedWriter file) {
        this.currentPressure = currentPressure;
        this.file = file;
    }

    @Override
    public void Observe() {
        currentPressure = PressureSensor.randomPressure(10, 70);
    }

    @Override
    public void run() {
        while (!run) {
            try {
                this.Observe();
                try {
                    synchronized (file) {
                        file.write(sdf.format(d) + " " + currentPressure + " Pressure \n");
                    }
                } catch (IOException ex) {
//                    Logger.getLogger(TemperatureSensor.class.getName()).log(Level.SEVERE, null, ex);
                }
                TemperatureSensor.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TemperatureSensor.class.getName()).log(Level.SEVERE, null, ex);
            }

            Config.sendEvent(new PressureSensorReading(currentPressure));
        }
    }

}
