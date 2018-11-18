package InterfacesGraficas;

import libreriainternacional.*;

public class InterfazCola extends javax.swing.JFrame {

    Cola cola = new Cola();

    public InterfazCola() {

        initComponents();
        this.setLocationRelativeTo(null); //centrarlo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb3 = new javax.swing.JLabel();
        txtIntroduce = new javax.swing.JTextField();
        push = new javax.swing.JButton();
        vaciar = new javax.swing.JButton();
        pop = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        lb2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lb3.setText("No. de Elementos: ");
        getContentPane().add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));
        getContentPane().add(txtIntroduce, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 290, -1));

        push.setText("Push");
        push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushActionPerformed(evt);
            }
        });
        getContentPane().add(push, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 70, -1));

        vaciar.setText("Vaciar");
        vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarActionPerformed(evt);
            }
        });
        getContentPane().add(vaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        pop.setText("Pop");
        pop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popActionPerformed(evt);
            }
        });
        getContentPane().add(pop, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 70, -1));

        area.setColumns(20);
        area.setRows(5);
        JScrollPane.setViewportView(area);

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 240, 210));

        lb2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lb2.setText("Último:");
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        lb1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lb1.setText("Primero:");
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lb7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        lb7.setText("Introduce:");
        getContentPane().add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/White.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushActionPerformed
        // TODO add your handling code here:
        if (!txtIntroduce.getText().equals("")) {
            cola.Push(txtIntroduce.getText());
            act();
        }

    }//GEN-LAST:event_pushActionPerformed

    private void popActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popActionPerformed
        // TODO add your handling code here:

        if (!txtIntroduce.getText().equals("") && !area.getText().equals("")) {
            cola.atiende();
            act();
        }
    }//GEN-LAST:event_popActionPerformed

    private void vaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarActionPerformed
        // TODO add your handling code here:
        if (!txtIntroduce.getText().equals("")) {
            cola.VaciarCola();
            lb1.setText(" ");
            lb2.setText(" ");
            lb3.setText(" ");
            act();

        }
    }//GEN-LAST:event_vaciarActionPerformed

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

    public void act() {
        area.setText(cola.VerCola());
        lb1.setText(cola.Primero());
        lb2.setText(cola.Ultimo());
        lb3.setText(cola.Elementos());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JTextArea area;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb7;
    private javax.swing.JButton pop;
    private javax.swing.JButton push;
    private javax.swing.JTextField txtIntroduce;
    private javax.swing.JButton vaciar;
    // End of variables declaration//GEN-END:variables
}
