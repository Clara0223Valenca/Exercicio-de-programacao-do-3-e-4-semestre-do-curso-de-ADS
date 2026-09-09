//SEMPRE compilar quando for um novo projeto : 
//javac -cp mysql-connector-j-x.x.x.jar ../src/nome_da_sua_classe.java

import java.util.ArrayList;
import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDAO productDAO = new ProductDAO();

        int option;

        do {
            System.out.println("\n===== CONTROLE DE ESTOQUE =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por nome");
            System.out.println("3 - Atualizar estoque");
            System.out.println("4 - Excluir produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();

                    System.out.print("Preço: ");
                    double price = scanner.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantity = scanner.nextInt();

                    Product product =
                        new Product(name, price, quantity);

                    productDAO.create(product);
                    break;

                case 2:
                    System.out.print("Nome para busca: ");
                    String searchTerm = scanner.nextLine();

                    ArrayList<Product> products = productDAO.searchByName(searchTerm);

                    if (products.isEmpty()) {
                        System.out.println( "Nenhum produto encontrado.");
                    } else {
                        for (Product foundProduct : products) {
                            foundProduct.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("ID do produto: ");
                    int updateId = scanner.nextInt();

                    System.out.print("Nova quantidade: ");
                    int newQuantity = scanner.nextInt();

                    boolean updated = productDAO.updateInventory(updateId, newQuantity);

                    if (updated) {
                        System.out.println(
                            "Estoque atualizado com sucesso."
                        );
                    } else {
                        System.out.println(
                            "Falha ao atualizar o estoque."
                        );
                    }
                    break;

                case 4:
                    System.out.print("ID do produto: ");
                    int deleteId = scanner.nextInt();

                    boolean deleted =
                        productDAO.delete(deleteId);

                    if (deleted) {
                        System.out.println("Produto excluído com sucesso.");
                    } else {
                        System.out.println("Falha ao excluir o produto.");
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (option != 0);

        scanner.close();
    }
}
