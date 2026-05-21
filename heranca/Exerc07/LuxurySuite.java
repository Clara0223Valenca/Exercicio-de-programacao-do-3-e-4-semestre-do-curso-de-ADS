package Exerc07;
/* A subclasse deverá se chamar SuiteLuxo, com atributos privados: possuiHidromassagem (um boolean), quantidadeCamas, vistaMar (um boolean) e um construtor. Crie os métodos get e set para todos os atributos de ambas as classes. Na subclasse crie um método mostrarSuite() que exiba todas as informações da suíte, incluindo os atributos herdados da classe Quarto. No main, crie um objeto da classe SuiteLuxo e preencha todos os dados, depois exiba os dados da suíte chamando o método mostrarSuite(). Faça ainda, altere o status do quarto para ocupado, aumente o valor da diária para R$ 1150,00 e exiba novamente todas as informações atualizadas. */

public class LuxurySuite extends Room {

    private boolean hasHydromassage;
    private int quantityBeds;
    private boolean seaView;

    public LuxurySuite(int roomNumber, double valueDailyRate, boolean occupied, boolean hasHydromassage, int quantityBeds, boolean seaView) {

        super(roomNumber, valueDailyRate, occupied);
        this.hasHydromassage = hasHydromassage;
        this.quantityBeds = quantityBeds;
        this.seaView = seaView;

    }

    public boolean getHasHydromassage(){
        return hasHydromassage; 
    }

    public int getQuantityBeds() {
        return quantityBeds;
    }

    public boolean getSeaView() {
        return seaView;
    }
 
    public void setHasHydromassage(boolean hasHydromassage) {
        this.hasHydromassage = hasHydromassage;
    }

    public void setQuantityBeds(int quantityBeds) {
        this.quantityBeds = quantityBeds;
    }
    
    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public void showSuite(){

        System.out.println("Número do Quarto: " + getRoomNumber());
        System.out.println("Valor Diária ");
    }
}
