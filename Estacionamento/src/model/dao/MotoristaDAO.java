
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Vaga;

public class MotoristaDAO {
    
    
     public void create(Vaga v){
      Connection con = ConnectionFactory.getConnection();
      PreparedStatement stmt = null;
      
      try{
      stmt = con.prepareStatement ("INSERT INTO Motorista (nomeCompleto, genero, RG, CPF, celular, email, senha) VALUES (?,?,?,?,?,?,?)");
      stmt.setString(1, m.getNomeCompleto());
      stmt.setString(2, m.getGenero());
      stmt.setInt(3, m.getRG());
      stmt.setInt(4, m.getCPF());
      stmt.setInt(5, m.getCelular());
      stmt.setString(6, m.getEmail());
      stmt.setString(7, m.getSenha());

              
      stmt.executeUpdate();
      JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
      
      }catch (SQLException e){
      JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e);
      }finally{
      ConnectionFactory.closeConnection(con, stmt);
      }
      
      }
        
}
    
    
   
              
}
