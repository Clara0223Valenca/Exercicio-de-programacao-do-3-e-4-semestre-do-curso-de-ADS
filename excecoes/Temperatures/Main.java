package Temperatures;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        double temp;
        Temperatures temperatures = new Temperatures();
        Scanner sc = new Scanner(System.in);

        System.out.println("Se deseja converter o valor de Fahrenheit para Celsius, digite 1, se deseja fazer a operação contrária, digite 2");
        int opt = sc.nextInt();

        System.out.println("Digite a temperatura a ser convertida");
        temp = sc.nextDouble();
   
      
        if (opt == 1) {
            try {

                    temperatures.convertsToCelsius(temp);
                    System.out.println(temp + "ºC equivale a " + temperatures.getResult() + "ºC");
            } catch (Exception e) {

                    System.out.println("Falha: " + e.getMessage());

            }
        }

        if (opt == 2) {
            try {
                
                    temperatures.convertsToFahrenheit(temp);
                    System.out.println(temp + "ºC equivale a " + temperatures.getResult() + "ºF");

                
            } catch (Exception e) {

                    System.out.println("Falha: " + e.getMessage());
                
            }
        }

        // if (opt != 1 && opt != 2) {
            
        //     System.out.println("Opção inválida");
        // }
    }
}
