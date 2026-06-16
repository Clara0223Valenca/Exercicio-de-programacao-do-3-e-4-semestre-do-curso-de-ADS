/*4. Em um jogo, diferentes classes de personagens atacam de formas variadas. O guerreiro ataca fisicamente, mas também pode desferir um ataque focado. Então desenvolva o seguinte:
Crie uma classe base Personagem com o método atacar(), que imprime "Personagem atacou!".
Crie uma subclasse Guerreiro. Modifique o método atacar para imprimir "Guerreiro desferiu golpe com espada!".
Na classe Guerreiro, crie uma variação do método atacar que recebe uma String arma, imprimindo "Guerreiro atacou utilizando [arma]!".
 15/06/2026*/

package Game;

public class Character {
    
    public void attack(){
        
        System.out.println("Personagem atacou !");
    }
}
