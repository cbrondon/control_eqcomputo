
package Interfaces;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AgregarComputadora extends javax.swing.JFrame {

    
    public AgregarComputadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSerie = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        txtInventario = new javax.swing.JTextField();
        txtRAM = new javax.swing.JTextField();
        txtROM = new javax.swing.JTextField();
        lblRAM = new javax.swing.JLabel();
        lblROM = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        cbArea = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProcesador = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btbAtras = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, -1));

        lblSerie.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblSerie.setForeground(new java.awt.Color(255, 255, 255));
        lblSerie.setText("N° de Serie:");
        getContentPane().add(lblSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        lblInventario.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario.setText("N° de Inventario:");
        getContentPane().add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, 20));
        getContentPane().add(txtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 100, -1));
        getContentPane().add(txtRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 160, -1));
        getContentPane().add(txtROM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 210, -1));

        lblRAM.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblRAM.setForeground(new java.awt.Color(255, 255, 255));
        lblRAM.setText("RAM:");
        getContentPane().add(lblRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        lblROM.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblROM.setForeground(new java.awt.Color(255, 255, 255));
        lblROM.setText("ROM:");
        getContentPane().add(lblROM, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 20));

        lblEstado.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado:");
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Departamento/Area:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 20));

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "si", "no" }));
        cbEstado.setToolTipText("Seleccionar");
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 90, -1));

        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sistemas", "Quimica", "Industrial", "Mecanica", "Gestion", "Petrolera", "Electrica", "Electronica", "Administrativo", "Biblioteca" }));
        cbArea.setToolTipText("");
        cbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaActionPerformed(evt);
            }
        });
        getContentPane().add(cbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 130, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Procesador:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, 20));
        getContentPane().add(txtProcesador, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save_78348.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 110, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel_77947 (2).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar Computadora");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 30));

        btbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1486485553-ago-arrow-arrow-left-back-previous-direction-left_81160.png"))); // NOI18N
        btbAtras.setText("Atras");
        btbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(btbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        CallStoredProcedures llamar = new CallStoredProcedures();
        if((cbArea.getSelectedIndex()!=0)&&(cbEstado.getSelectedIndex()!=0)){
            try {
                llamar.añadirEquipo(txtInventario.getText(),String.valueOf(cbEstado.getSelectedItem()), txtSerie.getText(),txtRAM.getText(), txtROM.getText(),txtProcesador.getText(), txtMarca.getText(), String.valueOf(cbArea.getSelectedIndex()) );
            } catch (SQLException ex) {
                Logger.getLogger(AgregarComputadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btbAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbAtrasMouseClicked

        Menu y =new Menu();
        y.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btbAtrasMouseClicked

    private void cbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAreaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblRAM;
    private javax.swing.JLabel lblROM;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JTextField txtInventario;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRAM;
    private javax.swing.JTextField txtROM;
    private javax.swing.JTextField txtSerie;
    // End of variables declaration//GEN-END:variables
}
