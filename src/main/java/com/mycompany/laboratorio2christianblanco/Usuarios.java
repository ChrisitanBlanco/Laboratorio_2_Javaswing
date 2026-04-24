/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laboratorio2christianblanco;

import clases.Persona;
import clases.Sistema;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chriss
 */
public class Usuarios extends javax.swing.JFrame {
    
    private DefaultTableModel tblmodel;
    private String[] header = {"UserName", "Correo", "Contraseña", "Rol"};

    public Usuarios() {
        initComponents();
        initTable();
        cargarUsuariosEnTabla();
    }
    
    private void cargarUsuariosEnTabla() {
        tblmodel.setRowCount(0); 

        for (Persona p : Sistema.listaUsuarios) {
            tblmodel.addRow(p.toArray());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnContrasena = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 170));
        jPanel1.setLayout(new java.awt.BorderLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);
        jPanel3.add(btnAgregar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        jPanel3.add(btnEliminar);

        btnContrasena.setText("Restablecer contraseña");
        btnContrasena.addActionListener(this::btnContrasenaActionPerformed);
        jPanel3.add(btnContrasena);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);
        jPanel3.add(btnSalir);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("UserName:");
        jPanel4.add(jLabel1, new java.awt.GridBagConstraints());

        txtUser.addActionListener(this::txtUserActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.insets = new java.awt.Insets(2, 13, 0, 13);
        jPanel4.add(txtUser, gridBagConstraints);

        jLabel2.setText("Correo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel4.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.insets = new java.awt.Insets(2, 14, 2, 14);
        jPanel4.add(txtCorreo, gridBagConstraints);

        jLabel3.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 29);
        jPanel4.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Confirmar contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        jPanel4.add(jLabel4, gridBagConstraints);

        txtPass.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 14, 2, 14);
        jPanel4.add(txtPass, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 14, 0, 14);
        jPanel4.add(txtConfirmPass, gridBagConstraints);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTADO DE USUARIOS"));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
        });
        tblRegistros.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tblRegistrosComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 58, 2);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        /*String user = txtUser.getText();
        String correo = txtCorreo.getText();
        String contrasena = new String(txtPass.getPassword());
        String confirmar = new String(txtConfirmPass.getPassword());*/
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String userName = txtUser.getText();
        String correo = txtCorreo.getText();

        char[] passArray = txtPass.getPassword();
        char[] confirmPassArray = txtConfirmPass.getPassword();

        if (!java.util.Arrays.equals(passArray, confirmPassArray)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            return;
        }

        String contrasena = new String(passArray);
        String rol = "user";

        Persona p = new Persona(userName, correo, contrasena, rol);

        // 🔥 guardar en lista global
        Sistema.listaUsuarios.add(p);

        // actualizar tabla
        tblmodel.addRow(p.toArray());

        limpiarCampos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    Menu ventanaMenu = new Menu();
    ventanaMenu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int fila = tblRegistros.getSelectedRow();

        if (fila == -1) return;

        Sistema.listaUsuarios.remove(fila);
        tblmodel.removeRow(fila);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContrasenaActionPerformed
    Contrasena ventanaContra = new Contrasena();
    ventanaContra.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnContrasenaActionPerformed

    private void tblRegistrosComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblRegistrosComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistrosComponentHidden

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
         if (evt.getClickCount() == 2) {
            int fila = tblRegistros.getSelectedRow();

            txtUser.setText((String) tblmodel.getValueAt(fila, 0));
            txtCorreo.setText((String) tblmodel.getValueAt(fila, 1));
            txtPass.setText((String) tblmodel.getValueAt(fila, 2));
        }
    }//GEN-LAST:event_tblRegistrosMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Usuarios().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnContrasena;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        tblmodel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblRegistros.setModel(tblmodel);
    }
    
    private void limpiarCampos() {
        txtUser.setText("");
        txtCorreo.setText("");
        txtPass.setText("");
        txtConfirmPass.setText("");
    }
     
}
