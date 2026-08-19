import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContatosDAO {
    
    private ConnectionDB connectionDB = new ConnectionDB();

    public void create(String name, String telephone){
        
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
            
            System.out.println("Cadastro de contato falhou");
        }
    }

    public void read(){
        //implementação
    }

    public void update(int id, String name, String telephone){
        //implementação
    }

    public void delete(int id){
        //implementação
    }

}
