package produto;
/* 3. Crie uma classe Produto que possua os seguinte atributos: código, descrição, marca, data de fabricação, prazo de validade, quantidade em estoque, preço. Além disso a classe deve ter os métodos: aumentarEstoque(), diminuirEstoque(), reajustarPreco(), alterardescricao, exibirProduto(). O método exibirProduto deve exibir na tela as características do produto em um formato de frase, legível ao usuário. Crie uma Classe principal que deverá instanciar pelo menos 3 produtos, preencha seus atributos e teste seus métodos.
12/03/2026 */

public class Produto {

    int codigo;
    String descricao;
    String marca;
    String dataFabricacao;
    String prazoValidade;
    int qntdEstoque;
    double preco;
    

    int aumentarEstoque(int entrada) {

        return qntdEstoque += entrada;
    }


    int diminuirEstoque(int saida) {

        return qntdEstoque -= saida;
    }


    double reajustarPreco( double novoPreco) {

        return preco = novoPreco;
    }


    String alterarDescricao(String novaDescricao) {

        return descricao = novaDescricao;
    }


    void exibirProduto(){

        System.out.println("O produto " + descricao + " referente ao código " + codigo + " , da marca " + marca +  " custa R$" + preco + " e contém " + qntdEstoque + " no estoque.");
        System.out.println("Data de fabricação :" + dataFabricacao   + "          Prazo de validade: " + prazoValidade);
    }

}
