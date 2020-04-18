package Interfaces;
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnCompu = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAUsuario = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/screen_monitor_icon_123490.png"))); // NOI18N
        btnAgregar.setText("Agregar Computadora");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnCompu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/graphicdesign2_78420.png"))); // NOI18N
        btnCompu.setText("Computadoras");
        getContentPane().add(btnCompu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/graphictool_78408.png"))); // NOI18N
        btnMantenimiento.setText("Mantenimiento");
        getContentPane().add(btnMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/document_bookmark_file_icon_123493.png"))); // NOI18N
        btnReporte.setText("Reporte");
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Exit-Page_icon-icons.com_53732.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, 40));

        btnAUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1486485564-add-character-include-more-person-user_81147.png"))); // NOI18N
        btnAUsuario.setText("Agregar Usuario");
        btnAUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(btnAUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
     
          AgregarComputadora y =new AgregarComputadora ();
        y.setVisible(true);
        this.dispose();
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAUsuarioMouseClicked
       
         AgregarUsuario y =new AgregarUsuario ();
        y.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnAUsuarioMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
     
         Login y = new Login();
         y.setVisible(true);
          this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAUsuario;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCompu;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}
