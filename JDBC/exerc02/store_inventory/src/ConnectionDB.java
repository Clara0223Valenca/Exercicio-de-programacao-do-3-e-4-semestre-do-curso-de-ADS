import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    

    //makes connection
    public Connection connect(){
        
       
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/store_inventory", "root", "");
        } catch (SQLException e) {

            throw new RuntimeException("A conexão com o banco falhou");
        }


    }
}
