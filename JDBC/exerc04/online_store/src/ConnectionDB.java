//javac -cp mysql-connector-j-26.7.0.jar ../src/App.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private String base = "loja_vendas";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3307/" + base; 

    //makes connection
    public Connection connect(){
        
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {

            throw new RuntimeException("A conexão com o banco falhou");
        }

    }
}

