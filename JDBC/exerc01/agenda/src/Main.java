
public class Main {
    
    public static void main(String[] args) {
        
        // ConnectionDB conDB = new ConnectionDB();

        // conDB.connect();
        // System.out.println("Feito!!");

        ContatosDAO cDAO = new ContatosDAO();

        cDAO.create("Clara", "5555555");

    }
}
