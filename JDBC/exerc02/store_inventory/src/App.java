//SEMPRE compilar quando for um novo projeto : 
//javac -cp mysql-connector-j-x.x.x.jar ../src/nome_da_sua_classe.java

import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        /* ConnectionDB conDB = new ConnectionDB();
        conDB.connect();
        System.out.println("Feito!!"); */

        ProductDAO pDAO = new ProductDAO();

        /* pDAO.create(new Product("Blusa de manga comprida", 50.00, 2)); 
        pDAO.create(new Product("Calça", 250.00, 1)); 
        pDAO.create(new Product("Blusa azul com brilho", 180.00, 10)); 
        pDAO.create(new Product("Conjunto saia e blusa infantil", 200.00, 3));  */


        //Buscar produto pelo nome
        ArrayList<Product> products =
                pDAO.searchByName("Blusa");

        if (products.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
            return;
        }

        for (Product product : products) {
            product.display();
        }
    }
}
