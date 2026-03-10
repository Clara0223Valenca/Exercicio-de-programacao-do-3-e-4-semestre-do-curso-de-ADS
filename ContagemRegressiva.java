/* 1. Crie um método recursivo que receba um número inteiro n e imprima na tela a contagem regressiva de n até 0.
 05/03/2026*/

import java. util.*;

public class ContagemRegressiva {
    public static void main(String[] args) {

        int n;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite o número que vai ser decrementado"); 
        n = scanner.nextInt();

        regressiva(n);
    }

    static void regressiva (int n){

        System.out.println(n); 
        
        if ( n > 0) { //caso base

            regressiva(n - 1); //caso recursivo
        }
    }
}
