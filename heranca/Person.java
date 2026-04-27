/*1. Escreva uma classe chamada Pessoa com os atributos: nome, sexo, idade. Crie os métodos get/set para cada atributo e um construtor para a classe. Escreva agora outra classe chamada Amigo, que é uma pessoa (estende da classe Pessoa) de quem sabemos o dia de seu aniversário, com o atributo diaDoAniversario. Crie os métodos get/set para o atributo e um construtor para a classe (Lembre que esta classe herda os mesmos atributos de Pessoa). Defina as visibilidades adequadas para cada atributo/método nas duas classes.
23/04/2026
*/

public class Person {

    private String name;
    private String gender;
    private int age;

    Person (String name,  String gender, int age) {
        
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name= name;
    }

    public String getGender(){

        return gender;
    }

    public void setGender(String gender){

        this.gender = gender;
    }

    public int getAge(){

        return age;
    }

    public void setAge(int age){

        this.age = age;
    }
    
}
