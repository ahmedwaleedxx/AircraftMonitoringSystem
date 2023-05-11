/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Esper;

import Models.*;
import java.io.IOException;
import org.apache.log4j.*;

/**
 *
 * @author ahmedwaleed
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Logger.getRootLogger().setLevel(Level.OFF);

        // Register events
        Config.registerEvents();

        final Plane plane = new Plane();
        Config.createStatement("select percent from FuelSensorReading")
                .setSubscriber(new Object() {
                    public void update(int fuel) throws IOException {
                        plane.Fuel_Signal(fuel);
                    }
                });

        Config.createStatement("select temperature from TemperatureSensorReading")
                .setSubscriber(new Object() {
                    public void update(int temp) throws IOException {
                        plane.Temp_Signal(temp);
                    }
                });
        Config.createStatement("select smokePercentage from SmokeSensorReading")
                .setSubscriber(new Object() {
                    public void update(int smoke) throws IOException {
                        plane.Smoke_Signal(smoke);
                    }
                });
        Config.createStatement("select pressurepercent from PressureSensorReading")
                .setSubscriber(new Object() {
                    public void update(int smoke) throws IOException {
                        plane.Pressure_Signal(smoke);
                    }
                });

//        InputStream input;
//        try {
//input = new FileInputStream(new File("src/Sounds/Waleedoo.wav"));
//            input = new FileInputStream(new File("src/Sounds/farouk.wav"));
//            AudioStream aud1 = new AudioStream(input);
//            AudioPlayer.player.start(aud1);
//            input = new FileInputStream(new File("src/Sounds/beep1.wav"));
//            AudioStream aud1 = new AudioStream(input);
//            AudioPlayer.player.start(aud1);
//            Thread.sleep(2000);
//            input = new FileInputStream(new File("src/Sounds/beep2.wav"));
//            AudioStream aud2 = new AudioStream(input);
//            AudioPlayer.player.start(aud2);
//            Thread.sleep(2000);
//            input = new FileInputStream(new File("src/Sounds/beep3.wav"));
//            AudioStream aud3 = new AudioStream(input);
//            AudioPlayer.player.start(aud3);
//            Thread.sleep(2000);
//            input = new FileInputStream(new File("src/Sounds/beep4.wav"));
//            AudioStream aud4 = new AudioStream(input);
//            AudioPlayer.player.start(aud4);
//            Thread.sleep(2000);
//        } catch (Exception e) {
//        }
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        tk.beep();
//        View_Plane planegui = new View_Plane();
//        planegui.setVisible(true);
//        Pressure_Dial pd = new Pressure_Dial(planegui);
//        Fuel_Dial fd = new Fuel_Dial(planegui);
//        Temp_Dial td = new Temp_Dial(planegui);
    }
}
