/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

/**
 *
 * @author Katherine
 */
public class InterfazOpcionAdmin extends javax.swing.JFrame {

    /**
     * Creates new form InterfazOpcionAdmin
     */
    public InterfazOpcionAdmin() {
        initComponents();
        this.setLocationRelativeTo(null); //centrarlo

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarLibro = new javax.swing.JButton();
        btnAgregarUsuario = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarUsuarios.png"))); // NOI18N
        btnAgregarLibro.setBorderPainted(false);
        btnAgregarLibro.setContentAreaFilled(false);
        btnAgregarLibro.setFocusPainted(false);
        btnAgregarLibro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RolloverAgregarUsuarios.png"))); // NOI18N
        btnAgregarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarLibroMouseClicked(evt);
            }
        });
        getContentPane().add(btnAgregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        btnAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarLibros.png"))); // NOI18N
        btnAgregarUsuario.setBorderPainted(false);
        btnAgregarUsuario.setContentAreaFilled(false);
        btnAgregarUsuario.setFocusPainted(false);
        btnAgregarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RolloverAgregarLibros.png"))); // NOI18N
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/opcionAdmin.gif"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarLibroMouseClicked
        // TODO add your handling code here:
        InterfazListasAdmin admin = new InterfazListasAdmin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarLibroMouseClicked

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        // TODO add your handling code here:
        InterfazCola cola = new InterfazCola();
        cola.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazOpcionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazOpcionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazOpcionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazOpcionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazOpcionAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnAgregarUsuario;
    private javax.swing.JLabel fondo;
    // End of variables declaration//GEN-END:variables
}