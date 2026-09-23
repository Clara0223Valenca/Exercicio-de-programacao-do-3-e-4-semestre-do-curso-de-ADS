package Exerc04;
/*Crie uma subclasse Moto que herda de Veiculo. No método calcularConsumo, a lógica deve ser distancia / 25. */
public class Motorcycle extends Vehicle{

    @Override
    public double calculateConsumption(double distance) {
        return distance/25;
    }
    
}