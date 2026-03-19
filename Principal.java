public class Principal {

    public static void main(String[] args) {
        
        ClasseCarro carro1 = new ClasseCarro();

        carro1.cor = "vermelho";
        carro1.marca = "Chevrolet";
        carro1.velocidade = 200;
        carro1.acelerar();
        carro1.dados();

        ClasseCarro carro2 = new ClasseCarro();

        carro2.cor = "preto";
        carro2.marca = "Corolla";
        carro2.dados();
        

        Pessoa pessoa1 = new Pessoa();

        pessoa1.exibeMensagem();

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.dobra(9));
    }
}