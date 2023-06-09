/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import Models.*;
import javax.swing.JLabel;

/**
 *
 * @author ahmedwaleed
 */
public class View_Plane extends javax.swing.JFrame {

    /**
     * Creates new form ViewData
     */
    public View_Plane() {
        initComponents();
    }

    public Fuel_Dial getFuelDial() {
        return fuel_Dial;
    }

    public Fuel_Lamp getFuelLamp() {
        return fuelLamp;
    }

    public Pressure_Dial getPressureDial() {
        return pressure_Dial;
    }

    public Pressure_Lamp getPressureLamp() {
        return pressureLamp;
    }

    public Smoke_Lamp getSmokeLamp() {
        return smokeLamp;
    }

    public Temp_Dial getTempDial() {
        return temp_Dial;
    }

    public Temp_Lamp getTempLamp() {
        return tempLamp;
    }

    public JLabel getFuellbl() {
        return fuellbl;
    }

    public JLabel getPressurelbl() {
        return pressurelbl;
    }

    public JLabel getTemplbl() {
        return templbl;
    }

    public JButton getFuelbtn() {
        return fuelbtn;
    }

    public JButton getPressurebtn() {
        return pressurebtn;
    }

    public JButton getTempbtn() {
        return tempbtn;
    }

        public JButton getSmokeTestbtn() {
        return smoketestbtn;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tempLamp = new Temp_Lamp();
        pressureLamp = new Pressure_Lamp();
        fuelLamp = new Fuel_Lamp();
        smokeLamp = new Smoke_Lamp();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fuel_Dial = new Models.Fuel_Dial();
        pressure_Dial = new Models.Pressure_Dial();
        temp_Dial = new Models.Temp_Dial();
        tempbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pressurelbl = new javax.swing.JLabel();
        templbl = new javax.swing.JLabel();
        fuellbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fuelbtn = new javax.swing.JButton();
        smoketestbtn = new javax.swing.JButton();
        pressurebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Plane");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 200, 40));

        tempLamp.setBackground(new java.awt.Color(0, 0, 0));
        tempLamp.setForeground(new java.awt.Color(255, 255, 255));
        tempLamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/TemperatureIcon.png"))); // NOI18N
        tempLamp.setBorder(null);
        tempLamp.setEnabled(false);
        tempLamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempLampActionPerformed(evt);
            }
        });
        jPanel1.add(tempLamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 130, 120));

        pressureLamp.setBackground(new java.awt.Color(0, 0, 0));
        pressureLamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PressureIcon.png"))); // NOI18N
        pressureLamp.setBorder(null);
        pressureLamp.setEnabled(false);
        pressureLamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressureLampActionPerformed(evt);
            }
        });
        jPanel1.add(pressureLamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 130, 120));

        fuelLamp.setBackground(new java.awt.Color(0, 0, 0));
        fuelLamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/FuelIcon.png"))); // NOI18N
        fuelLamp.setBorder(null);
        fuelLamp.setEnabled(false);
        jPanel1.add(fuelLamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 130, 120));

        smokeLamp.setBackground(new java.awt.Color(0, 0, 0));
        smokeLamp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SmokeIcon.png"))); // NOI18N
        smokeLamp.setBorder(null);
        smokeLamp.setEnabled(false);
        smokeLamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smokeLampActionPerformed(evt);
            }
        });
        jPanel1.add(smokeLamp, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 130, 120));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fuel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 100, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pressure");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 120, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Temperature");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 140, 20));

        fuel_Dial.setForeground(new java.awt.Color(0, 0, 0));
        fuel_Dial.setColor1(new java.awt.Color(204, 0, 51));
        fuel_Dial.setColor2(new java.awt.Color(0, 0, 153));
        jPanel1.add(fuel_Dial, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 170, 180));

        pressure_Dial.setForeground(new java.awt.Color(0, 0, 0));
        pressure_Dial.setColor1(new java.awt.Color(0, 0, 102));
        pressure_Dial.setColor2(new java.awt.Color(0, 204, 51));
        jPanel1.add(pressure_Dial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 180));

        temp_Dial.setForeground(new java.awt.Color(0, 0, 0));
        temp_Dial.setColor2(new java.awt.Color(204, 0, 0));
        jPanel1.add(temp_Dial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 180));

        tempbtn.setBackground(new java.awt.Color(0, 0, 0));
        tempbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Temperature.png"))); // NOI18N
        tempbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 0, new java.awt.Color(255, 0, 0)));
        tempbtn.setOpaque(false);
        jPanel1.add(tempbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 110, 80));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fuel");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 100, 40));

        jLabel11.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pressure");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, 40));

        jLabel12.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Temperature");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 260, 40));

        pressurelbl.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        pressurelbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(pressurelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 170, 40));

        templbl.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        templbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(templbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 200, 40));

        fuellbl.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        fuellbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(fuellbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 160, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CRT_bg.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 700, 610));

        fuelbtn.setBackground(new java.awt.Color(0, 0, 0));
        fuelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fuel.png"))); // NOI18N
        fuelbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 0, new java.awt.Color(0, 0, 204)));
        fuelbtn.setOpaque(false);
        jPanel1.add(fuelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 110, 80));

        smoketestbtn.setBackground(new java.awt.Color(0, 0, 0));
        smoketestbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Fire.png"))); // NOI18N
        smoketestbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 1, 5, 1, new java.awt.Color(255, 153, 0)));
        smoketestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smoketestbtnActionPerformed(evt);
            }
        });
        jPanel1.add(smoketestbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 110, 80));

        pressurebtn.setBackground(new java.awt.Color(0, 0, 0));
        pressurebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Pressure.png"))); // NOI18N
        pressurebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 5, 0, new java.awt.Color(0, 153, 0)));
        pressurebtn.setOpaque(false);
        jPanel1.add(pressurebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 110, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tempLampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempLampActionPerformed

    }//GEN-LAST:event_tempLampActionPerformed

    private void pressureLampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressureLampActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pressureLampActionPerformed

    private void smokeLampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smokeLampActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smokeLampActionPerformed

    private void smoketestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smoketestbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smoketestbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /*
    private javax.swing.JButton fuelLamp;
    */
    private Models.Fuel_Lamp fuelLamp;
    private Models.Fuel_Dial fuel_Dial;
    private javax.swing.JButton fuelbtn;
    private javax.swing.JLabel fuellbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    /*
    private javax.swing.JButton pressureLamp;
    */
    private Models.Pressure_Lamp pressureLamp;
    private Models.Pressure_Dial pressure_Dial;
    private javax.swing.JButton pressurebtn;
    private javax.swing.JLabel pressurelbl;
    /*
    private javax.swing.JButton smokeLamp;
    */
    private Models.Smoke_Lamp smokeLamp;
    private javax.swing.JButton smoketestbtn;
    /*
    private javax.swing.JButton tempLamp;
    */
    private Models.Temp_Lamp tempLamp;
    private Models.Temp_Dial temp_Dial;
    private javax.swing.JButton tempbtn;
    private javax.swing.JLabel templbl;
    // End of variables declaration//GEN-END:variables
}
