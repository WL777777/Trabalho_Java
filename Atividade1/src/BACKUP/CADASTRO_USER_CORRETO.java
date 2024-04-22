/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BACKUP;

import atividade2.*;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author edval
 */
public class CADASTRO_USER_CORRETO extends javax.swing.JFrame {

    /**
     * Creates new form CADASTRO_USER_CORRETO
     */
    public CADASTRO_USER_CORRETO() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtconfirmsenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        quit = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtsenha = new javax.swing.JPasswordField();
        LABELimgvoltar = new javax.swing.JLabel();
        IMAGEM = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE USUÁRIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 40, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtusername.setBackground(new java.awt.Color(29, 27, 77));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, 20));

        txtconfirmsenha.setBackground(new java.awt.Color(29, 27, 77));
        txtconfirmsenha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtconfirmsenha.setForeground(new java.awt.Color(255, 255, 255));
        txtconfirmsenha.setBorder(null);
        getContentPane().add(txtconfirmsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 190, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("________________________________________");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 200, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("________________________________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        jToggleButton1.setBackground(new java.awt.Color(29, 27, 77));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("CADASTRAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 260, 50));

        quit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        quit.setForeground(new java.awt.Color(255, 255, 255));
        quit.setText("X");
        quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
        });
        getContentPane().add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 20, -1));

        jCheckBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_eye_20px_1.png"))); // NOI18N
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 30, 30));

        txtsenha.setBackground(new java.awt.Color(29, 27, 77));
        txtsenha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtsenha.setForeground(new java.awt.Color(255, 255, 255));
        txtsenha.setBorder(null);
        getContentPane().add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 20));

        LABELimgvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_button40WHITE.png"))); // NOI18N
        LABELimgvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LABELimgvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LABELimgvoltarMouseClicked(evt);
            }
        });
        getContentPane().add(LABELimgvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        IMAGEM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AF_LINGUIFY_LOGOMARCAPADRAO_RED.png"))); // NOI18N
        getContentPane().add(IMAGEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -180, 510, 640));

        jPasswordField2.setBackground(new java.awt.Color(29, 27, 77));
        jPasswordField2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(null);
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       
        
        String username, senha, confirmsenha;
        
        username=txtusername.getText();
        senha=txtsenha.getText();
        confirmsenha = txtconfirmsenha.getText();
        
        if (senha.equals(confirmsenha)) {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não coincidem. Tente novamente.");
                    return;
        }
        
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setUsername(username);
        objusuariodto.setSenha(senha);
        
        
        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.cadastrarUsuario(objusuariodto);
        
         
                    
        try {
               
        } catch (Exception e) {
            
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
        System.exit(0);     // TODO add your handling code here:
    }//GEN-LAST:event_quitMouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected())
        {
            txtconfirmsenha.setEchoChar((char)0);
            jCheckBox2.setIcon(new ImageIcon("C:\\Users\\edval\\OneDrive\\Documentos\\NetBeansProjects\\Atividade1\\src\\img\\icons8_invisible_20px_1.png"));
        }
        else
        {
            txtconfirmsenha.setEchoChar('\u2022');
            jCheckBox2.setIcon(new ImageIcon("C:\\Users\\edval\\OneDrive\\Documentos\\NetBeansProjects\\Atividade1\\src\\img\\icons8_eye_20px_1.png"));
        }

        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void LABELimgvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELimgvoltarMouseClicked
        Menu objmenuview = new Menu();
        objmenuview.setVisible(true);

        dispose();
    }//GEN-LAST:event_LABELimgvoltarMouseClicked

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
            java.util.logging.Logger.getLogger(CADASTRO_USER_CORRETO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CADASTRO_USER_CORRETO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CADASTRO_USER_CORRETO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CADASTRO_USER_CORRETO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CADASTRO_USER_CORRETO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMAGEM;
    private javax.swing.JLabel LABELimgvoltar;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel quit;
    private javax.swing.JPasswordField txtconfirmsenha;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
