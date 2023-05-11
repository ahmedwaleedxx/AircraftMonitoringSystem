/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import View.View_Plane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author ahmedwaleed
 */
public class Keyboard {

    public CRT screen;
    public FuelSensor fuelSensor;
    public PressureSensor pressureSensor;
    public TemperatureSensor temperatureSensor;
    public SmokeSensor smokeSensor;
    public View_Plane gui;

    
    public Keyboard(FuelSensor fuelSensor, PressureSensor pressureSensor, TemperatureSensor temperatureSensor, SmokeSensor smokeSensor, View_Plane gui) {
        this.fuelSensor = fuelSensor;
        this.pressureSensor = pressureSensor;
        this.temperatureSensor = temperatureSensor;
        this.smokeSensor = smokeSensor;
        this.gui = gui;
        screen = new CRT(fuelSensor, pressureSensor, temperatureSensor, smokeSensor, gui);
    }

    public void MeasureEngineTemperature(int temp) {
        screen.MeasureEngineTemperature(temp);
    }

    public void MeasurePressureRateOfChange(int pressure) {
        screen.MeasurePressureRateOfChange(pressure);
    }

    public void MeasureFuelRateOfConsumption(int fuel) {
        screen.MeasureFuelRateOfConsumption(fuel);
    }

    public void SimulateSmokeDetection() {
        smokeSensor.setCurrentSmokePercentage(smokeSensor.getSmokeLuckyNumber());
    }

}
