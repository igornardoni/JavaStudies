public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.name = "Batman Begins";
        movie1.genre = "Action";
        movie1.duration = 140;
        movie1.year = 2005;
        movie1.officialReview = 8.2;
        movie1.includedInPlan = true;


        movie1.showTechnicalSheet();

        movie1.newReview(9);
        movie1.newReview(9.5);
        movie1.newReview(8.5);

        System.out.println(movie1.newUsersReview);
        System.out.println(movie1.userReview);

        double review = movie1.finalUsersReview();
        System.out.printf("Avaliação dos usuários: %.1f\n", review);

    }
}
