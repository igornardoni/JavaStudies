// Projeto de Conta Corrente mais completo e complexo

import java.util.Scanner;

public class ContaCorrente {

    // Criação de membros de classe para armazenar informações do cliente e usar em outros métodos
    private String nome;
    private String tipoDeConta;
    private double saldo;


    public static void main(String[] args) {

        // Criando objeto da classe
        ContaCorrente conta = new ContaCorrente();
        conta.apresentacao();
        conta.menu();
    }

    private void apresentacao() {

        // Atribuindo valores aos membros de classe
        nome = "Igor Augusto Nardoni";
        tipoDeConta = "Conta Corrente";
        saldo = 8750.35;

        System.out.println("\n*********************");
        System.out.println("DADOS INICIAIS DO CLIENTE:");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Tipo de conta: %s\n", tipoDeConta);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        System.out.println("*********************\n");
    }

    private static void exibirOpcoes() {
        System.out.println("\n*********************");
        System.out.println("*** Digite sua opção desejada: ***");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Exibir dados da conta");
        System.out.println("3- Receber valor");
        System.out.println("4- Transferir valor");
        System.out.println("5- Sair");
        System.out.println("---------------------\n");
    }

    private void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            exibirOpcoes();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("%s seu saldo é de: R$ %.2f", nome, saldo);
                    break;

                case 2:
                    System.out.printf("Nome: %s\n", nome);
                    System.out.printf("Tipo de conta: %s\n", tipoDeConta);
                    System.out.printf("Seu saldo é de: R$ %.2f\n", saldo);
                    break;

                case 3:
                    System.out.println("Qual valor você irá receber?");
                    double valorAReceberScanner = scanner.nextDouble();
                    saldo += valorAReceberScanner;
                    System.out.println("Confirmando transação...");
                    System.out.println("Recebendo valor...");
                    System.out.println("...");
                    System.out.printf("Seu saldo agora é de: R$ %.2f", saldo);
                    break;

                case 4:
                    System.out.println("Qual valor você irá transferir?");
                    double valorATransferirScanner = scanner.nextDouble();
                    saldo -= valorATransferirScanner;
                    System.out.println("Transferindo valor...");
                    System.out.println("...");
                    System.out.printf("Seu saldo agora é de: R$ %.2f", saldo);
                    break;

                case 5:
                    System.out.println("Saindo da aplicação. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

}
