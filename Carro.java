public class Carro {
    
    //ATRIBUTOS (características)
    String cor;
    String marca;
    int velocidade;

    // MÉTODOS (comportamentos)
    void acelerar() {

        System.out.println("O carro está acelerando.");
    }

    void freiar() {

        System.out.println("O carro freiou");
    }

    void dados() {

        System.out.println("Este é um carro " + cor + " da marca " + marca);
    }
}
