package Animal;
/*Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. 
Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.*/

public class Dog extends Animal{
    
    @Override
    public void makeSound() {

        System.out.println("Au au!");
    }


    public void abanarRabo(){
        System.out.println("O cachorro esta abanando o rabo🐕");
    }
}
