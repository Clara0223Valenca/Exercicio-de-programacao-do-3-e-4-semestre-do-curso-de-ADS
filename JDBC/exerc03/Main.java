import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        String name;
        int quantity;
        String file = "log_sale.txt";

        CoffeeSales cs = new CoffeeSales();

        do {
            
            System.out.println("---------- CAFETERIA ----------" +
                "\n 1 - Registrar venda" +
                "\n 2 - Fechar caixa" +
                "\n 3 - Total de itens vendidos" +
                "\n 4 - Sair"
            );

            option = sc.nextInt();

            switch (option) {
                case 1:
                    
                    System.out.println("Digite o nome do produto");
                    name = sc.next();
            
                    System.out.println("Digite a quantidade de " + name + ":");
                    quantity = sc.nextInt();

                    cs.Sale(name, quantity);

                //   for (String prod : cs.listProducts) {
                   
                //            System.out.println(prod);
                    
                //   }

                    break;

                case 2:

                    cs.closeTheRegister(file);
                    break;

                case 3:
                    cs.showTotalSold(file);
            
                default:
                    break;
            }

        } while(option != 4);
       
    }
    }

