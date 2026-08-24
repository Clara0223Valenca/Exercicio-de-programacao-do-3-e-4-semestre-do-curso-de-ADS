//javac -cp mysql-connector-j-x.x.x.jar ../src/nome_da_sua_classe.java
public class Main {
    
    public static void main(String[] args) {
        
        // ConnectionDB conDB = new ConnectionDB();

        // conDB.connect();
        // System.out.println("Feito!!");

        ContatosDAO cDAO = new ContatosDAO();

        //cDAO.Create("Clara", "5555555");

        cDAO.Read();

        cDAO.Update(2, "Vitória", "666666");

   

    }
}
