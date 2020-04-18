
package Interfaces;

public class AgregarUsuario extends javax.swing.JFrame {

    
    public AgregarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDepartamento = new javax.swing.JLabel();
        lblTrabajador = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        pssContraseña = new javax.swing.JPasswordField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        cbDepartamento = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtTrabajador = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDepartamento.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        lblDepartamento.setText("Departamento:");
        getContentPane().add(lblDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        lblTrabajador.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        lblTrabajador.setText("N° de Trabajador:");
        getContentPane().add(lblTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        lblNombre.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        lblTipo.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo de Usuario:");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        lblTelefono.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono:");
        getContentPane().add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        lblCorreo.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo:");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        lblContraseña.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña:");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        getContentPane().add(pssContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 210, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, -1));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 230, -1));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, -1));

        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, -1));
        getContentPane().add(txtTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save_78348.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 120, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel_77947 (2).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 120, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1486485553-ago-arrow-arrow-left-back-previous-direction-left_81160.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 100, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
    
          Menu y =new Menu();
        y.setVisible(true);
        this.dispose();
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAtrasMouseClicked

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTrabajador;
    private javax.swing.JPasswordField pssContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTrabajador;
    // End of variables declaration//GEN-END:variables
}
