import java.util.Scanner;

public class MiniDesafios02 {
    public static void main(String[] args) {
        miniDesafio01();
        miniDesafio02();
        miniDesafio03();
        miniDesafio04();
        miniDesafio05();
        miniDesafio06();

        miniDesafio07();
    }

    private static void miniDesafio01() {
        // 1- Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        Scanner numeroScanner = new Scanner(System.in);

        System.out.println("Digite um número positivo exemplo, (8) ou negativo, exemplo, (-8)");
        int palpite = numeroScanner.nextInt();

        if (palpite < 0) {
            System.out.println("Você digitou um número negativo!");
        } else if (palpite > 0) {
            System.out.println("Você digitou um número positivo!");
        }

        System.out.println(); // Quebra de linha
    }

    private static void miniDesafio02() {
        // 2- Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        Scanner numeroScanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int palpite1 = numeroScanner.nextInt();

        System.out.println("Agora, insira mais um número inteiro:");
        int palpite2 = numeroScanner.nextInt();

        if (palpite1 == palpite2) {
            System.out.println("Os números são iguais!");
        } else if (palpite1 > palpite2) {
            System.out.printf("Os números são diferentes e o %d é maior que o %d", palpite1, palpite2);
        } else {
            System.out.printf("Os números são diferentes e o %d é menor que o %d", palpite1, palpite2);
        }

        System.out.println(); // Quebra de linha
    }

    private static void miniDesafio03() {
        // 3- Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        Scanner numeroScanner = new Scanner(System.in);

        System.out.println("Se deseja calcular a área do quadrado, digite 1. " +
                "Se deseja calcular a área do círculo, digite 2.");

        int escolha = numeroScanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite o comprimento da base do quadrado:");
            double base = numeroScanner.nextDouble();
            System.out.println("Digite o comprimento da altura do quadrado:");
            double altura = numeroScanner.nextDouble();

            double resultado = (base * altura);
            System.out.printf("A área do quadrado é: %.2f", resultado);
        }

        else if (escolha == 2) {
            System.out.println("Digite o raio do círculo:");
            double raio = numeroScanner.nextDouble();

            double resultado = Math.PI * Math.pow(raio, 2); //  pi * raio * raio;

            System.out.printf("A área do quadrado é: %.2f", resultado);

        } else {
            System.out.println("Número inválido!");
        }

            System.out.println(); // Quebra de linha
        }

    private static void miniDesafio04() {
        // 4- Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        Scanner numeroScanner = new Scanner(System.in);

        System.out.println("Escolha um número");
        
        int escolha = numeroScanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = escolha * i;
            System.out.println(escolha + "x" + i + " = " + resultado);
        }

            System.out.println(); // Quebra de linha

    }

    private static void miniDesafio05() {
        // 5- Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        Scanner numeroScanner = new Scanner(System.in);

        System.out.println("Escolha um número");

        int escolha = numeroScanner.nextInt();

        if (escolha % 2 == 0) {
            System.out.printf("O número %d é par!", escolha);
        } else {
            System.out.printf("O número %d é ímpar!", escolha);
        }

        System.out.println(); // Quebra de linha
    }

    private static void miniDesafio06() {
        // 6- Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        // O fatorial de um número é a multiplicação desse número por todos os seus antecessores maiores que zero

        Scanner numeroScanner = new Scanner(System.in);

        System.out.println("Escolha um número:");

        int escolha = numeroScanner.nextInt();
        int fatorial = 1;

        for (int i = escolha; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(); // Quebra de linha

    }

    private static void miniDesafio07() {
        // 7- Crie um programa que solicite ao usuário um número e verifique se ele é um número primo.

        Scanner numeroScanner = new Scanner(System.in);

        System.out.println("Escolha um número:");

        int escolha = numeroScanner.nextInt();

        if (ehPrimo(escolha)) {
            System.out.println("Número primo");
        } else {
            System.out.println("Número não é primo");
        }
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se encontrar um divisor, não é primo
            }
        }

        return true; // Se não encontrou divisores, é primo
    }

    //  A lógica é verificar se há algum divisor do número no intervalo de 2 até a raiz quadrada do número. Se nenhum divisor for encontrado, o número é considerado primo.
}
