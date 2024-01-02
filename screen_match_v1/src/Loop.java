import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        // i++ (i = i + 1)
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual sua nota para o filme? (Entre 0.0 e 10.0)");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //  (mediaAvaliacao = mediaAvaliacao + nota)
        }

        double mediaFinal = mediaAvaliacao / 3;
        System.out.printf("Média de avaliações: %.2f", mediaFinal);

    }
}
