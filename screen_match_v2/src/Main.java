import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Batman Begins", "Ação",
                140, 2005, 8.2, true);

        movie1.showTechnicalSheet();

        movie1.newReview(9);
        movie1.newReview(9.5);
        movie1.newReview(8.5);

        double review = movie1.getFinalUsersReview();
        System.out.printf("Avaliação dos usuários: %.1f\n", review);
    }
}
