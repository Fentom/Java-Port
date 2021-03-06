/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis.applicCapitainerie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import mainClasses.Bateau;
import mainClasses.Equipage;

/**
 *
 * @author Jija
 */
public class DialogListing extends java.awt.Dialog {
    public String boat_name;
    public String person_name;
        
    private DefaultListModel model = new DefaultListModel();
    private String typeListing;
    /**
     * Creates new form DialogListBoat
     */
    public DialogListing(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        jList.setModel(model);
    }
    
    public DialogListing(java.awt.Frame parent, boolean modal, ArrayList<Bateau> list) {
        this(parent, modal);
        
        typeListing = "Boat";
        
        Collections.sort(list);
        
        for (Bateau item : list) {
            model.addElement(item.getNom() + "-" + item.getPortAttache());
        }
    }
    
    public DialogListing(java.awt.Frame parent, boolean modal, Equipage crew) {
        this(parent, modal);
        
        typeListing = "Crew";
        
        if(crew != null) {
            model.addElement(crew.getCapitaine());
            model.addElement(crew.getSecond());

            for (int i = 0; i < crew.getNombreMarin(); i++) {
                model.addElement(crew.getMarin(i));
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList();
        jButtonOk = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jScrollPane1.setViewportView(jList);

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonOk)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        if(model.getSize() != 0) {
            if(typeListing.equals("Boat")) {
                String split[] = jList.getSelectedValue().toString().split("-");
                boat_name = split[0];
            }
            else if(typeListing.equals("Crew")) {
                String split[] = jList.getSelectedValue().toString().split("-");
                person_name = split[1];
            }
        }
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogListing dialog = new DialogListing(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOk;
    private javax.swing.JList jList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
