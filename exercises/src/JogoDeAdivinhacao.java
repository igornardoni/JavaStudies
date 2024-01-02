import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        // Gerando número aleatório
        int randomNumber = new Random().nextInt(100);
        Scanner palpiteScanner = new Scanner(System.in);
        int tentativas = 0;

        System.out.println("*********************************");
        System.out.println("TENTE DESCOBRIR O NÚMERO SECRETO!");
        System.out.println("*********************************");

        while (tentativas < 5) {
            // Lógica do jogo: receber palpite do usuário, comparar com randomNumber, etc.

            System.out.print("Digite seu palpite, você tem 5 chances: ");
            int palpite = palpiteScanner.nextInt();

            if (palpite == randomNumber) {
                System.out.println("Parabéns, você acertou!");
                break; // Sair do loop se o palpite estiver correto
            } else if (palpite < randomNumber) {
                System.out.println("Tente novamente! O seu chute foi menor que o número secreto");
            } else {
                System.out.println("Tente novamente! O seu chute foi maior que o número secreto");
            }

            tentativas++;
        }

        if (tentativas == 5) {
            System.out.println("Suas 5 chances acabaram. O número correto era: " + randomNumber);
        }

        palpiteScanner.close(); // Libera os recursos associados ao Scanner após o uso, evitando vazamento de recursos. Boa prática em E/S-I/O (Entrada/Saída - Input/Output)
    }
}
