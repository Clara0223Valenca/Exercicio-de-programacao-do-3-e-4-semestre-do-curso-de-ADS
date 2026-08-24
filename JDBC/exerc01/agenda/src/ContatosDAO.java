import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContatosDAO {
    
    private ConnectionDB connectionDB = new ConnectionDB();

    //cadastrar
    public void Create(String name, String telephone){
        
        String sql = "INSERT INTO contatos(nome, telefone) " + "VALUES (?, ?)";
                                                                      //1 //2
        try {
            
            Connection conDB = connectionDB.connect();
            PreparedStatement ps = conDB.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, telephone);
            ps.execute();

            System.out.println("Contato Cadastrado");

            
        } catch (Exception e) {
            
            System.out.println("Cadastro de contato falhou.");
        }
    }

    //listar
    public void Read(){
        String sql = "SELECT * FROM contatos";

        try {
            Connection con = connectionDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                
                int id = result.getInt(1);
                String name = result.getString(2);
                String telephone = result.getString(3);
                System.out.println(
                    "ID: " + id + " | " +
                    "NOME: " + name + " | " +
                    "TELEFONE: " + telephone

                );
            }



        } catch (SQLException e) {
            System.out.println("Falha na leitura do banco.");
        }
    }

    //editar
    public void Update(int id, String name, String telephone){
        String sql = "UPDATE contatos SET nome = ?, telefone = ?"
        + "WHERE id = ?";

        try {
            Connection con = connectionDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, telephone);
            ps.setInt(3, id);
            int affectedLines = ps.executeUpdate(); //retorna o número de linhas afetadas
            
            if (affectedLines > 0) {
                System.out.println("\n Contato editado com sucesso!");
            } else {
                System.out.println("\n Nenhum contato encontrado com o id informado!");
            }

        } catch (SQLException e) {
            
            System.out.println("Falha ao editar contato.");
        }
        
    }

    //apagar
    public void Delete(int id){
        String sql = "DELETE FROM contatos"
        + "WHERE id = ?";

        try {
            Connection con = connectionDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
          
            ps.setInt(1,id);
            int affectedLines = ps.executeUpdate();

            if ( affectedLines > 0) {
                
                System.out.println("Contato deletado");
            } else {
                System.out.println("\n Nenhum contato encontrado com o id informado!");
            }

        } catch(SQLException e) {
            
            System.out.println("Falha na operação deletar");
        }
    }

}
