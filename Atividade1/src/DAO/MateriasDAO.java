
package DAO;
import DTO.MateriasDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MateriasDAO {
        
    Connection conn;
    ResultSet rs;
    ArrayList<MateriasDTO> lista = new ArrayList<>();
    // TABELA
    public ArrayList<MateriasDTO> PesquisarMateria(){
        String sql = "select * from materias";
        
        
        try {
            conn =  new ConexaoDAO().conectaBD();
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            rs =pstm.executeQuery();
            
            while(rs.next()){
            MateriasDTO objmateriasDTO = new MateriasDTO();
            objmateriasDTO.setId_materias(rs.getInt("id_materias"));
            objmateriasDTO.setData(rs.getString("data"));
            objmateriasDTO.setProfessor(rs.getString("professor"));
            objmateriasDTO.setTema(rs.getString("tema"));
            objmateriasDTO.setMateria(rs.getString("materia"));
            objmateriasDTO.setConteudo(rs.getString("conteudo"));
            
            lista.add(objmateriasDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "MateriasDAO Pesquisar" + erro);
        }
        return lista;
    }
    
    //CADASTRO DE MATERIA
    public void cadastrarMateria(MateriasDTO objmateriasdto){
        String sql = "insert into materias (professor, materia, data, tema, conteudo) values (?, ?, ?, ?, ?)";
        conn =  new ConexaoDAO().conectaBD();
     
        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objmateriasdto.getProfessor());
            pstm.setString(2, objmateriasdto.getMateria());
            pstm.setString(3, objmateriasdto.getData());
            pstm.setString(4, objmateriasdto.getTema());
            pstm.setString(5, objmateriasdto.getConteudo());
            
            pstm.execute();
            pstm.close();
           
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"MateriasDAO: " +erro);
            
        }
        
        
    
    
    }
    // ALTERA OS DADOS DA TABELA
    public void AlterarMateria(MateriasDTO objmateriasdto){
        String sql = "update materias set professor = ?, materia = ?, tema=? , conteudo =?, data =? where id_materias = ?"; // pode dar erro aqui talvez por conta da data
        conn =  new ConexaoDAO().conectaBD();                                                                 // uma maneira de solucionar esse possivel erro
                                                                                                              //seria criar um ID para cada materia.

        try {
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objmateriasdto.getProfessor());
            pstm.setString(2, objmateriasdto.getMateria());
            pstm.setString(3, objmateriasdto.getTema());
            pstm.setString(4, objmateriasdto.getConteudo());
            pstm.setString(5, objmateriasdto.getData());  
            pstm.setInt(6, objmateriasdto.getId_materias());
            
            pstm.execute();
            pstm.close();
           
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO ALTERAR " +erro);
            
        }
        
        
    
    
    }
    
}
    
    
    
    
    
    
    
 
