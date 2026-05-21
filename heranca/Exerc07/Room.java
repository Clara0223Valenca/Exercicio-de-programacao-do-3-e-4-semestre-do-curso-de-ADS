package Exerc07;
/*7. Uma pousada deseja desenvolver um sistema para controlar suas suítes de luxo disponíveis para hospedagem. A superclasse deverá ser abstrata e se chamar Quarto, tendo como atributos privados: numeroQuarto, valorDiaria, ocupado (um boolean) e um método construtor. A subclasse deverá se chamar SuiteLuxo, com atributos privados: possuiHidromassagem (um boolean), quantidadeCamas, vistaMar (um boolean) e um construtor. Crie os métodos get e set para todos os atributos de ambas as classes. Na subclasse crie um método mostrarSuite() que exiba todas as informações da suíte, incluindo os atributos herdados da classe Quarto. No main, crie um objeto da classe SuiteLuxo e preencha todos os dados, depois exiba os dados da suíte chamando o método mostrarSuite(). Faça ainda, altere o status do quarto para ocupado, aumente o valor da diária para R$ 1150,00 e exiba novamente todas as informações atualizadas.
18/05/2026*/

public class Room {
    
    private int roomNumber;
    private double valueDailyRate;
    private boolean occupied;

    public Room(int roomNumber, double valueDailyRate, boolean occupied) {

        this.roomNumber = roomNumber;
        this.valueDailyRate = valueDailyRate;
        this.occupied = occupied;

        
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getValueDailyRate() {
        return valueDailyRate;
    }

    public boolean occupied(){

        return occupied;
    }
}
