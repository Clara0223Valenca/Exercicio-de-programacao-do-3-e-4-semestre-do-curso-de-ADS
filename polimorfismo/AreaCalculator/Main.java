package AreaCalculator;

public class Main {

    public static void main(String[] args) {
        
        AreaCalculator calc = new AreaCalculator();
    
        System.out.println("Quadrado " + calc.calculate(3));
        System.out.println("Retângulo " + calc.calculate(4.0,4.0));
        System.out.println("Círculo " + calc.calculate(2, true));
    }
    
}
