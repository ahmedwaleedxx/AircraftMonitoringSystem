/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.swing.JButton;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Fahmy
 */
public class Smoke_Lamp extends JButton implements Lamp_Interface {

    InputStream input;

    public Smoke_Lamp() {
        this.setBackground(Color.GREEN);
    }

    @Override
    public void WarningLightUp(int value) {
        boolean v;
        switch (value) {
            case 1:
                v = true;
                break;
            default:
                v = false;
                break;
        }

        if (v == true) {
            this.setBackground(Color.RED);
            try {
                input = new FileInputStream(new File("src/Sounds/beep4.wav"));
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
