/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Yamary
 */
public class Computadoras extends javax.swing.JFrame {

    /**
     * Creates new form Computadoras
     */
    public Computadoras() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbComputadoras = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btbAtras = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 170, 40));

        TbComputadoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TbComputadoras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 190));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1485476008-artboard-1_78539 (1).png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Computadoras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 30));

        btbAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1486485553-ago-arrow-arrow-left-back-previous-direction-left_81160.png"))); // NOI18N
        btbAtras.setText("Atras");
        btbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbAtrasMouseClicked(evt);
            }
        });
        getContentPane().add(btbAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/fondo.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbAtrasMouseClicked

        Menu y =new Menu();
        y.setVisible(true);
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btbAtrasMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable TbComputadoras;
    private javax.swing.JButton btbAtras;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
