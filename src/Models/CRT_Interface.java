/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author ahmedwaleed
 */
public interface CRT_Interface {

    public void MeasureEngineTemperature(int temp);

    public void MeasurePressureRateOfChange(int pressure);

    public void MeasureFuelRateOfConsumption(int fuel);
}
