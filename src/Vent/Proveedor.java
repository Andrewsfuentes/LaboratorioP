/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vent;

/**
 *
 * @author admin
 */
public class Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Proveedor
     */
    public Proveedor() {
        initComponents();
                        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Regis4 = new javax.swing.JButton();
        jButton1Regresar4 = new javax.swing.JButton();
        jLabel1Descri = new javax.swing.JLabel();
        jLabel1NombreProve = new javax.swing.JLabel();
        jTextField1Descri = new javax.swing.JTextField();
        jTextField1NombreP = new javax.swing.JTextField();
        jLabel1ImgProveedor = new javax.swing.JLabel();
        jTextField1Direcc = new javax.swing.JTextField();
        jLabel1Dirreci = new javax.swing.JLabel();
        jTextField1Email = new javax.swing.JTextField();
        jLabel1Email = new javax.swing.JLabel();
        jTextField1Pagina = new javax.swing.JTextField();
        jLabel1Pagina = new javax.swing.JLabel();
        jScrollPane1Proveedor = new javax.swing.JScrollPane();
        jTable1PROVEEDOR = new javax.swing.JTable();
        jButton1ElimarPro = new javax.swing.JButton();
        jButton1ActualizarPr = new javax.swing.JButton();
        jLabel1VentanaNombre2 = new javax.swing.JLabel();
        jLabel1ProveImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1Regis4.setBackground(new java.awt.Color(0, 153, 204));
        jButton1Regis4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1Regis4.setText("Registrar");
        getContentPane().add(jButton1Regis4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 110, -1));

        jButton1Regresar4.setBackground(new java.awt.Color(255, 153, 0));
        jButton1Regresar4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1Regresar4.setText("Regresar");
        jButton1Regresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Regresar4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 110, 30));

        jLabel1Descri.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Descri.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Descri.setText("Dirección");
        getContentPane().add(jLabel1Descri, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel1NombreProve.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1NombreProve.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1NombreProve.setText("Nombre");
        getContentPane().add(jLabel1NombreProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));
        getContentPane().add(jTextField1Descri, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, 30));
        getContentPane().add(jTextField1NombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, 30));

        jLabel1ImgProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/agregar-Pro.png"))); // NOI18N
        getContentPane().add(jLabel1ImgProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));
        getContentPane().add(jTextField1Direcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 170, 30));

        jLabel1Dirreci.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Dirreci.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Dirreci.setText("Telefono");
        getContentPane().add(jLabel1Dirreci, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));
        getContentPane().add(jTextField1Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 170, 30));

        jLabel1Email.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Email.setText("Email");
        getContentPane().add(jLabel1Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));
        getContentPane().add(jTextField1Pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 170, 30));

        jLabel1Pagina.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1Pagina.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1Pagina.setText("Web");
        getContentPane().add(jLabel1Pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jTable1PROVEEDOR.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1Proveedor.setViewportView(jTable1PROVEEDOR);

        getContentPane().add(jScrollPane1Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 410, 110));

        jButton1ElimarPro.setBackground(new java.awt.Color(255, 51, 51));
        jButton1ElimarPro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1ElimarPro.setText("Eliminar");
        getContentPane().add(jButton1ElimarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 110, -1));

        jButton1ActualizarPr.setBackground(new java.awt.Color(153, 153, 255));
        jButton1ActualizarPr.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1ActualizarPr.setText("Actualizar");
        getContentPane().add(jButton1ActualizarPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        jLabel1VentanaNombre2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1VentanaNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1VentanaNombre2.setText("Ingreso de Proveedor");
        getContentPane().add(jLabel1VentanaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel1ProveImg.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1ProveImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMg/Regist_Cat.jpg"))); // NOI18N
        getContentPane().add(jLabel1ProveImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1Regresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Regresar4ActionPerformed
        // TODO add your handling code here:
        Menu pro = new Menu();
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1Regresar4ActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ActualizarPr;
    private javax.swing.JButton jButton1ElimarPro;
    private javax.swing.JButton jButton1Regis4;
    private javax.swing.JButton jButton1Regresar4;
    private javax.swing.JLabel jLabel1Descri;
    private javax.swing.JLabel jLabel1Dirreci;
    private javax.swing.JLabel jLabel1Email;
    private javax.swing.JLabel jLabel1ImgProveedor;
    private javax.swing.JLabel jLabel1NombreProve;
    private javax.swing.JLabel jLabel1Pagina;
    private javax.swing.JLabel jLabel1ProveImg;
    private javax.swing.JLabel jLabel1VentanaNombre2;
    private javax.swing.JScrollPane jScrollPane1Proveedor;
    private javax.swing.JTable jTable1PROVEEDOR;
    private javax.swing.JTextField jTextField1Descri;
    private javax.swing.JTextField jTextField1Direcc;
    private javax.swing.JTextField jTextField1Email;
    private javax.swing.JTextField jTextField1NombreP;
    private javax.swing.JTextField jTextField1Pagina;
    // End of variables declaration//GEN-END:variables
}
