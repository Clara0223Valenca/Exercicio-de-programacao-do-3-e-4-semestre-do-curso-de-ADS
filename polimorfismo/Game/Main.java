package Game;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Warrior Thor = new Warrior();
        Character Zorro = new Character();

        System.out.print("Qual arma o guerreiro usou? ");
        Thor.attack(scanner.nextLine());

        System.out.println("Testa guerreiro sem argumentos no método:");
        Thor.attack();


        System.out.println("Testa ataque de personagem qualquer");
        Zorro.attack();
        

    }
}