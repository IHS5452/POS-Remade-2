package pos.remade;

import business.TSI;
import java.awt.Component;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static pos.remade.POSScreenUser.table;
import java.io.File;
import java.util.ArrayList;
import static pos.remade.POSScreenUser.table;
import static pos.remade.payment2.fn;
import static pos.remade.payment2.ln;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iasn
 */
public class payment2 extends javax.swing.JFrame {

    /**
     * Creates new form payment2
     */
        Component frame = null;


        
    public payment2() {
        initComponents();
            POSScreenUser pos2 = new POSScreenUser();

           double price43 = Math.round(TSI.BILL_TOTAL * 1000.0) / 1000.0;
                

  String krew2 = String.valueOf(price43);
  
total.setText(krew2);

    }
double totalSales;
ArrayList<String> names = new ArrayList<String>();
File f;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        entered = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton2.setText("Tender Without receipt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Tender With receipt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Cash given");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Total due");

        total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        total.setText("X.XX");

        jLabel3.setText("Last name");

        jLabel4.setText("First name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(total))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entered, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1))
                        .addComponent(jButton2)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(entered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            POSScreenUser pos2 = new POSScreenUser();
        pos2.allSales += TSI.BILL_TOTAL;
addtocsv();

        wihtout p = new wihtout();
        p.start();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BufferedWriter pw = null;
            try {
                POSScreenUser pos2 = new POSScreenUser();
                pos2.allSales += TSI.BILL_TOTAL;
                pw = new BufferedWriter(new FileWriter("names.csv", true));
                Object[] row = {fn.getText() + " " + ln.getText()};
                        String newrow = String.valueOf(row) + ".txt";
                pw.write(newrow);
                pw.close();
                                names.add(fn.getText() + " " + ln.getText() + "\n");

                addtocsv();
                with p2 = new with();
                p2.start();
            } catch (IOException ex) {
                Logger.getLogger(payment2.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(payment2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        

        }

        private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
            new adminMenu().setVisible(true);        // TODO add your handling code here:
            // TODO add your handling code here:
        }

        private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
            pos.remade.POSScreenUser pos = new pos.remade.POSScreenUser();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            model.setRowCount(0);
            TSI.BILL_TOTAL = 0.00;
            pos.price.setText("0.00");
            model.fireTableDataChanged();
            pos.table.repaint();
            // TODO
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(payment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new payment2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField entered;
    public static javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextField ln;
    private static javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables


void addtocsv() {
         DefaultTableModel model  = (DefaultTableModel) table.getModel();
        BufferedWriter pw = null;
                try {
                    pw = new BufferedWriter(new FileWriter("names.csv", true));
                    Object[] row = {fn.getText()+ " " + ln.getText() + "\n"};
                    String newrow = row.toString();
                    pw.write(newrow);
                    pw.close();
                    model.addRow(row);
                    model.fireTableDataChanged();
                    
                    // TODO add your handling code here:
                } catch (IOException ex) {
                    Logger.getLogger(payment2.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        pw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(payment2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
     }
    
    
    class with extends Thread {
        public void run() {
                POSScreenUser pos2 = new POSScreenUser();

pos.remade.POSScreenUser pos = new pos.remade.POSScreenUser();
adminMenu admin = new adminMenu();
if (entered.getText().equals("")) {
    JOptionPane.showMessageDialog(frame, "Please enter the ammount you were given!");
    return;
}
           double price2 = Double.parseDouble(entered.getText());
        Double price4 = Math.round(price2 * 1000.0) / 1000.0;

            double OM3 = price4 - TSI.BILL_TOTAL;
                    double change = Math.round(OM3 * 1000.0) / 1000.0;
        Component frame = null;
        JOptionPane.showMessageDialog(frame, "Change: " + change);
totalSales = totalSales + pos.change2;

createfile cf = new createfile();
        cf.start();


              setVisible(false);  
              System.out.println(totalSales);
                                              new POSScreenUser().setVisible(true);
        }
    }
    


    class wihtout extends Thread {
        public void run() {
                POSScreenUser pos2 = new POSScreenUser();

adminMenu admin = new adminMenu();
if (entered.getText().equals(null)) {
    JOptionPane.showMessageDialog(frame, "Please enter the ammount you were given!");
    return;
}
           double price2 = Double.parseDouble(entered.getText());
        Double price4 = Math.round(price2 * 1000.0) / 1000.0;
        
            double OM3 = price4 - TSI.BILL_TOTAL;
                    double change = Math.round(OM3 * 1000.0) / 1000.0;
        Component frame = null;
        JOptionPane.showMessageDialog(frame, "Change: " + change);
totalSales = totalSales + pos2.change2;
        


                                                            TSI.BILL_TOTAL = 0.00;

              setVisible(false);  
              System.out.println(totalSales);
                                              new POSScreenUser().setVisible(true);
        }
}

class createfile extends Thread {
        public void run() {

            try {
                POSScreenUser pos2 = new POSScreenUser();
                double price2 = Double.parseDouble(entered.getText());
                Double price4 = Math.round(price2 * 1000.0) / 1000.0;
                double totalOf = price4 - TSI.BILL_TOTAL;
                double change = Math.round(totalOf * 1000.0) / 1000.0;
                String contentForReceipt ="IAN'S BOOK SIGNING RECEIPT  \r\n \r\n Total: $" +TSI.BILL_TOTAL
                        + "\r\n" + "ammount given: $" + entered.getText() + " \r\n Change: " + change + "\r\n \r\n Thank you for your support!";
                String nameoffile = fn.getText()+ " " + ln.getText() + ".txt";
                f = new File(fn.getText()+ " " + ln.getText() + ".txt");

              FileWriter writer = new FileWriter(f);
          writer.write(contentForReceipt);
          writer.close();
          Desktop.getDesktop().print(f);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(payment2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(payment2.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
               
            }
}
}

        
        }



