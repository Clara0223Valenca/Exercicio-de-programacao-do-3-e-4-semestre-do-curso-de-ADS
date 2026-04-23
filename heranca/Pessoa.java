/*1. Escreva uma classe chamada Pessoa com os atributos: nome, sexo, idade. Crie os métodos get/set para cada atributo e um construtor para a classe. Escreva agora outra classe chamada Amigo, que é uma pessoa (estende da classe Pessoa) de quem sabemos o dia de seu aniversário, com o atributo diaDoAniversario. Crie os métodos get/set para o atributo e um construtor para a classe (Lembre que esta classe herda os mesmos atributos de Pessoa). Defina as visibilidades adequadas para cada atributo/método nas duas classes.
 */

public class Pessoa {

    private String nome;
    private String sexo;
    private int idade;

    Pessoa (String nome,  String sexo, int idade) {
        
        this.nome = nome;
        
    }
    
}
