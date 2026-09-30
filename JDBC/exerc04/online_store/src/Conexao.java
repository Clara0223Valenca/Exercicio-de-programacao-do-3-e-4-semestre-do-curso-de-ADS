
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String base = "loja_vendas";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/" + base; 

    //makes connection
    public Connection conectar(){
        
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {

            throw new RuntimeException("A conexão com o banco falhou");
        }

    }
}

