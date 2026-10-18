//SEMPRE compilar quando for um novo projeto : 
//javac -cp mysql-connector-j-x.x.x.jar ../src/nome_da_sua_classe.java

/*Na atividade 2, criamos um módulo backend de controle de estoque para um pequeno comércio local. Nesta atividade você vai incrementar este módulo, implementando a geração de relatórios CSV (Comma-Separated Values). O usuário, através do menu da aplicação, poderá escolher gerar os seguintes relatórios, mantendo como cabeçalho os nomes das colunas da tabela:
- Completo: relatório contendo todos os registros da tabela;
- Por quantidade: todos os registros da tabela que contenham valores abaixo ou acima (escolhido pelo usuário) de um determinado valor informado pelo usuário. 
 06/10/2026 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Report {

    //evita redundância de código pois a única mudança é CSV

    public void fullReport (String header, ArrayList<String> listProducts){
        report(header, listProducts, "fullReport.csv");
    }
    
    public void reportByQuantity(String header, ArrayList<String> listProducts){
        report(header, listProducts, "reportByQuantity.csv");
    }
    
    private void report(String header, ArrayList<String> listProducts, String csv){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(csv, false))){
          
            
            bw.write(header);
            bw.newLine();

            for (String product : listProducts) {

                bw.write(product);
                bw.newLine();
            }

            System.out.println("\nRelatório gerado com sucesso!\n");
        

        } catch (IOException e) {

            System.out.println("Falha ao criar arquivo CSV");
        }
    }

}
