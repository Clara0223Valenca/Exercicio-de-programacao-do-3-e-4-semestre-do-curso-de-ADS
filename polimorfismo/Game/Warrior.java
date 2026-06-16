/*Crie uma subclasse Guerreiro. Modifique o método atacar para imprimir "Guerreiro desferiu golpe com espada!".
Na classe Guerreiro, crie uma variação do método atacar que recebe uma String arma, imprimindo "Guerreiro atacou utilizando [arma]!".
15/06/2026*/
package Game;

public class Warrior extends Character{
    
    @Override
    public void attack(){
        System.out.println("Guerreiro desferiu golpe com espada!");
    }

    public void attack(String gun){

        System.out.println("Guerreiro atacou utilizando " + gun + "!");
    }

    
}
