/*3. Implemente um método recursivo que retorne a soma de todos os números naturais de 1 até n.
 05/03/2026 */

import java.util.*;

public class SomaSequencia {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite até qual número deseja soma");
        int n = scanner.nextInt();

        soma(1, n);

    }

    static int soma (int inicial, int n) {

        if (n == 1) {
            
            return 1;

        } else {

            if () {
                
            }
            return inicial + soma (inicial, n);
        }

    }

}
