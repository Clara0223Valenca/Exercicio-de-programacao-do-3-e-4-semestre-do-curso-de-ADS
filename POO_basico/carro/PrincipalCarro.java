import java.util.*;

public class PrincipalCarro {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();


        Carro carro1 = new Carro();

        carro1.modelo = "BYD";
        carro1.cor = "branco";
        carro1.ano = 2024;
        carro1.fichaTecnica();
        System.out.println("A idade do carro é: " + carro1.idadeCarro(anoAtual));



        Carro carro2 = new Carro();

        carro2.modelo = "Chevette";
        carro2.cor = "Azul";
        carro2.ano = 1986;
        carro2.fichaTecnica();
        System.out.println("A idade do carro é: " + carro2.idadeCarro(anoAtual));



    }

}