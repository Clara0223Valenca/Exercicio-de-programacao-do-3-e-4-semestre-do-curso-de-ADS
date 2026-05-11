/*A classe Notebook deverá ter um método construtor e um método para exibir os dados do notebook. Codifique também os métodos get e set para ambas as classes. No main, crie pelo menos um objeto e apresente as informações.
11/05/2026*/ 
public class Laptop extends Product {
    
    private int memoryRAM;
    public Laptop(String name, double price, int memoryRAM) {
        super(name, price);
        this.memoryRAM = memoryRAM;
    }
    
    public int getMemoryRAM() {
        return memoryRAM;
    }
    
    public void setMemoryRAM(int memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    //Para ter construtor na classe filha, é necessário ter um construtor na classe pai.
}
