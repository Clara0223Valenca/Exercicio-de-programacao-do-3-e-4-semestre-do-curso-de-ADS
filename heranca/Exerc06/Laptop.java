/*Crie também uma classe Notebook, que herde de Produto, com um atributo privado memoriaRAM. A classe Notebook deverá ter um método construtor e um método para exibir os dados do notebook. Codifique também os métodos get e set para ambas as classes. No main, crie pelo menos um objeto e apresente as informações.
07/05/2026*/
package Exerc06;

public class Laptop extends Product {

    private int memoryRam;

    public Laptop(String name, double price, int memoryRam) {

        setName(name);
        setPrice(price);
        this.memoryRam = memoryRam;
    }

    public void displayLaptop() {

        System.out
                .println("\nNome: " + getName() + "\nPreço: R$ " + getPrice() + "\nQntd de memória ram: " + memoryRam);
    }

    /*@Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }*/
}
