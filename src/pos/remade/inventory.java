/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos.remade;

import business.TSI;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import pos.remade.POSScreenUser;

/**
 *
 * @author iasn
 */
public class inventory extends javax.swing.JFrame {
    private Component frame = null;
    /**
     * Creates new form inventory2
     */
    public inventory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        sCMM = new javax.swing.JTextField();
        sVBB1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sVBB2 = new javax.swing.JTextField();
        sBella = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sVBB3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sVBBss = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sTIFU = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sTIFU2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sTIFU2c = new javax.swing.JTextField();
        sPIATW = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SIIHY = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sCIATW = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sTGWTF = new javax.swing.JTextField();
        sBIATW = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sDIL = new javax.swing.JTextField();
        sSiatw = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sAll = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Snia = new javax.swing.JTextField();
        csvc = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel5.setText("VBAB1");

        sCMM.setText("0");

        sVBB1.setText("0");

        jLabel16.setText("Bella");

        jLabel6.setText("VBAB2");

        sVBB2.setText("0");

        sBella.setText("0");

        jLabel7.setText("VBAB3");

        sVBB3.setText("0");

        jLabel8.setText("VBABss");

        sVBBss.setText("0");

        jLabel9.setText("TIFU");

        sTIFU.setText("0");

        jLabel10.setText("TIFU2");

        sTIFU2.setText("0");

