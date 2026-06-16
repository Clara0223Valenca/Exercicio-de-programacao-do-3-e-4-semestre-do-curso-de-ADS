/*5. Crie uma classe “Produto” que possua os atributos “nomeloja” e “preco”, crie os métodos sets e gets para estes atributos. Crie também o atributo “descrição” e seu método chamado “getDescricao” que retorna uma string com o simples conteúdo “Produto de informática”. 
Crie duas classes filhas de “Produto”, que serão “Mouse” com o atributo “tipo” e “Livro” com o atributo “autor”, no método construtor de cada uma dessas classes passe como argumento a descrição desse produto, por exemplo, Mouse(“Mouse ótico, Saída USB. 1.600 dpi”); Crie o método “getDescricao” que retorna a descrição que foi passada no argumento do construtor concatenada com o atributo que a classe tiver, “autor” no caso de livro e “tipo” no caso de mouse, esse método deve ter a mesma assinatura do método “getDescricao” da classe pai “Produto”. 
Crie uma classe “Main” que irá simular a compra de um cliente de vários mouses e livros, deve haver apenas um vetor/ArrayList na classe “Main” para armazenamento de todos os livros e mouses. Esse vetor/ArrayList deve se chamar “carrinho” que simula o carrinho de compras de produtos variados de um cliente em um e-commerce. Insira nesse “carrinho” vários mouses e livros e depois chame o método “getDescricao” de todos os objetos presentes no vetor/ArrayList. Para o usuário do carrinho saber as informações dos produtos em seu carrinho.
15/06/2026 */

package Product;

public class Product {
    
    private String storeName;
    private double price;
    private String descricao;


    public String getStoreName(){

        return storeName;
    }

    public double getPrice(){

        return price;
    }

    public String getDescricao(){

        return "Produto de informática";
    }

    public String getDescricao(String descricao){

        return descricao;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setPrice(double price){

        this.price = price;
    }


}
