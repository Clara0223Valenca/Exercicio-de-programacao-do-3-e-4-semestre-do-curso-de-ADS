import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CoffeeSales {

    // private String name;
    // private int quantity;
    public static ArrayList<String> listProducts =  new ArrayList<>();

    public void Sale(String name, int quantity){

        String sale = name + ";" + quantity;
        listProducts.add(sale);
    }

    public static void closeTheRegister(String file){
   
        boolean append = false; // acrescenta no arquivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, append))){
			
            bw.write("Item | Quantidade\n"); // cabeçalho

            for(int i = 0; i < listProducts.size(); i++){

                String line = listProducts.get(i) + "\n";
                bw.write(line);
            }

            System.out.println("Arquivo criado!\n");
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

    } 
    
	public static void showTotalSold(String file) {

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			br.readLine(); // descarta o cabeçalho

			int total = 0;
			
			String line = br.readLine(); // lê a primeira linha
			while (line != null) {
				
				String[] vet = line.split(";");
				
				Integer qtt = Integer.parseInt(vet[1]);
				
				total += qtt;
				
				line = br.readLine();
			}

			System.out.println("Total de itens registrados na loja hoje: " + total);
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}