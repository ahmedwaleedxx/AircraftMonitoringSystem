/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import View.View_Plane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Random;

/**
 *
 * @author ahmedwaleed
 */
public class Plane {

    View_Plane gui;
    boolean state = false;
    Fuel_Dial fueldial;
    Pressure_Dial pressuredial;
    Temp_Dial tempdial;
    SmokeSensor smokesensor;
    PressureSensor pressureSensor;
    TemperatureSensor tempsensor;
    FuelSensor fuelSensor;
    Keyboard keyboard;
    int currentTemp;
    int currentFuel;
    int currentPressure;
    boolean fuelisClicked = false;
    boolean tempisClicked = false;
    boolean pressureisClicked = false;
    boolean smokeisClicked = false;
    int smokeLuckyNum = 40;
    Fuel_Lamp fuellamp;
    Pressure_Lamp pressurelamp;
    Smoke_Lamp smokelamp;
    Temp_Lamp templamp;
    boolean isRunning;
    BufferedWriter wholeFile;

    public Plane() throws IOException {
        gui = new View_Plane();
        gui.setLocationRelativeTo(gui);
        gui.setVisible(true);
        fueldial = new Fuel_Dial();
        pressuredial = new Pressure_Dial();
        tempdial = new Temp_Dial();
        wholeFile = new BufferedWriter(new FileWriter("Plane_Readings.txt"));
        smokesensor = new SmokeSensor(smokeLuckyNum, 21, wholeFile);
        pressureSensor = new PressureSensor(30, wholeFile);
        tempsensor = new TemperatureSensor(10, wholeFile);
        fuelSensor = new FuelSensor(100, 1, wholeFile);
        keyboard = new Keyboard(fuelSensor, pressureSensor, tempsensor, smokesensor, gui);
        templamp = new Temp_Lamp();
        pressurelamp = new Pressure_Lamp();
        smokelamp = new Smoke_Lamp();

        fuelSensor.start();
        smokesensor.start();
        pressureSensor.start();
        tempsensor.start();

        gui.getFuelbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!fuelisClicked) {
                    fuelisClicked = true;
                } else {
                    fuelisClicked = false;
                    gui.getFuellbl().setText("");
                }
            }
        });

        gui.getPressurebtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pressureisClicked) {
                    pressureisClicked = true;
                } else {
                    pressureisClicked = false;
                    gui.getPressurelbl().setText("");
                }
            }
        });

        gui.getTempbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tempisClicked) {
                    tempisClicked = true;
                } else {
                    tempisClicked = false;
                    gui.getTemplbl().setText("");
                }
            }
        });

        gui.getSmokeTestbtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                keyboard.SimulateSmokeDetection();
            }
        });

    }

    public SmokeSensor getSmokesensor() {
        return smokesensor;
    }

    public PressureSensor getPressureSensor() {
        return pressureSensor;
    }

    public TemperatureSensor getTempsensor() {
        return tempsensor;
    }

    public FuelSensor getFuelSensor() {
        return fuelSensor;
    }

    public View_Plane getGui() {
        return gui;
    }

    public void Stop_Sensors() {

        gui.getFuelDial().setValueWithAnimation(0);
        gui.getPressureDial().setValueWithAnimation(0);
        gui.getTempDial().setValueWithAnimation(0);
    }

    public void Fuel_Signal(int fuelPercentage) throws IOException {
        currentFuel = fuelPercentage;
        gui.getFuelDial().setValueWithAnimation(fuelPercentage);
        gui.getFuelLamp().WarningLightUp(fuelPercentage);
        if (fuelPercentage <= 0) {
            pressureSensor.setCurrentPressure(0);
            tempsensor.setCurrentTemp(0);
            pressureSensor.setRun(true);
            tempsensor.setRun(true);
            smokesensor.setRun(true);
            fuelSensor.setRun(true);

            Stop_Sensors();
            gui.getTempLamp().WarningLightUp(100);
            gui.getFuellbl().setText("0");

            wholeFile.close();
        }
        if (fuelisClicked == true) {
            keyboard.MeasureFuelRateOfConsumption(currentFuel);
        }
    }

    public void Temp_Signal(int temp) {
        gui.getTempDial().setValueWithAnimation(temp);
        gui.getTempLamp().WarningLightUp(temp);
        if (tempisClicked == true) {
            keyboard.MeasureEngineTemperature(currentTemp);
        }
    }

    public void Smoke_Signal(int SmokeDetected) {
        int smoke;
        if (SmokeDetected == smokeLuckyNum) {
            smoke = 1;
        } else {
            smoke = 0;
        }
        gui.getSmokeLamp().WarningLightUp(smoke);
    }

    public void Pressure_Signal(int pressure) {
        gui.getPressureDial().setValueWithAnimation(pressure);
        gui.getPressureLamp().WarningLightUp(pressure);
        if (pressureisClicked == true) {
            keyboard.MeasurePressureRateOfChange(pressure);
        }
        /*---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    }
}
