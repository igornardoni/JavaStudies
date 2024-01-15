package com.nardonitech.conta;

public class ContaCorrente extends ContaBancaria {
    protected double tarifa = 0.002;

    public void cobrarTarifaMensal() {
        double tarifaMensal = saldo * tarifa;
        saldo -= tarifaMensal;
        System.out.printf("Tarifa mensal de R$ %.2f cobrada. " +
                "Saldo atualizado: R$ %.2f\n", tarifaMensal, saldo);
    }

}
