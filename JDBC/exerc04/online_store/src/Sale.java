import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sale {

    private String csvJanuary = "JanuarySales.csv";

    private ConnectionDB connectionDB = new ConnectionDB();
    
    public void readSQLAndWriteCSV(){
        String sql = "SELECT id_venda, produto, quantidade, preco_unitario, data_venda "
                + "FROM vendas WHERE MONTH(data_venda) = 1";

        try {
            Connection con = connectionDB.connect();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            BufferedWriter bw = new BufferedWriter(new FileWriter(csvJanuary));

            bw.write("ID Venda,Produto,Quantidade,PrecoUnitario,DataVenda");
            bw.newLine();

            while (result.next()) {

                int idVenda = result.getInt(1);
                String product = result.getString(2);
                int quantity = result.getInt(3); 
                double unitPrice = result.getDouble(4);
                String saleDate = result.getString(5);

                String formatLine = idVenda + "," + product + "," + quantity + "," + unitPrice + "," + saleDate;

                //Poderia ser também, porque nesse caso não precisa converter, do banco vem string no csv vai ser string, não faremos calculos:
                
                // String formatLine =  result.getString(1) + "," +
                // result.getString(2) + "," +
                // result.getString(3) + "," +
                // result.getString(4) + "," +
                // result.getString(5) + "\n";
                
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

    public void readCSV() {

    
        //try with resources
        try (BufferedReader br = new BufferedReader(new FileReader(csvJanuary))){

        
            System.out.println("\n------Lendo arquivo CSV------\n");
            br.readLine();

            System.out.println("ID Venda|Produto|Quantidade|Preço Unitário|Data da Venda");
            

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
  

        } catch (IOException e) {

            System.out.println("Falha ao ler o arquivo CSV.");
        }
    }
}
