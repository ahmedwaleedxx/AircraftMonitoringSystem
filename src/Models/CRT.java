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
public class CRT {

    public CRT screen;
    public FuelSensor fuelSensor;
    public PressureSensor pressureSensor;
    public TemperatureSensor temperatureSensor;
    public SmokeSensor smokeSensor;
    public View_Plane gui;

    public CRT(FuelSensor fuelSensor, PressureSensor pressureSensor, TemperatureSensor temperatureSensor, SmokeSensor smokeSensor, View_Plane gui) {
        this.fuelSensor = fuelSensor;
        this.pressureSensor = pressureSensor;
        this.temperatureSensor = temperatureSensor;
        this.smokeSensor = smokeSensor;
        this.gui = gui;
    }

    public void MeasureEngineTemperature(int temp) {
        gui.getTemplbl().setText(String.valueOf(gui.getTempDial().getValue()));
    }

    public void MeasurePressureRateOfChange(int pressure) {
        gui.getPressurelbl().setText(String.valueOf(gui.getPressureDial().getValue()));
    }

    public void MeasureFuelRateOfConsumption(int fuel) {
        gui.getFuellbl().setText(String.valueOf(gui.getFuelDial().getValue()));
    }
}
