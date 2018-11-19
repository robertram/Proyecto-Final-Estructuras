package InterfacesGraficas;

import static java.lang.System.exit;
import javax.swing.JOptionPane;
import libreriainternacional.Cola;
import libreriainternacional.Libro;

public class InterfazCola extends javax.swing.JFrame {

    Cola cola = new Cola();

    public InterfazCola() {

        initComponents();
        this.setLocationRelativeTo(null); //centrarlo
    }

    public void agregarLibros() {
        Libro libro = new Libro(txtNombreLibro.getText(), txtAutor.getText(), txtSede.getText(), txtCantidad.getText());
        cola.encola(libro);
        vaciar();
    }

    public void vaciar() {
        txtNombreLibro.setText(null);
        txtAutor.setText(null);
        txtSede.setText(null);
        txtCantidad.setText(null);
    }

    public void verLibros() { //mostrar elementos en la caja de texto por medio de metodo imprimir
        jTextArea1.setText(cola.imprimir());
    }

    public void eliminar() {
        if (cola.cantidadElementos() > 0) {
            cola.atiende();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAutor = new javax.swing.JTextField();
        txtNombreLibro = new javax.swing.JTextField();
        txtSede = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 140, -1));
        getContentPane().add(txtNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, -1));
        getContentPane().add(txtSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 140, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 320, 170));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarCola.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.setFocusable(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setFocusable(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/homebtn.png"))); // NOI18N
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setFocusPainted(false);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salirbtn.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusable(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        btnVaciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaciarCola.png"))); // NOI18N
        btnVaciar.setBorderPainted(false);
        btnVaciar.setContentAreaFilled(false);
        btnVaciar.setFocusPainted(false);
        btnVaciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVaciarMouseClicked(evt);
            }
        });
        getContentPane().add(btnVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cola.gif"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        eliminar();
        verLibros();
        JOptionPane.showMessageDialog(this, "Libro eliminado");
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        agregarLibros();
        verLibros();
        JOptionPane.showMessageDialog(this, "Libro agregado");
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        InterfazLogin login = new InterfazLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnVaciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVaciarMouseClicked
        // TODO add your handling code here:
         jTextArea1.setText(null);//eliminar datos de la caja de texto
    }//GEN-LAST:event_btnVaciarMouseClicked

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        InterfazOpcionAdmin admin = new InterfazOpcionAdmin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCola().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombreLibro;
    private javax.swing.JTextField txtSede;
    // End of variables declaration//GEN-END:variables
}
