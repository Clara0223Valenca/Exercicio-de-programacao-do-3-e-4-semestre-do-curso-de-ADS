/* 2. Crie um método recursivo que imprima os números de 1 até n. 
05/03/2026*/

import java.util.*;
;
public class SequenciaNums {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite até qual número deseja imprimir");
        int n = scanner.nextInt();

        q2(1 ,n);

    }

    static void printaNumeros (int inicial, int n) {

        System.out.println(inicial);

        if (inicial < n) {

            printaNumeros(inicial + 1, n);
        }
    }

    //resolução do professor
    static void q2(int n, int limite) {

        System.out.println(n + " ");

        if ( n < limite) 
            q2(n+1, limite);
    }
    
}


