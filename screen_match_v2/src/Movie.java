public class Movie {
    String name;
    String genre;
    int duration;
    int year;
    double officialReview;
    double newUsersReview;
    int userReview;
    boolean includedInPlan;

    void showTechnicalSheet() {
        System.out.printf("Filme: %s\n", name);
        System.out.printf("Gênero: %s\n", genre);
        System.out.println("Duração: " + duration + " minutos");
        System.out.printf("Ano de lançamento: %d\n", year);
        System.out.printf("Avaliação IMDb: %.1f\n", officialReview);
        System.out.printf("Filme incluso no plano atual: %b\n", includedInPlan);
    }

    void newReview(double rating) {
        newUsersReview += rating;
        userReview++;
    }

    double finalUsersReview() {
        double review = newUsersReview / userReview;
        return review;
    }

}
