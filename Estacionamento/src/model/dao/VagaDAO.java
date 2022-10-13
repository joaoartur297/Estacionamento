
package model.dao;


import connection.ConnectionFactory;
import model.bean.Vaga;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class VagaDAO {
    
      public void create(Vaga v){
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try{
      stmt = con.prepareStatement("INSERT INTO vaga (numero, rua, obliqua) VALUES (?,?,?)");
      stmt.setInt(1, v.getNumero());
      stmt.setString(2, v.getRua());
      stmt.setBoolean(3, v.getObliqua());
              
      stmt.executeUpdate();
      JOptionPane.showMessageDialog(null, "Vaga salva com sucesso!");
      
      }catch (SQLException e){
      JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e);
      }finally{
      ConnectionFactory.closeConnection(con, stmt);
      }
      
      }
        
}
