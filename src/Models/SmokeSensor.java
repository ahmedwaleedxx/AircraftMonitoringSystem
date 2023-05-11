/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Esper.Config;
import Events.SmokeSensorReading;
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
public class SmokeSensor extends Thread implements Sensor_Interface {

    private final int SmokeLuckyNumber;
    private int currentSmokePercentage;
    private final BufferedWriter file;
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private boolean run = false;


    public SmokeSensor(int SmokeLuckyNumber, int currentSmokePercentage, BufferedWriter file) {
        this.SmokeLuckyNumber = SmokeLuckyNumber;
        this.currentSmokePercentage = currentSmokePercentage;
        this.file = file;
    }

    public int getCurrentSmokePercentage() {
        return currentSmokePercentage;
    }

        public void setRun(boolean run) {
        this.run = run;
    }
    
    public void setCurrentSmokePercentage(int currentSmokePercentage) {
        this.currentSmokePercentage = currentSmokePercentage;
    }

    public int getSmokeLuckyNumber() {
        return SmokeLuckyNumber;
    }

    static private int random(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random num = new Random();
        return num.nextInt((max - min) + 1) + min;
    }

    @Override
    public void Observe() {
        currentSmokePercentage = random(20, 40);
    }

    @Override
    public void run() {
        while (!run) {
            try {
                this.Observe();
                synchronized (file) {
                    if (currentSmokePercentage == SmokeLuckyNumber) {
                        file.write(sdf.format(d) + " " + currentSmokePercentage + " INTERRUPT GENERATED!!! Smoke \n");
                        Config.sendEvent(new SmokeSensorReading(currentSmokePercentage));
                        SmokeSensor.sleep(6000);
                        continue;
                    }
                    file.write(sdf.format(d) + " " + currentSmokePercentage + " Smoke \n");
                    SmokeSensor.sleep(1000);
                }
            } catch (InterruptedException | IOException ex) {
                Logger.getLogger(SmokeSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            Config.sendEvent(new SmokeSensorReading(currentSmokePercentage));
        }
    }

}
