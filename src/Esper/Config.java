/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esper;

import Events.*;
import com.espertech.esper.client.*;

/**
 *
 * @author ahmedwaleed
 */
public class Config {

    private static final EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider();

    public static void registerEvents() {
        engine.getEPAdministrator().getConfiguration().addEventType(SmokeSensorReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(TemperatureSensorReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(FuelSensorReading.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PressureSensorReading.class);
        System.out.println("Events Successfully Registered.");
    }

    public static EPStatement createStatement(String s) {
        EPStatement result = engine.getEPAdministrator().createEPL(s);
        System.out.println("EPL Statement Successfully Created.");
        return result;
    }

    public static void sendEvent(Object o) {
        engine.getEPRuntime().sendEvent(o);
    }
}
