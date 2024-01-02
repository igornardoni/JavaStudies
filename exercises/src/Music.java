public class Music {
    private String name;
    private String artist;
    private int year;
    private double review;
    private int numberOfRatings;

    // Construtor para inicializar os atributos
    public Music(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }


    public void showTechnicalSheet() {
        System.out.printf("Música: %s\n", name);
        System.out.printf("Artista: %s\n", artist);
        System.out.printf("Ano de lançamento: %d\n", year);
    }

   public void newReview(double rating) {
        review += rating;
        numberOfRatings++;
    }

    double finalReview() {
        double finalReview = review / numberOfRatings;
        return finalReview;
    }

    public static void main(String[] args) {
        Music music1 = new Music("Heart Shaped Box", "Nirvana", 1993);

        music1.showTechnicalSheet();

        music1.newReview(9);
        music1.newReview(9.5);
        music1.newReview(8.5);

        double review = music1.finalReview();
        System.out.printf("Avaliação dos usuários: %.1f\n", review);
    }

}
