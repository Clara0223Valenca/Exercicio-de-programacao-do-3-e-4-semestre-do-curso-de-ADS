public class Principal {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.cor = "vermelho";
        carro1.marca = "Chevrolet";
        carro1.velocidade = 200;
        carro1.acelerar();
        carro1.dados();

        Carro carro2 = new Carro();

        carro2.cor = "preto";
        carro2.marca = "Corolla";
        carro2.dados();
        

        Pessoa pessoa1 = new Pessoa();

        pessoa1.exibeMensagem();

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.dobra(9));
    }
}