import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.printf("Média das notas: %.1f\n", meuFilme.pegaMedia());
//        meuFilme.somaDasAvaliacoes = 10;
//        meuFilme.totalDeAvaliacoes = 1;

        System.out.println();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.setNumeroDeTemporadas(6);
        lost.setEpisodiosPorTemporada(22);
        lost.setMinutosPorEpisodio(43);
        lost.setAtiva(false);
        lost.exibeFichaTecnica();
        System.out.printf("Temporadas: %d temporadas \n", lost.getNumeroDeTemporadas());
        System.out.printf("Episódios por temporada: %d episódios \n", lost.getEpisodiosPorTemporada());
        System.out.printf("Minutos por episódio: %d minutos \n", lost.getMinutosPorEpisodio());
        System.out.println("Lost ainda está em exibição? " + lost.isAtiva());


    }
}