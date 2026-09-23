import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CoffeeSales {

    // private String name;
    // private int quantity;
    private static ArrayList<String> listProducts =  new ArrayList<>();



    public void Sale(String name, int quantity){

        String sale = name + " ; " + quantity + "\n";
        listProducts.add(sale);
    }

    public static void writerFile(String file){
   
        boolean append = false; // acrescenta no arquivo

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, append))){
            

            for(int i = 1; i < listProducts.size(); i++){

                String line = listProducts.get(i);
                bw.write(line);
            }

            System.out.println("Arquivo criado!\n");
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

    } 

    
	// public static void readFile(String file) {

	// 	try (BufferedReader br = new BufferedReader(new FileReader(file))) {

	// 		br.readLine(); // descarta o cabeçalho
			
	// 		System.out.println("Descrição | Preço | Quantidade");
			
	// 		String linha = br.readLine(); // lê a primeira linha
	// 		while (linha != null) {

	// 			String[] vet = linha.split(",");
				
	// 			String nome = vet[0];
	// 			Double preco = Double.parseDouble(vet[1]);
	// 			Integer qtd = Integer.parseInt(vet[2]);

	// 			System.out.println(nome + " | " + preco + " | " + qtd);
				
	// 			linha = br.readLine();
	// 		}

	// 	} catch (IOException e) {
	// 		System.out.println("Erro: " + e.getMessage());
	// 	}
	// }
}