/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Metodos.Cargar_Combobox;
import Metodos.Pool;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIFAP
 */
public class Formulario_Combox extends javax.swing.JFrame {

    Cargar_Combobox metodos_cargarcombobox = new Cargar_Combobox();
    
    
    public Formulario_Combox() {
        initComponents();
        
        //Cargamos el boton con la información de la BD
        
        metodos_cargarcombobox.consultar_apps(BoxAplicaciones);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtAplicacion = new javax.swing.JTextField();
        BoxAplicaciones = new javax.swing.JComboBox();
        BoxVersiones = new javax.swing.JComboBox();
        TxtVersion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaCiclo = new javax.swing.JTextArea();
        TxtCiclo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipo QA");
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusTraversalPolicyProvider(true);

        TxtAplicacion.setBackground(new java.awt.Color(153, 204, 255));
        TxtAplicacion.setDocument(TxtAplicacion.getDocument());
        TxtAplicacion.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        TxtAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAplicacionActionPerformed(evt);
            }
        });

        BoxAplicaciones.setBackground(new java.awt.Color(204, 204, 255));
        BoxAplicaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Android", "IOS" }));
        BoxAplicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxAplicacionesActionPerformed(evt);
            }
        });

        BoxVersiones.setBackground(new java.awt.Color(204, 204, 255));
        BoxVersiones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VA-10.0", "VA-9.0", "VA-8.1", "VA-7.1.2", "VA-5.0", "VA-4.4.4", "_______", "VIOS-2.10.11", "VIOS-2.9.13", "VIOS-2.7.1", "VIOS-2.6.10", "VIOS-2.5.4", "VIOS-2.4.6" }));
        BoxVersiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxVersionesActionPerformed(evt);
            }
        });

        TxtVersion.setBackground(new java.awt.Color(153, 204, 255));
        TxtVersion.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        TxtVersion.setText("Versión");
        TxtVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtVersionActionPerformed(evt);
            }
        });

        txaCiclo.setColumns(20);
        txaCiclo.setRows(5);
        jScrollPane1.setViewportView(txaCiclo);

        TxtCiclo.setBackground(new java.awt.Color(153, 204, 255));
        TxtCiclo.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        TxtCiclo.setText("Ciclo");

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("PRUEBA DE CALIDAD");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(TxtVersion)
                    .addComponent(TxtCiclo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoxVersiones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoxAplicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoxAplicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxVersiones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(TxtCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAplicacionActionPerformed

    private void BoxAplicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxAplicacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxAplicacionesActionPerformed

    private void BoxVersionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxVersionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxVersionesActionPerformed

    private void TxtVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtVersionActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Combox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Combox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Combox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Combox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Combox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BoxAplicaciones;
    private javax.swing.JComboBox BoxVersiones;
    private javax.swing.JTextField TxtAplicacion;
    private javax.swing.JTextField TxtCiclo;
    private javax.swing.JTextField TxtVersion;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txaCiclo;
    // End of variables declaration//GEN-END:variables
}