
package academia;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class iniciodesesion extends javax.swing.JFrame {

    public iniciodesesion() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelinicioUsuario = new javax.swing.JLabel();
        PanelinicioContraseña = new javax.swing.JLabel();
        Paneliniciousuariobloque = new javax.swing.JTextField();
        PanelinicioSiguiente = new javax.swing.JButton();
        PanelinicioContraseñabloque = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        PanelinicioSiguiente1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 120, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PanelinicioUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelinicioUsuario.setText("Usuario ");

        PanelinicioContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar sesion");
        jLabel1.setToolTipText("");

        PanelinicioSiguiente1.setBackground(new java.awt.Color(255, 0, 0));
        PanelinicioSiguiente1.setText("Delete");
        PanelinicioSiguiente1.setToolTipText("");
        PanelinicioSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanelinicioSiguiente1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Hecho por Brian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelinicioUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PanelinicioContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PanelinicioSiguiente1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PanelinicioSiguiente))
                            .addComponent(Paneliniciousuariobloque, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelinicioContraseñabloque, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Paneliniciousuariobloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelinicioUsuario))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PanelinicioContraseñabloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelinicioContraseña))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PanelinicioSiguiente)
                    .addComponent(PanelinicioSiguiente1))
                .addGap(26, 26, 26)
                .addComponent(jLabel2))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelinicioContraseñabloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelinicioContraseñabloqueActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_PanelinicioContraseñabloqueActionPerformed

    private void PanelinicioSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelinicioSiguienteActionPerformed

        String un = Paneliniciousuariobloque.getText();
        String p = PanelinicioContraseñabloque.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Academia", "root", "Bgarcia10+");
            Statement st = conn.createStatement();
            String sql = "select * from usuarios";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String usuario = rs.getString("usuario");
                String passwd = rs.getString("contraseña");

                if (un.equals(usuario) && p.equals(passwd)) {
                    
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Inicio().setVisible(true);
                        }
                    });
                    
                    

                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta ");
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

      
    }//GEN-LAST:event_PanelinicioSiguienteActionPerformed

    private void PaneliniciousuariobloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaneliniciousuariobloqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaneliniciousuariobloqueActionPerformed

    private void PanelinicioSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanelinicioSiguiente1ActionPerformed
           Paneliniciousuariobloque.setText("");
           PanelinicioContraseñabloque.setText("");

    }//GEN-LAST:event_PanelinicioSiguiente1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PanelinicioContraseña;
    private javax.swing.JPasswordField PanelinicioContraseñabloque;
    private javax.swing.JButton PanelinicioSiguiente;
    private javax.swing.JButton PanelinicioSiguiente1;
    private javax.swing.JLabel PanelinicioUsuario;
    private javax.swing.JTextField Paneliniciousuariobloque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class inicio {

        public inicio() {
        }
    }
}

