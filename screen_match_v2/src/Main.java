import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Batman - Begins", "Ação",
                140, 2005, 8.2, true);

        movie1.showTechnicalSheet();

        Movie movie2 = new Movie ("Batman - O Cavaleiro das Trevas", "Ação",
                152, 2008, 9.3, true);
        System.out.println();
        System.out.println(movie2.getName());
        System.out.println();
        movie2.showTechnicalSheet();



        movie1.newReview(9);
        movie1.newReview(9.5);
        movie1.newReview(8.5);

        movie2.newReview(10);
        movie2.newReview(9.5);
        movie2.newReview(9.8);

        double review = movie1.getFinalUsersReview();
        System.out.printf("Begins -> Avaliação dos usuários: %.1f\n", review);

        double review2 = movie2.getFinalUsersReview();
        System.out.printf("O Cavaleiro das Trevas -> Avaliação dos usuários: %.1f\n", review2);
    }
}
