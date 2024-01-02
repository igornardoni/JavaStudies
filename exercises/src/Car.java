import java.time.Year;

public class Car {
    private final String model;
    private final int year;
    private final String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }

    public static void main(String[] args) {
        Car mycar = new Car("Ford Fiesta", 2002, "Branco");
        int carAge = mycar.calculateAge();
        mycar.showTechnicalSheet();
        System.out.printf("O carro tem %d anos desde o seu lançamento", carAge);
    }

    public void showTechnicalSheet() {
        System.out.printf("Modelo do carro: %s\nAno de lançamento: %d\n", model, year);
    }

}
