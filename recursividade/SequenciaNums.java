package recursividade;
/* 2. Crie um método recursivo que imprima os números de 1 até n. 
05/03/2026*/

import java.util.*;
;
public class SequenciaNums {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite até qual número deseja imprimir");
        int n = scanner.nextInt();

        printaNumeros(1 ,n);

    }

    static void printaNumeros (int inicial, int limite) {

        System.out.print(inicial + " ");

        if (inicial < limite) {

            printaNumeros(inicial + 1, limite);
        }
    }
    
}


