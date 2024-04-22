
package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO { 
        
    Connection conn;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();
    
    public ArrayList<UsuarioDTO> PesquisarUsuario(){
        String sql = "select * from usuario";
        
        
        try {
            conn =  new ConexaoDAO().conectaBD();
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            rs =pstm.executeQuery();
            
            while(rs.next()){
            UsuarioDTO objusuarioDTO = new UsuarioDTO();
            objusuarioDTO.setId_usuario(rs.getInt("id_usuario"));
            objusuarioDTO.setUsername(rs.getString("username"));
            objusuarioDTO.setSenha(rs.getString("senha"));
            
            lista.add(objusuarioDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO Pesquisar" + erro);
        }
        return lista;
    }
    
    
    public void cadastrarUsuario(UsuarioDTO objusuariodto){
        String sql = "insert into usuario (username, senha) values (?, ?)";
        conn =  new ConexaoDAO().conectaBD();
     
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getUsername());
            pstm.setString(2, objusuariodto.getSenha());
            
            pstm.execute();
            pstm.close();
           
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: " +erro);
            
        }
        
        
    
    
    }
    
    public void AlterarUsuario(UsuarioDTO objusuariodto){
        String sql = "update usuario set username = ?, senha = ? where id_usuario = ?";
        conn =  new ConexaoDAO().conectaBD();
     
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getUsername());
            pstm.setString(2, objusuariodto.getSenha());
            pstm.setInt(3, objusuariodto.getId_usuario());
            
            pstm.execute();
            pstm.close();
           
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO ALTERAR " +erro);
            
        }
        
        
    
    
    }
    
    
    
    
    
    
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
       conn =  new ConexaoDAO().conectaBD();
       
        try {
            String sql = "select * from usuario where username = ? and senha = ? ";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getUsername());
            pstm.setString(2, objusuariodto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: " +erro);
            return null;
        }
        
    }
    
    
    
}
