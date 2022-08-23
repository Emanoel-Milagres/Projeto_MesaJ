package view;

import controller.ControllerUsuario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.ModelUsuario;

/**
 *
 * @author Emanoel
 */
public class ViewLogin extends javax.swing.JFrame {

    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelUsuario modelUsuario = new ModelUsuario();

    /**
     * Creates new form ViewCliente
     */
    public ViewLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jbEntrar = new javax.swing.JButton();
        jpfSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        Login.setBackground(new java.awt.Color(2, 114, 148));

        jLabel1.setForeground(new java.awt.Color(230, 230, 230));
        jLabel1.setText("Usuário:");

        jLabel2.setForeground(new java.awt.Color(230, 230, 230));
        jLabel2.setText("Senha:");

        jtfUsuario.setBackground(new java.awt.Color(100, 103, 105));
        jtfUsuario.setForeground(new java.awt.Color(230, 230, 230));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jbEntrar.setBackground(new java.awt.Color(18, 188, 0));
        jbEntrar.setForeground(new java.awt.Color(230, 230, 230));
        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        jbEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbEntrarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jbEntrarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jbEntrarKeyTyped(evt);
            }
        });

        jpfSenha.setBackground(new java.awt.Color(100, 103, 105));
        jpfSenha.setForeground(new java.awt.Color(230, 230, 230));
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setText("Login do sistema");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 250, 250));
        jLabel4.setText("Mesa J");

        jbSair.setBackground(new java.awt.Color(152, 56, 60));
        jbSair.setForeground(new java.awt.Color(230, 230, 230));
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jpfSenha, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSair)
                        .addGap(60, 60, 60)
                        .addComponent(jbEntrar)))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(153, 153, 153))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSair)
                    .addComponent(jbEntrar))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        // TODO add your handling code here:
        modelUsuario.setUsuLogin(jtfUsuario.getText());
        modelUsuario.setUsuSenha(String.valueOf(jpfSenha.getPassword()));
        if (controllerUsuario.getValidarUsuarioController(modelUsuario)) {

            new ViewPrincipal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario ou Senha inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbEntrarKeyPressed
        // TODO add your handling code here:        
    }//GEN-LAST:event_jbEntrarKeyPressed

    private void jbEntrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbEntrarKeyTyped
        // TODO add your handling code here:0        

    }//GEN-LAST:event_jbEntrarKeyTyped

    private void jbEntrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbEntrarKeyReleased
        // TODO add your handling code here:        }
    }//GEN-LAST:event_jbEntrarKeyReleased

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbSair;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
