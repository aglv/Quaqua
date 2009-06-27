/*
 * @(#)EditableComboBoxTest.java 
 *
 * Copyright (c) 2005-2009 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * All rights reserved.
 *
 * The copyright of this software is owned by Werner Randelshofer. 
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * Werner Randelshofer. For details see accompanying license terms. 
 */

package test;

import ch.randelshofer.quaqua.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * EditableComboBoxTest.
 *
 * @author  Werner Randelshofer
 * @version $Id$
 */
public class EditableComboBoxTest extends javax.swing.JPanel {
    private static class ColorIcon implements Icon {
        private Color color = Color.white;
        
        public void setColor(Color newValue) {
            color = newValue;
        }
        
        public Color getColor() {
            return color;
        }
        
        
        public int getIconHeight() {
            return 12;
        }
        
        public int getIconWidth() {
            return 24;
        }
        
        public void paintIcon(Component c, Graphics g, int x, int y) {
            if (color != null) {
                g.setColor(color);
                g.fillRect(x, y, getIconWidth(), getIconHeight());
                g.setColor(color.darker());
                g.drawRect(x, y, getIconWidth() - 1, getIconHeight() - 1);
            }
        }
        
    }
    
    private static class ColorComboCellRenderer extends DefaultListCellRenderer {
        private ColorIcon colorIcon = new ColorIcon();
        public ColorComboCellRenderer() {
            setIconTextGap(6);
        }
        public Component getListCellRendererComponent(
                JList list,
                Object value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
            JLabel l = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof Color) {
                Color color = (Color) value;
                colorIcon.setColor(color);
                l.setIcon(colorIcon);
                l.setText(color.getRed()+","+color.getGreen()+","+color.getBlue());
            } else {
                l.setIcon(null);
            }
            return l;
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            /*
            g.setColor(new Color(0xafff00f0,true));
           // g.fillRect(0,0,getWidth(),getHeight());
            Insets i = getInsets();
            System.out.println("ColorComboCellRenderer insets:"+i);
            g.fillRect(i.left,i.top,getWidth()-i.left-i.right,getHeight()-i.top-i.bottom);
             **/
        }
    }
    
    
    
    /** Creates new form. */
    public EditableComboBoxTest() {
        initComponents();
        
        String[] items = new String[100];
        for (int i=0; i < items.length; i++) {
            items[i] = "Item "+(i+1);
        }
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(items));
        
        jComboBox8.putClientProperty("JComboBox.isTableCellEditor",Boolean.TRUE);
    }
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(QuaquaManager.getLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame f = new JFrame("Quaqua ComboBox Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new ComboBoxTest());
        ((JComponent) f.getContentPane()).setBorder(new EmptyBorder(9,17,17,17));
        f.pack();
        f.setVisible(true);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();

        setLayout(new java.awt.GridBagLayout());

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jComboBox1, gridBagConstraints);

        jLabel1.setText("Editable");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel1, gridBagConstraints);

        jComboBox14.setEditable(true);
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(jComboBox14, gridBagConstraints);

        jComboBox3.setEditable(true);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6" }));
        jComboBox3.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(jComboBox3, gridBagConstraints);

        jLabel3.setText("Disabled");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 20, 0, 0);
        add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        add(jSeparator1, gridBagConstraints);

        jComboBox4.setEditable(true);
        jComboBox4.setFont(new java.awt.Font("Lucida Grande", 0, 11));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jComboBox4, gridBagConstraints);

        jLabel4.setText("Small Size");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel4, gridBagConstraints);

        jComboBox15.setEditable(true);
        jComboBox15.setFont(new java.awt.Font("Lucida Grande", 0, 11));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(jComboBox15, gridBagConstraints);

        jComboBox6.setEditable(true);
        jComboBox6.setFont(new java.awt.Font("Lucida Grande", 0, 11));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6" }));
        jComboBox6.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(jComboBox6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 12, 0);
        add(jSeparator2, gridBagConstraints);

        jComboBox7.setEditable(true);
        jComboBox7.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(jComboBox7, gridBagConstraints);

        jLabel5.setText("Large Font");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(jLabel5, gridBagConstraints);

        jComboBox8.setEditable(true);
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(jComboBox8, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents
    
    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        //System.out.println("EditableComboBoxTest.comboBoxActionPerformed:"+evt);
    }//GEN-LAST:event_comboBoxActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
