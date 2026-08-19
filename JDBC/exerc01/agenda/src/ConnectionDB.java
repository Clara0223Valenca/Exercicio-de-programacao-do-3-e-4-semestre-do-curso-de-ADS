import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private String base = "agenda";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/" + base; 

    //makes connection
    public Connection connect(){
        
        // try {
        //     return DriverManager.getConnection(url, user, password);
        // } catch (SQLException e) {

        //     throw new RuntimeException("A conexão com o banco falhou");
        // }

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "");
        } catch (SQLException e) {

            throw new RuntimeException("A conexão com o banco falhou");
        }


    }
}
