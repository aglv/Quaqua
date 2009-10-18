/*
 * DefaultButtonTest14.java
 *
 * Created on July 6, 2005, 7:31 PM
 */

package test;

import ch.randelshofer.quaqua.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.*;
/**
 *
 * @author  werni
 */
public class DefaultButtonTest14 extends javax.swing.JFrame {
    
    /**
     * Creates new form DefaultButtonTest14
     */
    public DefaultButtonTest14() {
        initComponents();
        getRootPane().setDefaultButton(button);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        label = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        textField2 = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label.setText("Label:");
        getContentPane().add(label, new java.awt.GridBagConstraints());

        textField.setColumns(10);
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(textField, gridBagConstraints);

        textField2.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(textField2, gridBagConstraints);

        button.setText("jButton1");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(button, gridBagConstraints);

        pack();
    }//GEN-END:initComponents

    private void buttonPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPerformed
        // TODO add your handling code here:
          label.setText("Button "+NumberFormat.getIntegerInstance().format(System.currentTimeMillis()));
    }//GEN-LAST:event_buttonPerformed

    private void textFieldPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPerformed
        // TODO add your handling code here:
        label.setText("TextField "+NumberFormat.getIntegerInstance().format(System.currentTimeMillis()));
    }//GEN-LAST:event_textFieldPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(QuaquaManager.getLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new DefaultButtonTest14().setVisible(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JLabel label;
    private javax.swing.JTextField textField;
    private javax.swing.JTextField textField2;
    // End of variables declaration//GEN-END:variables
    
}
