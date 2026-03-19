package produto;
import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        
        Produto prod1 = new Produto();

        prod1.codigo = 001;
        prod1.dataFabricacao = "01/10/2025";
        prod1.descricao = "Lapis azul com borracha na ponta";
        prod1.marca = "Fabercastell";
        prod1.prazoValidade = "01/10/2045";
        prod1.preco = 4.50;
        prod1.qntdEstoque = 50;


        /*prod1.exibirProduto();

        prod1.alterarDescricao("caneta");

        prod1.exibirProduto(); */



        do {

            //System.out.println("Selecione o produto que deseja consultar");

            System.out.println("Selecione uma opção : \n 1. aumentar estoque.\n 2. diminuir estoque.\n 3. reajustar preço.\n 4. alterar descrição.\n 5. exibir produto. \n 6. sair ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade: ");
                    int qntd = scanner.nextInt();
                    prod1.aumentarEstoque(qntd);
                    break;
            
                case 2:
                    System.out.println("Digite a quantidade: ");
                    qntd = scanner.nextInt();
                    prod1.diminuirEstoque(qntd);
                    break;

                case 3:
                    System.out.println("Digite o valor: ");
                    double valor = scanner.nextInt();
                    prod1.reajustarPreco(valor); 
                    break;

                case 4:
                    System.out.println("Digite a nova descrição: ");
                    String novaDescricao = scanner.nextLine();
                    prod1.alterarDescricao(novaDescricao);
                    break;

                case 5: 
                    prod1.exibirProduto();
                    break;
                    

                case 6: 
                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }
        
        } while (opcao != 6);
        
    }
    
}
