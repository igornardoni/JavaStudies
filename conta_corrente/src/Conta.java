// Projeto de Conta Corrente mais simples e direto

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String nome = "Bobby Clark";
        String tipoDeConta = "Poupança";
        double saldo = 7588.75;
        int opcao = 0;

        System.out.println("\n*********************");
        System.out.println("\nDADOS INICIAIS DO CLIENTE:");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Tipo de conta: %s\n", tipoDeConta);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        System.out.println("\n*********************\n");

        // textbox
        String menu = """
                       ** Digite sua opção: **
                       
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leituraScanner = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leituraScanner.nextInt();

            if (opcao == 1) {
                System.out.printf("O saldo atualizado é: R$ %.2f\n", saldo);
                System.out.println();
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?");
                double valor = leituraScanner.nextDouble();
                 if (valor > saldo) {
                     System.out.printf("Saldo insuficiente. Seu saldo atual é de: R$ %.2f\n", saldo);
                     System.out.println();
                 } else {
                     saldo -= valor;
                     System.out.printf("Operação realizada com sucesso. " +
                             "Seu saldo agora é de: R$ %.2f\n", saldo);
                     System.out.println();
                 }
            } else if (opcao == 3) {
                System.out.println("Qual valor você irá receber?");
                double valor = leituraScanner.nextDouble();
                saldo += valor;
                System.out.printf("Operação realizada com sucesso. " +
                        "Seu saldo agora é de: R$ %.2f\n", saldo);
                System.out.println();
            } else if (opcao != 4) {
                System.out.print("Opção inválida! Tente novamente.\n");
                System.out.println();
            }
        }
    }
}
