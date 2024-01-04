package br.com.alura.screenmatch.models;

public class Movie {
    private final String name;
    private final String genre;
    private final int duration;
    private final int year;
    private final double officialReview;
    private double newUsersReview;
    private int userReview;
    private final boolean includedInPlan;

    public Movie(String name, String genre, int duration, int year,
                 double officialReview, boolean includedInPlan) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.year = year;
        this.officialReview = officialReview;
        this.includedInPlan = includedInPlan;
    }

    public void showTechnicalSheet() {
        System.out.printf("br.com.alura.screenmatch.models.Filme: %s\n", name);
        System.out.printf("Gênero: %s\n", genre);
        System.out.println("Duração: " + duration + " minutos");
        System.out.printf("Ano de lançamento: %d\n", year);
        System.out.printf("Avaliação IMDb: %.1f\n", officialReview);
        System.out.printf("br.com.alura.screenmatch.models.Filme incluso no plano atual: %b\n", includedInPlan);
    }

    public void newReview(double rating) {
        newUsersReview += rating;
        userReview++;
    }


    double getFinalUsersReview() {
        if (userReview > 0) {
            return newUsersReview / userReview;
        } else {
            return 0;
        }
    }

    /*
    ou então na versão mais simples ==>
    double getFinalUsersReview() {
        return userReview > 0 ? newUsersReview / userReview : 0;
    }
    */
}
