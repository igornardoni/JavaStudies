/*
Crie uma classe ContaBancaria com métodos para realizar operações bancárias como
depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da
classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que
desconta uma tarifa mensal da conta-corrente.
*/


package com.nardonitech.conta;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Após depósito de R$ %.2f o saldo atualizado é: R$ %.2f \n", valor, saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso! Saldo atualizado: R$ %.2f\n", valor, saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual de R$ %.2f\n", saldo);
    }

}
