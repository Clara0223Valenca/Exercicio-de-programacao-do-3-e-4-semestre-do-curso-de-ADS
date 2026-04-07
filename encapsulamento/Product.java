/*3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto. Instancie e realize testes.
 */
public class Product {
    
    private String name;
    private double price;


    public String getName(){

        return name;
    }

    public double getPrice(){

        return name;
    }

    public void applyDiscount(double percentagem){

        price = price - (price*percentagem)/100;


    }


    
}
