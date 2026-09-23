import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {

    private final ConnectionDB connectionDB = new ConnectionDB();

    public void create(Product product) {
        String sql = "INSERT INTO product (name, price, quantity) VALUES (?, ?, ?)";

        try (
            Connection connection = connectionDB.connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setInt(3, product.getQuantity());

            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Item cadastrado no estoque.");
            }
        } catch (SQLException e) {
            System.out.println("Cadastro de item no estoque falhou.");
        }
    }

    public ArrayList<Product> searchByName(String searchTerm) {
        String sql = "SELECT id, name, price, quantity FROM product WHERE name LIKE ?";

        ArrayList<Product> products = new ArrayList<>();

        try (
            Connection connection = connectionDB.connect();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, "%" + searchTerm + "%");

            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    int id = result.getInt("id");
                    String name = result.getString("name");
                    double price = result.getDouble("price");
                    int quantity = result.getInt("quantity");

                    Product product = new Product(id, name, price, quantity);

                    products.add(product);
                }
            }
        } catch (SQLException e) {
            System.out.println("Falha ao buscar produtos no banco de dados.");
        }

        return products;
    }

    public boolean updateInventory(int id, int newQuantity) {

        String sql = "UPDATE product SET quantity = ? WHERE id = ?";

        try {
            Connection con = connectionDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, newQuantity);
            ps.setInt(2, id);
            int affectedLines = ps.executeUpdate(); //retorna o número de linhas afetadas
            
            if (affectedLines > 0) {
                return true;

            } else {
                return false;

            }

        } catch (SQLException e) {
            return false;

        }
    }

    public boolean delete(int id) {

         String sql = "DELETE FROM product WHERE id = ?";

        try {
            Connection con = connectionDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
          
            ps.setInt(1,id);
            int affectedLines = ps.executeUpdate();

            if ( affectedLines > 0) {
                return true;

            } else {
                return false;

            }

        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;

        }
    }
}
