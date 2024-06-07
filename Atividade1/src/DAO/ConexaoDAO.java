
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    
    public Connection conectaBD(){
        Connection conn = null;
       try{
       String url = "jdbc:mysql://localhost:3306/login?user=root&password=";
       // String url = "jdbc:mysql://localhost:3306/login?user=root&password=";
       // "jdbc:mysql://localhost:3306/login?user=root&password=";
       conn = DriverManager.getConnection(url);
       
       
       
       }catch(Exception erro){
           JOptionPane.showMessageDialog(null, "ConexaoDAO"+ erro.getMessage());
       }
       
       
        return conn;
    
    
    }
       
}
