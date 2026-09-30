import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Venda {
    
    // public void LeituraBD(){
    //     String sql = "SELECT * FROM vendas";

    //     try {
    //         Connection con = conexao.conectar();
    //         PreparedStatement ps = con.prepareStatement(sql);
    //         ResultSet result = ps.executeQuery();

    //         while (result.next()) {
                
    //             int id = result.getInt(1);
    //             String name = result.getString(2);
    //             String telephone = result.getString(3);
    //             System.out.println(
    //                 "ID: " + id + " | " +
    //                 "NOME: " + name + " | " +
    //                 "TELEFONE: " + telephone

    //             );
    //         }



    //     } catch (SQLException e) {
    //         System.out.println("Falha na leitura do banco.");
    //     }
    // }
}
