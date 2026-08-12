package Temperatures;
/*2. Considere o problema de conversão de temperaturas entre Celsius e Fahrenheit em Java.
a) Crie uma classe com dois métodos que permitam a conversão de temperaturas de Celsius para Fahrenheit e vice-versa.
b) Cada método deverá receber as temperaturas de origem em double, porém caso o valor a ser convertido seja menor que zero absoluto (-459,67°F ou -273,15ºC) deve-se lançar uma exceção informando que o valor informado está abaixo do zero absoluto. 
c) No método principal, instancie o objeto e chame os métodos correspondentes informando valores diferentes para testar.

04/08/2026
*/

public class Temperatures {

    private double result;

    public double getResult() {
        return result;
    }
    
    public void setResult(double result) {
        this.result = result;
    }

    public void convertsToCelsius(double temp) throws Exception{

        if (temp <= -459.67) {

                throw new Exception( "o valor a ser convertido não pode ser menor que zero absoluto (-459,67°F)");
        }        
              
                result = (temp - 32) * 5 / 9 ;      
      
    }

    public void convertsToFahrenheit(double temp) throws Exception{

        if (temp <= -273.15){
            
                throw new Exception( "o valor a ser convertido não pode ser menor que zero absoluto (-273,15ºC)");
        }
        
                result = (temp * 1.8) + 32; 
                
    }
    
}
