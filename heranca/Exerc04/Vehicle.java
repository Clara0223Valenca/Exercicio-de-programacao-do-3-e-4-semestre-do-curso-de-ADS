package Exerc04;

/*4. Desenvolva classes para diferentes tipos de veículos em uma transportadora. Crie uma classe abstrata chamada Veiculo com os atributos marca e modelo. Adicione um método concreto exibirDados() que imprime a marca e o modelo. Adicione um método abstrato chamado calcularConsumo(double distancia). Desenvolva ainda uma subclasse Caminhao que herda de Veiculo. No método calcularConsumo, a lógica deve ser distancia / 5. Crie uma subclasse Moto que herda de Veiculo. No método calcularConsumo, a lógica deve ser distancia / 25. Para os testes, instancie um Caminhao e uma Moto, chame exibirDados() e mostre o consumo para uma viagem de 100km.
 */

public abstract class Vehicle {

    private String brand;  
    private String model;


    public void displayData() {

        System.out.println("\nMarca: " + brand + "\nModelo: " + model);
    }

    public abstract double calculateConsumption(double distance);

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
