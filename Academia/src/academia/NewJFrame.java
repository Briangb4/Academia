
package academia;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelinicioUsuario = new javax.swing.JLabel();
        PanelinicioContraseña = new javax.swing.JLabel();
        Paneliniciousuariobloque = new javax.swing.JTextField();
        PanelinicioSiguiente = new javax.swing.JButton();
        PanelinicioContraseñabloque = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setText("Academia ");

        PanelinicioUsuario.setText("Usuario ");

        PanelinicioContraseña.setText("Contraseña");

        Paneliniciousuariobloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaneliniciousuariobloqueActionPerformed(evt);
            }
        });

        PanelinicioSiguiente.setBackground(new java.awt.Color(102, 255, 102));
        PanelinicioSiguiente.setText("Siguiente");
        PanelinicioSiguiente.setToolTipText("");
        PanelinicioSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelinicioSiguienteActionPerformed(evt);
            }
        });

        PanelinicioContraseñabloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelinicioContraseñabloqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PanelinicioSiguiente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelinicioContraseña)
                        .addGap(25, 25, 25)
                        .addComponent(PanelinicioContraseñabloque))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelinicioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Paneliniciousuariobloque, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PanelinicioUsuario)
                    .addComponent(Paneliniciousuariobloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PanelinicioContraseña)
                    .addComponent(PanelinicioContraseñabloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(PanelinicioSiguiente)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelinicioSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelinicioSiguienteActionPerformed
      
       String un = Paneliniciousuariobloque.getText();
       String p = PanelinicioContraseñabloque.getText();

       
    }//GEN-LAST:event_PanelinicioSiguienteActionPerformed

    private void PaneliniciousuariobloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaneliniciousuariobloqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaneliniciousuariobloqueActionPerformed

    private void PanelinicioContraseñabloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelinicioContraseñabloqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelinicioContraseñabloqueActionPerformed


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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PanelinicioContraseña;
    private javax.swing.JPasswordField PanelinicioContraseñabloque;
    private javax.swing.JButton PanelinicioSiguiente;
    private javax.swing.JLabel PanelinicioUsuario;
    private javax.swing.JTextField Paneliniciousuariobloque;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
