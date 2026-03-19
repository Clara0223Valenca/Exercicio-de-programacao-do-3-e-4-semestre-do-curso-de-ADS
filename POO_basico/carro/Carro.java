
/*5. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
19/03/2026 */

public class Carro {
    
    String modelo;
    int ano;
    String cor;
    

    int idadeCarro(int anoAtual){

        int idade = anoAtual - ano;

        return idade;
    }

    void fichaTecnica () {

        System.out.println("O carro " + cor + " do modelo " + modelo + " é do ano de " + ano);
    }
}
