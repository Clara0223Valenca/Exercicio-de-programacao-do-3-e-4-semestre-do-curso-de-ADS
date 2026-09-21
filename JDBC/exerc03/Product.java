import java.io.BufferedWriter;
import java.util.ArrayList;

public class Product {

    private String name;
    private int quantity;
    private ArrayList<String> listProducts;
    private static void file;


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void writerFile(String file){
        String file = file;
        
        try (BufferedWriter bw = new BufferedWriter(FileWriter)){
    
        } catch (){
    
        }

    } 
}