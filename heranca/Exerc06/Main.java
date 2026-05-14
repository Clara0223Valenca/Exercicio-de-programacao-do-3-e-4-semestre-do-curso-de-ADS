/*Ajuste o código da questão, e no método principal/main, crie um vetor que deverá armazenar até 3 objetos do tipo Notebook. Após, utilizando uma estrutura de repetição, percorra o vetor chamando o método exibirInformacoes() para cada objeto armazenado, exibindo as informações dos notebooks ao usuário.
07/05/2026*/
package Exerc06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Laptop laptops[] = new Laptop[3];

        for (int i = 0; i < laptops.length; i++) {
            
            System.out.print("Digite o nome: ");
            String name = scanner.nextLine();

            System.out.print("Digite o preço: ");
            double price = scanner.nextDouble();

            System.out.print("Digite a quantidade de memória RAM: ");
            int memoryRam =  scanner.nextInt();

            scanner.nextLine();

            laptops[i] = new Laptop(name, price, memoryRam);
        }

        for (Laptop laptop : laptops) {
            
            laptop.displayLaptop();
        }
    }
    
}
