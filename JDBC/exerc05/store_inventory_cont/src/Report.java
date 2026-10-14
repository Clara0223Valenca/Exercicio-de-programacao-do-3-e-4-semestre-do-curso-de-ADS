//SEMPRE compilar quando for um novo projeto : 
//javac -cp mysql-connector-j-x.x.x.jar ../src/nome_da_sua_classe.java

/*Na atividade 2, criamos um módulo backend de controle de estoque para um pequeno comércio local. Nesta atividade você vai incrementar este módulo, implementando a geração de relatórios CSV (Comma-Separated Values). O usuário, através do menu da aplicação, poderá escolher gerar os seguintes relatórios, mantendo como cabeçalho os nomes das colunas da tabela:
- Completo: relatório contendo todos os registros da tabela;
- Por quantidade: todos os registros da tabela que contenham valores abaixo ou acima (escolhido pelo usuário) de um determinado valor informado pelo usuário. 
 06/10/2026 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Report {

     private String csvFullReport = "fullReport.csv";

    private ConnectionDB connectionDB = new ConnectionDB();
    
    
    public void fullReport(){
        //ler do banco
        //gravar no csv
        String sql = "SELECT id, name, price, quantity"
                + "FROM products";

        try {
            Connection con = connectionDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFullReport));

            bw.write("ID, Name, Price, Quantity");
            bw.newLine();

            while (result.next()) {

                int id = result.getInt(1);
                String name = result.getString(2);
                double price = result.getDouble(3); 
                int quantity = result.getInt(4);
             
                String formatLine = id+ "," + name + "," + price + "," + quantity;

                //Poderia ser tudo getString também, porque nesse caso não precisa converter, do banco vem string no csv vai ser string, não faremos calculos:

                
                //se tiver só números mas for varchar, pode usar getInt que vai converter

                bw.write(formatLine);
                bw.newLine();
            }

            System.out.println("\nRelatório gerado com sucesso!\n");
            bw.close();

            
        } catch (SQLException e) {

            System.out.println("Falha ao ler banco de dados.");

        } catch (IOException e) {

            System.out.println("Falha ao criar arquivo CSV");
        }
    }

}
