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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edval
 */
public class ControleUsersADM extends javax.swing.JFrame {

    /**
     * Creates new form CADASTRO_USER_CORRETO
     */
    public ControleUsersADM() {
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
        txtusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JToggleButton();
        quit = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        LABELimgvoltar = new javax.swing.JLabel();
        btnCarregar = new javax.swing.JToggleButton();
        btnLimpar = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        FUNDO1 = new javax.swing.JLabel();
        FUNDO2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROLE DE USUÁRIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID USER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 40, -1));

        txtusername.setBackground(new java.awt.Color(29, 27, 77));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 190, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("________________________________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        btnCadastrar.setBackground(new java.awt.Color(29, 27, 77));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 50));

        quit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        quit.setForeground(new java.awt.Color(255, 255, 255));
        quit.setText("X");
        quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitMouseClicked(evt);
            }
        });
        getContentPane().add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 20, -1));

        txtsenha.setBackground(new java.awt.Color(29, 27, 77));
        txtsenha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtsenha.setForeground(new java.awt.Color(255, 255, 255));
        txtsenha.setBorder(null);
        getContentPane().add(txtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 20));

        jPasswordField2.setBackground(new java.awt.Color(29, 27, 77));
        jPasswordField2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(null);
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 20));

        tabelaUsuario.setBackground(new java.awt.Color(29, 27, 77));
        tabelaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID USER", "USERNAME", "SENHA"
            }
        ));
        tabelaUsuario.setGridColor(new java.awt.Color(29, 27, 77));
        tabelaUsuario.setSelectionBackground(new java.awt.Color(29, 27, 77));
        tabelaUsuario.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabelaUsuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 440));

        btnPesquisar.setBackground(new java.awt.Color(29, 27, 77));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("LISTAR USUÁRIOS");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 160, 50));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 70, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("________________________________________");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, -1));

        txtid.setBackground(new java.awt.Color(29, 27, 77));
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid.setBorder(null);
        txtid.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        txtid.setEnabled(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, 20));

        LABELimgvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_button40WHITE.png"))); // NOI18N
        LABELimgvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LABELimgvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LABELimgvoltarMouseClicked(evt);
            }
        });
        getContentPane().add(LABELimgvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        btnCarregar.setBackground(new java.awt.Color(29, 27, 77));
        btnCarregar.setForeground(new java.awt.Color(255, 255, 255));
        btnCarregar.setText("CARREGAR CAMPOS");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 50));

        btnLimpar.setBackground(new java.awt.Color(29, 27, 77));
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("LIMPAR CAMPOS");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 160, 50));

        btnAlterar.setBackground(new java.awt.Color(29, 27, 77));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("ALTERAR DADOS");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 160, 50));

        FUNDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AF_LINGUIFY_LOGOMARCAPADRAO_RED.png"))); // NOI18N
        getContentPane().add(FUNDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 430, 570));

        FUNDO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AF_LINGUIFY_LOGOMARCAPADRAO_RED.png"))); // NOI18N
        getContentPane().add(FUNDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -120, 500, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarUsuario();
        listarValoresUsuario();
        LimparCampos();
//
//        String username, senha;
//
//        username = txtusername.getText();
//        senha = txtsenha.getText();
//        
//
//
//        UsuarioDTO objusuariodto = new UsuarioDTO();
//        objusuariodto.setUsername(username);
//        objusuariodto.setSenha(senha);
//
//        UsuarioDAO objusuariodao = new UsuarioDAO();
//        objusuariodao.cadastrarUsuario(objusuariodto);
//
//        try {
//
//        } catch (Exception e) {
//
//        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseClicked
        System.exit(0);     // TODO add your handling code here:
    }//GEN-LAST:event_quitMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       listarValoresUsuario(); // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
      CarregarCampos();  // TODO add your handling code here:
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
    LimparCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarUsuario();
        listarValoresUsuario();  
        LimparCampos();// TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(ControleUsersADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleUsersADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleUsersADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleUsersADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleUsersADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO1;
    private javax.swing.JLabel FUNDO2;
    private javax.swing.JLabel LABELimgvoltar;
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnCarregar;
    private javax.swing.JToggleButton btnLimpar;
    private javax.swing.JToggleButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel quit;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    
  // TODOS OS MÉTODOS UTILIZADOS  
    
    private void listarValoresUsuario() {

        try {
            UsuarioDAO objusuariodao = new UsuarioDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaUsuario.getModel();
            model.setNumRows(0);

            ArrayList<UsuarioDTO> lista = objusuariodao.PesquisarUsuario();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_usuario(),
                    lista.get(num).getUsername(),
                    lista.get(num).getSenha()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores VIEW: " + erro);
        }

    }
    
    
    
    private void CarregarCampos(){
        int setar = tabelaUsuario.getSelectedRow();
        
        txtid.setText(tabelaUsuario.getModel().getValueAt(setar, 0).toString());
        txtusername.setText(tabelaUsuario.getModel().getValueAt(setar, 1).toString());
        txtsenha.setText(tabelaUsuario.getModel().getValueAt(setar, 2).toString());
    
    }
    
    
     private void CadastrarUsuario(){
        String username, senha;

        username = txtusername.getText();
        senha = txtsenha.getText();
        


        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setUsername(username);
        objusuariodto.setSenha(senha);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.cadastrarUsuario(objusuariodto);

       

}

    private void LimparCampos(){
    txtid.setText("");
    txtusername.setText("");
    txtsenha.setText("");
    txtusername.requestFocus();
    
    }
    
    
   private void AlterarUsuario(){
       int id_usuario;
       String username, senha;
       
       id_usuario = Integer.parseInt(txtid.getText());
       username = txtusername.getText();
       senha = txtsenha.getText();
       
       UsuarioDTO objusuariodto = new UsuarioDTO();
       objusuariodto.setId_usuario(id_usuario);
       objusuariodto.setSenha(senha);
       objusuariodto.setUsername(username);
       
       UsuarioDAO objusuariodao = new UsuarioDAO();
       objusuariodao.AlterarUsuario(objusuariodto);
       
   
   
   } 
    
    
    
    
    
}

