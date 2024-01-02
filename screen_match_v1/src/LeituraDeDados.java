import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme escolhido:");
        String filme = leitura.nextLine();
        System.out.println(filme);

        System.out.println("Qual o ano de lançamento:");
        int ano = leitura.nextInt();
        System.out.println(ano);

        System.out.println("Qual sua nota para o filme? (Entre 0 e 10)");
        double nota = leitura.nextDouble();
        System.out.println(nota);
    }
}
