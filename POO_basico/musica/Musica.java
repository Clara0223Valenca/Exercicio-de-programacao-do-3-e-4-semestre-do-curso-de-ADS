package musica;
/*4. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
16/03/2026 */
public class Musica {
    
    String titulo;
    String artista;
    String anoLancamento;
    double avaliacao;
    int numAvaliacoes;


    void fichaTecnica(){

        System.out.println("A música \"" + titulo + "\" " + "do artista " + artista + ", foi lançada no ano de " + anoLancamento + " e teve como média na avaliação " + avaliacao + " pontos, considerando " + numAvaliacoes + " avaliação(ões)");
    }

    double mediaAvaliacoes(int somaAvaliacoes){

        avaliacao = somaAvaliacoes/numAvaliacoes;

        return avaliacao; 
    }

}
