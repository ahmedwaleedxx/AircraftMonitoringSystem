/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Esper.Config;
import Events.TemperatureSensorReading;
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
public class TemperatureSensor extends Thread implements Sensor_Interface {

    private int currentTemp;
    private final BufferedWriter file;
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private boolean run = false;

    static private int random(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random num = new Random();
        return num.nextInt((max - min) + 1) + min;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

        public void setRun(boolean run) {
        this.run = run;
    }
    
    @Override
    public void Observe() {
        currentTemp = TemperatureSensor.random(20, 101);
    }

    public TemperatureSensor(int currentTemp, BufferedWriter file) {
        this.currentTemp = currentTemp;
        this.file = file;
    }

    @Override
    public void run() {
        while (!run) {
            try {
                this.Observe();
                try {
                    synchronized (file) {
                        file.write(sdf.format(d) + " " + currentTemp + " Temperature \n");
                    }
                } catch (IOException ex) {
//                    Logger.getLogger(TemperatureSensor.class.getName()).log(Level.SEVERE, null, ex);
                }
                TemperatureSensor.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TemperatureSensor.class.getName()).log(Level.SEVERE, null, ex);
            }

            Config.sendEvent(new TemperatureSensorReading(currentTemp));
        }
    }
}
