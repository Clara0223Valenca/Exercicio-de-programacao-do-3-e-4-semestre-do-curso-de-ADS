//SEMPRE compilar quando for um novo projeto : 
//javac -cp mysql-connector-j-x.x.x.jar ../src/nome_da_sua_classe.java

/*Na atividade 2, criamos um módulo backend de controle de estoque para um pequeno comércio local. Nesta atividade você vai incrementar este módulo, implementando a geração de relatórios CSV (Comma-Separated Values). O usuário, através do menu da aplicação, poderá escolher gerar os seguintes relatórios, mantendo como cabeçalho os nomes das colunas da tabela:
- Completo: relatório contendo todos os registros da tabela;
- Por quantidade: todos os registros da tabela que contenham valores abaixo ou acima (escolhido pelo usuário) de um determinado valor informado pelo usuário. 
 06/10/2026 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* ConnectionDB conDB = new ConnectionDB();
        conDB.connect();
        System.out.println("Feito!!"); */

        
    Scanner sc = new Scanner(System.in);

    ProductDAO pDAO = new ProductDAO(); 
 
    int op = 0;

    do {

      String menu= "\n Controle de Estoque\n"
      +"1 - Inserir produto\n"
      +"2 - Buscar produto pelo nome\n"
      +"3 - Atualizar estoque\n"
      +"4 - Excluir produto\n"
      +"5 - Gerar relatório completo\n"
      +"6 - Gerar relatório por quantidade\n"
      +"7 - Sair\n\n"
      +"Escolha uma opção: ";

      System.out.println(menu);
      op = sc.nextInt();
      sc.nextLine();

      switch (op) {

        case 1:

          System.out.print("\nDigite o nome do produto: ");
          String name = sc.nextLine();
          System.out.print("Digite o preço: ");
          double price = sc.nextDouble();
          System.out.print("Digite a quantidade: ");
          int quantity = sc.nextInt();
          //sc.nextLine();
          pDAO.create(new Product(name, price, quantity));
          break;

        case 2:
        
            System.out.print("Nome para busca: ");
            String searchTerm = sc.nextLine();

            ArrayList<Product> products = pDAO.searchByName(searchTerm);

            if (products.isEmpty()) {
                 System.out.println( "Nenhum produto encontrado.");
            } else {
                for (Product foundProduct : products) {
                    foundProduct.display();
            }
        }
         break;

        case 3:
          System.out.print("Digite o ID do produto: ");
          int id = sc.nextInt();
          System.out.print("Digite a nova quantidade: ");
          int newQuantity = sc.nextInt();
          sc.nextLine();
          pDAO.updateInventory(id, newQuantity);
          break;

        case 4:
          System.out.print("Digite o ID do produto que deseja excluir: ");
          id = sc.nextInt();
          sc.nextLine();
          pDAO.delete(id);
          break;

        case 5:
          pDAO.readAll();
          break;

        case 6:
          System.out.println("Digite a quantidade de corte do relatório");
          int qtt = sc.nextInt();
          System.out.println("Digite se deseja ver os produtos que tem uma quantidade 'maior' ou que uma quantidade 'menor' que quantidade de corte digitada: ");
          String operator = sc.next();
          pDAO.readByQuantity(qtt, operator);
          break;

        case 7:
          System.out.println("Saindo!");
          break;

        default:
          System.out.println("Opção inválida!");
      }

    } while (op != 7);

    }
}
