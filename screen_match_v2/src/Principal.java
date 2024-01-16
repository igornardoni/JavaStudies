import br.com.alura.screenmatch.calculations.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculations.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme godfather = new Filme();
        godfather.setNome("O Poderoso Chefão");
        godfather.setAnoDeLancamento(1972);
        godfather.setDuracaoEmMinutos(175);

        godfather.exibeFichaTecnica();
        godfather.avalia(8);
        godfather.avalia(5);
        godfather.avalia(10);
        System.out.println("Total de avaliações: " + godfather.getTotalDeAvaliacoes());
        System.out.printf("Média das notas: %.1f\n", godfather.pegaMedia());
//        meuFilme.somaDasAvaliacoes = 10;
//        meuFilme.totalDeAvaliacoes = 1;

        System.out.println(); // Quebra de linha

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
        System.out.println("Lost ainda está em exibição? \n" + lost.isAtiva());
        System.out.printf("Minutos para maratonar Lost: %d minutos \n", lost.getDuracaoEmMinutos());

        System.out.println(); // Quebra de linha

        Filme starWarsEmpire = new Filme();
        starWarsEmpire.setNome("Star Wars - O Império Contra-Ataca");
        starWarsEmpire.setAnoDeLancamento(1980);
        starWarsEmpire.setDuracaoEmMinutos(124);
        starWarsEmpire.setDiretor("George Lucas");

        starWarsEmpire.avalia(8.5);
        starWarsEmpire.avalia(10);
        starWarsEmpire.avalia(8);

        System.out.println(); // Quebra de linha

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(godfather);
        calculadora.inclui(starWarsEmpire);
        calculadora.inclui(lost);

        System.out.printf("Tempo total para maratonar os " +
                "programas selecionados: %d minutos", calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(godfather);
        filtro.filtrar(starWarsEmpire);

        Episodio episodio001 = new Episodio();
        episodio001.setNumero(15);
        episodio001.setSerie(lost);
        episodio001.setTotalVisualizacoes(352);
        filtro.filtrar(episodio001);
    }
}