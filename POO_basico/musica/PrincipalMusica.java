package musica;

import java.util.*;

public class PrincipalMusica {
    
   public static void main(String[] args) {

    int somaAvaliacoes = 0;
    
    Scanner scanner = new Scanner(System.in);

    Musica musica1 = new Musica();

    musica1.titulo = "Musa do inverno";
    musica1.artista = "Lagum";
    musica1.anoLancamento = "2021";
    System.out.println("Quantas avaliações deseja colocar: ");
    musica1.numAvaliacoes = scanner.nextInt();

    for (int i =0; i < musica1.numAvaliacoes; i++) {

        System.out.println("digite sua avaliação ");
        somaAvaliacoes += scanner.nextInt();
    }

    System.out.println("Média das avaliações " + musica1.mediaAvaliacoes(somaAvaliacoes));

   }
}
