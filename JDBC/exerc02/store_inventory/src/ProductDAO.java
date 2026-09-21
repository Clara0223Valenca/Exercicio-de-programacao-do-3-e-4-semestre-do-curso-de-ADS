import java.sql.Connection;
import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.ArrayList;

public class ProductDAO {

    private ConnectionDB connectionDB = new ConnectionDB();

    public void create(Product product) {

        String sql = "INSERT INTO product(name, price, quantity) VALUES (?, ?, ?)";
        // 1 /2 /3
        try {

            Connection conDB = connectionDB.connect();
            PreparedStatement ps = conDB.prepareStatement(sql);

            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQuantity());
            ps.execute();

            System.out.println("Item cadastrado no estoque");

        } catch (Exception e) {

            System.out.println("Cadastro de item no estoque falhou.");
        }
    }

    // public ArrayList<Product> readByName(String name) {

    //     String sql = "SELECT * FROM store_inventory";

    //     try {
    //         Connection con = connectionDB.connect();
    //         PreparedStatement ps = con.prepareStatement(sql);
    //         ResultSet result = ps.executeQuery();

    //         while (result.next()) {

    //             int id = result.getInt(1);
    //             String name = result.getString(2);
    //             String telephone = result.getString(3);
    //             System.out.println(
    //                     "ID: " + id + " | " +
    //                             "NOME: " + name + " | " +
    //                             "TELEFONE: " + telephone

    //             );
    //         }

    //     } catch (SQLException e) {
    //         System.out.println("Falha na leitura do banco.");
    //     }
    // }

    // public boolean updateInventory(int id, int newQuantity) {

    // }

    // publicboolean delete(int id) {

    // }
}
