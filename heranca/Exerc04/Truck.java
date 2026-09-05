package Exerc04;
/*Desenvolva ainda uma subclasse Caminhao que herda de Veiculo. No método calcularConsumo, a lógica deve ser distancia / 5.  */
public class Truck extends Vehicle {
    
    public double calculateConsumption(double distance){
        
        return distance / 5;

    }
}