        jButton1.setText("Update inventory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("TIFU2 CLEAN");

        jLabel1.setText("PIATW");

        sTIFU2c.setText("0");

        sPIATW.setText("0");

        jLabel12.setText("IIHY");

        SIIHY.setText("0");

        jLabel2.setText("CIATW");

        sCIATW.setText("0");

        jLabel13.setText("TGWTF");

        jLabel3.setText("BIATW");

        sTGWTF.setText("0");

        sBIATW.setText("0");

        jLabel14.setText("DIL1");

        jLabel4.setText("SIATW (N/A)");

        sDIL.setText("0");

        sSiatw.setText("0");

        jLabel15.setText("CMM");

        jLabel18.setText("All boxes");

        sAll.setText("0");

        jButton2.setText("Update all");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setText("Nia");

        Snia.setText("0");

        csvc.setText("Complete import from CSV");
        csvc.setEnabled(false);
        csvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvcActionPerformed(evt);
            }
        });

        jMenu1.setText("Same number list");

        jMenuItem3.setText("5");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("10");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("15");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("20");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Import past entries (CSV)");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Show current entires");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(88, 88, 88)
                        .addComponent(jButton2)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(sVBB1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(sVBB2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(sTIFU, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(sTIFU2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(sVBB3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(sVBBss, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(sTIFU2c, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(SIIHY, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Snia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(csvc)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(sAll, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(sTGWTF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(sDIL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(sCMM, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(sBella, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addComponent(sPIATW, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(sCIATW, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(sBIATW, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(sSiatw, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(2, 2, 2)
                                        .addComponent(sPIATW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(2, 2, 2)
                                        .addComponent(sCIATW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(2, 2, 2)
                                        .addComponent(sBIATW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(2, 2, 2)
                                        .addComponent(sSiatw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(2, 2, 2)
                                        .addComponent(sVBB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(2, 2, 2)
                                        .addComponent(sVBB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(2, 2, 2)
                                        .addComponent(sVBB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)
                                .addComponent(sVBBss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)
                                .addComponent(sTIFU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(2, 2, 2)
                                .addComponent(sTIFU2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(2, 2, 2)
                                .addComponent(sTIFU2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(2, 2, 2)
                        .addComponent(SIIHY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(2, 2, 2)
                        .addComponent(sTGWTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(2, 2, 2)
                        .addComponent(sDIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(2, 2, 2)
                        .addComponent(sCMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(2, 2, 2)
                        .addComponent(sBella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(2, 2, 2)
                        .addComponent(Snia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(csvc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static int setoff;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                    TSI.INVENTORY_PIATW = Integer.parseInt(sPIATW.getText());
                  TSI.INVENTORY_CIATW = Integer.parseInt(sCIATW.getText());
               TSI.INVENTORY_BIATW = Integer.parseInt(sBIATW.getText());
               TSI.INVENTORY_VBAB1 = Integer.parseInt(sVBB1.getText());
              TSI.INVENTORY_VBAB2 = Integer.parseInt(sVBB2.getText());
                TSI.INVENTORY_VBAB3 = Integer.parseInt(sVBB3.getText());
              TSI.INVENTORY_VBABSS = Integer.parseInt(sVBBss.getText());
               TSI.INVENTORY_CMM= Integer.parseInt(sCMM.getText());
    
                TSI.INVENTORY_TGWTF = Integer.parseInt(sTGWTF.getText());
              TSI.INVENTORY_TIFY= Integer.parseInt(sTIFU.getText());
              TSI.INVENTORY_TIFY2 = Integer.parseInt(sTIFU2.getText());
            
                TSI.INVENTORY_IIHY = Integer.parseInt(SIIHY.getText());

               

        JOptionPane.showMessageDialog(frame, "Update complete! Error code 0");
new POSScreenUser().setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

               
               TSI.INVENTORY_PIATW = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_CIATW = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_BIATW = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_VBAB1 = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_VBAB2 =Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_VBAB3 = Integer.parseInt(sAll.getText());;
              TSI.INVENTORY_VBABSS =Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_CMM =Integer.parseInt(sAll.getText());;
         
               TSI.INVENTORY_TGWTF = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_TIFY = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_TIFY2 = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_IIHY = Integer.parseInt(sAll.getText());;



        JOptionPane.showMessageDialog(frame, "Update complete! Error code 0");
new POSScreenUser().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
      TSI.INVENTORY_PIATW = 10;
               TSI.INVENTORY_CIATW = 10;
               TSI.INVENTORY_BIATW = 10;
               TSI.INVENTORY_VBAB1 = 10;
               TSI.INVENTORY_VBAB2 =10;
               TSI.INVENTORY_VBAB3 = 10;
              TSI.INVENTORY_VBABSS =10;
               TSI.INVENTORY_CMM =10;
         
               TSI.INVENTORY_TGWTF = 10;
               TSI.INVENTORY_TIFY = 10;
               TSI.INVENTORY_TIFY2 = 10;
               TSI.INVENTORY_IIHY = 10;


               

        JOptionPane.showMessageDialog(frame, "Update complete! Error code 0");
new POSScreenUser().setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

     TSI.INVENTORY_PIATW = 5;
               TSI.INVENTORY_CIATW = 5;
               TSI.INVENTORY_BIATW = 5;
               TSI.INVENTORY_VBAB1 = 5;
               TSI.INVENTORY_VBAB2 =5;
               TSI.INVENTORY_VBAB3 = 5;
              TSI.INVENTORY_VBABSS =5;
               TSI.INVENTORY_CMM =5;
         
               TSI.INVENTORY_TGWTF = 5;
               TSI.INVENTORY_TIFY = 5;
               TSI.INVENTORY_TIFY2 = 5;
               TSI.INVENTORY_IIHY = 5;

System.out.println( TSI.INVENTORY_PIATW + ":" + 
    TSI.INVENTORY_CIATW + ":" + 
    TSI.INVENTORY_BIATW + ":" + 
    TSI.INVENTORY_VBAB1 + ":" + 
    TSI.INVENTORY_VBAB2 + ":" + 
    TSI.INVENTORY_VBAB3 + ":" + 
    TSI.INVENTORY_CMM + ":" + 
    TSI.INVENTORY_VBABSS + ":" + 
    TSI.INVENTORY_TIFY + ":" + 
    TSI.INVENTORY_TIFY2 + ":" + 
    TSI.INVENTORY_TGWTF + ":" + 
    TSI.INVENTORY_IIHY);
               

        JOptionPane.showMessageDialog(frame, "Update complete! Error code 0");
new POSScreenUser().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   
        TSI.INVENTORY_PIATW = 15;
               TSI.INVENTORY_CIATW = 15;
               TSI.INVENTORY_BIATW = 15;
               TSI.INVENTORY_VBAB1 = 15;
               TSI.INVENTORY_VBAB2 =15;
               TSI.INVENTORY_VBAB3 = 15;
              TSI.INVENTORY_VBABSS =15;
               TSI.INVENTORY_CMM =15;
         
               TSI.INVENTORY_TGWTF = 15;
               TSI.INVENTORY_TIFY = 15;
               TSI.INVENTORY_TIFY2 = 15;
               TSI.INVENTORY_IIHY = 15;


               

        JOptionPane.showMessageDialog(frame, "Update complete! Error code 0");
new POSScreenUser().setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
   
        TSI.INVENTORY_PIATW = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_CIATW = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_BIATW = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_VBAB1 = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_VBAB2 =Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_VBAB3 = Integer.parseInt(sAll.getText());;
              TSI.INVENTORY_VBABSS =Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_CMM =Integer.parseInt(sAll.getText());;
         
               TSI.INVENTORY_TGWTF = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_TIFY = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_TIFY2 = Integer.parseInt(sAll.getText());;
               TSI.INVENTORY_IIHY = Integer.parseInt(sAll.getText());;

               

        JOptionPane.showMessageDialog(frame, "Update complete! Error code 0");
        new POSScreenUser().setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        BufferedReader in = null;
        try {
            JFileChooser fc = new JFileChooser();
            FileNameExtensionFilter FNFilter = new FileNameExtensionFilter("Past stock count (CSV)", "CSV");
            fc.setFileFilter(FNFilter);
            File file = null;
            String path = "";
            int returnVal = fc.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
path = fc.getSelectedFile().toString();
        file = new File(path);  
                
                   System.out.println(path);
                   
            in = new BufferedReader(new FileReader(file));
            String s;
                        

            while ((s=in.readLine())!=null) {
       for (int i = 0; i < s.length(); i++) {
                String[] b = s.split(",");

                if (s.contains("PIATW")) {
                     TSI.INVENTORY_PIATW= Integer.parseInt(b[1]);
                } else if (s.contains("CIATW")) {
                    TSI.INVENTORY_CIATW = Integer.parseInt(b[1]);
                } else if (s.contains("BIATW")) {
                    TSI.INVENTORY_BIATW = Integer.parseInt(b[1]);
                } else if (s.contains("VBAB1")) {
                     TSI.INVENTORY_VBAB1 = Integer.parseInt(b[1]);
                } else if (s.contains("VBAB2")) {
                     TSI.INVENTORY_VBAB2 = Integer.parseInt(b[1]);
                } else if (s.contains("VBAB3")) {
                    TSI.INVENTORY_VBAB3 = Integer.parseInt(b[1]);
                } else if (s.contains("VBABSS")) {
                    TSI.INVENTORY_VBABSS = Integer.parseInt(b[1]);
                } else if (s.contains("CMM")) {
                     TSI.INVENTORY_CMM = Integer.parseInt(b[1]);
              
                } else if (s.contains("TGWTF")) {
                     TSI.INVENTORY_TGWTF = Integer.parseInt(b[1]);
                } else if (s.contains("TIFY")) {
                     TSI.INVENTORY_TIFY = Integer.parseInt(b[1]);
                } else if (s.contains("TIFU2")) {
                     TSI.INVENTORY_TIFY2 = Integer.parseInt(b[1]);
                    System.out.println(b[1] + "for TIFY2");
                
                } else if (s.contains("IIHY")) {
                    TSI.INVENTORY_IIHY = Integer.parseInt(b[1]);
                }  
                
                setoff = 2;
                csvc.setEnabled(true);
               break; 
            }
            
            }
            }
            
            
            
            
            
// TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void csvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvcActionPerformed
JOptionPane.showMessageDialog(frame, "Update complete! Have fun!");
        new POSScreenUser().setVisible(true);
        setVisible(false); 
       // TODO add your handling code here:
    }//GEN-LAST:event_csvcActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SIIHY;
    private javax.swing.JTextField Snia;
    private javax.swing.JButton csvc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JTextField sAll;
    private javax.swing.JTextField sBIATW;
    private javax.swing.JTextField sBella;
    private javax.swing.JTextField sCIATW;
    private javax.swing.JTextField sCMM;
    private javax.swing.JTextField sDIL;
    private javax.swing.JTextField sPIATW;
    private javax.swing.JTextField sSiatw;
    private javax.swing.JTextField sTGWTF;
    private javax.swing.JTextField sTIFU;
    private javax.swing.JTextField sTIFU2;
    private javax.swing.JTextField sTIFU2c;
    private javax.swing.JTextField sVBB1;
    private javax.swing.JTextField sVBB2;
    private javax.swing.JTextField sVBB3;
    private javax.swing.JTextField sVBBss;
    // End of variables declaration//GEN-END:variables

  
     }
    
        


