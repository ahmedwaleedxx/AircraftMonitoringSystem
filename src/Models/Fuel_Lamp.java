/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.awt.Color;
import java.io.*;
import javax.swing.JButton;
import sun.audio.*;

/**
 *
 * @author Fahmy
 */
public class Fuel_Lamp extends JButton implements Lamp_Interface {

    InputStream input;

    public Fuel_Lamp() {
        this.setBackground(Color.GREEN);
    }

    @Override
    public void WarningLightUp(int value) {
        if (value < 30) {
            this.setBackground(Color.RED);
            try {
                input = new FileInputStream(new File("src/Sounds/beep1.wav"));
                AudioStream aud1 = new AudioStream(input);
                AudioPlayer.player.start(aud1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            this.setBackground(Color.GREEN);
        }

    }
}
