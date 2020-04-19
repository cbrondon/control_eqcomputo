/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yamary
 */
public class Mantenimiento extends javax.swing.JFrame {

    /**
     * Creates new form Mantenimiento
     */
    public Mantenimiento() {
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

        jLabel1 = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        cbArea = new javax.swing.JComboBox<>();
        lblEquipo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btbAtras = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 30));

        lblDepartamento.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        lblDepartamento.setText("Departamento/Area:");
        getContentPane().add(lblDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        cbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sistemas", "Quimica", "Industrial", "Mecanica", "Gestion", "Petrolera", "Electrica", "Electronica", "Administrativo", "Biblioteca" }));
        cbArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAreaItemStateChanged(evt);
            }
        });
        cbArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaActionPerformed(evt);
            }
        });
        getContentPane().add(cbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 130, -1));

        lblEquipo.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblEquipo.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipo.setText("Equipo:");
        getContentPane().add(lblEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save_78348.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 110, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel_77947 (2).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        btbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1486485553-ago-arrow-arrow-left-back-previous-direction-left_81160.png"))); // NOI18N
        btbAtras.setText("Atras");
        btbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(btbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        lblFecha.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha:");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar departamento" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 180, -1));

        jdFecha.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 160, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbAtrasMouseClicked

        Menu y =new Menu();
        y.setVisible(true);
        this.dispose();
        this.setVisible(false);

    }//GEN-LAST:event_btbAtrasMouseClicked

    private void cbAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaActionPerformed
        // TODO add your handling code here:
        try  {
            jComboBox1.removeAllItems();
            conexion conex = new conexion();
            Connection conect = conex.Conexion();
            String q1 = "select numinvent from equipo where "+String.valueOf(cbArea.getSelectedIndex()).trim()+"=dpto";
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(q1);
            while(rs.next()){
                jComboBox1.addItem(rs.getString("numinvent"));
            } 
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Error en la consulta es : " + e.getMessage());
        }
    }//GEN-LAST:event_cbAreaActionPerformed

    private void cbAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAreaItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbAreaItemStateChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        CallStoredProcedures llamar = new CallStoredProcedures();
        if((cbArea.getSelectedIndex()!=0)&&(jdFecha.getDate()!=null)){
            try {
                
                SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
                String date = dcn.format(jdFecha.getDate());
                System.out.println(date.toString());
                llamar.mostrarequipos(jComboBox1.getSelectedItem().toString().trim(), date, String.valueOf(cbArea.getSelectedIndex()).trim());
            } catch (SQLException ex) {
                Logger.getLogger(AgregarComputadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btbAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbArea;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblFecha;
    // End of variables declaration//GEN-END:variables
}
