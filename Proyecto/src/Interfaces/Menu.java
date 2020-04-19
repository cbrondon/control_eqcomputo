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
        jLabel1 = new javax.swing.JLabel();
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
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        btnCompu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/graphicdesign2_78420.png"))); // NOI18N
        btnCompu.setText("Computadoras");
        btnCompu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompuMouseClicked(evt);
            }
        });
        getContentPane().add(btnCompu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 190, -1));

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/graphictool_78408.png"))); // NOI18N
        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimientoMouseClicked(evt);
            }
        });
        getContentPane().add(btnMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, -1));

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/document_bookmark_file_icon_123493.png"))); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteMouseClicked(evt);
            }
        });
        getContentPane().add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 190, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Exit-Page_icon-icons.com_53732.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 90, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 280, 30));

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

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
     
         Login y = new Login();
         y.setVisible(true);
          this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnCompuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompuMouseClicked
        // TODO add your handling code here:
        Computadoras y = new Computadoras();
         y.setVisible(true);
          this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnCompuMouseClicked

    private void btnMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientoMouseClicked
        // TODO add your handling code here:
        Mantenimiento y = new Mantenimiento();
         y.setVisible(true);
          this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnMantenimientoMouseClicked

    private void btnReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseClicked
        // TODO add your handling code here:
        Reporte y = new Reporte();
         y.setVisible(true);
          this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnReporteMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCompu;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
