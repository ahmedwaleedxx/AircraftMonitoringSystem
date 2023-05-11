/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author ahmedwaleed
 */
public interface Dial_Interface {

    public void DetectPercentage();

    public int getGaugeSize();

    public void setGaugeSize(int gaugeSize);

    public Color getColor1();

    public void setColor1(Color color1);

    public Color getColor2();

    public void setColor2(Color color2);

    public int getValue();

    public void setValue(int value);

    public int getMaximum();

    public void setMaximum(int maximum);

    void drawText(Graphics2D g2, float x, float y, float size);

    public float getAngleOfValues();

    public int getValueFixed();

    public void setValueWithAnimation(int value);

}
