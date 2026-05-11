/*6. Desenvolva um sistema para cadastro de produtos eletrônicos. Crie uma classe abstrata Produto, que possui os atributos privados nome e preco. Crie também uma classe Notebook, que herde de Produto, com um atributo privado memoriaRAM. A classe Notebook deverá ter um método construtor e um método para exibir os dados do notebook. Codifique também os métodos get e set para ambas as classes. No main, crie pelo menos um objeto e apresente as informações.
11/05/2026*/
public abstract class Product {
    
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
