/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Events;

/**
 *
 * @author infolos
 */
public class FuelSensorReading {

    private final int percent;
    private final int ConsumptionRate;

    public FuelSensorReading(int percent, int ConsumptionRate) {
        this.percent = percent;
        this.ConsumptionRate = ConsumptionRate;
    }

    public int getPercent() {
        return percent;
    }

    public int getConsumptionRate() {
        return ConsumptionRate;
    }

}
