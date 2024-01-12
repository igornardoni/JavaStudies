package com.nardonitech.conta;

public class OperacoesBancarias extends ContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1500.00);
        conta.consultarSaldo();

        System.out.println("--------------------------------------");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5855.00);
        contaCorrente.sacar(350.25);
        contaCorrente.consultarSaldo();
        System.out.println();

        contaCorrente.depositar(875.00);
        contaCorrente.consultarSaldo();
        System.out.println();

        contaCorrente.cobrarTarifaMensal();
        System.out.println();

    }
}
