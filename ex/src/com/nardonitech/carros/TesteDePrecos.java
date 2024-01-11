package com.nardonitech.carros;

public class TesteDePrecos extends Carro{
    public static void main(String[] args) {

        ModeloCarro toro = new ModeloCarro();

        toro.setModelo("Fiat Toro");
        toro.setTipoDeCarro("Caminhonete");
        toro.setCor("Chumbo");
        toro.setPrecoAno2021(107.490);
        toro.setPrecoAno2022(144.990);
        toro.setPrecoAno2023(165.590);

        toro.exibeCarro();
        toro.calcularMaiorPreco();
        toro.calcularMenorPreco();

        System.out.println("------------------------------------");

        ModeloCarro s10 = new ModeloCarro();
        s10.setModelo("Chevrolet S10");
        s10.setTipoDeCarro("Caminhonete");
        s10.setCor("Preto");
        s10.setPrecoAno2021(150.090);
        s10.setPrecoAno2022(191.090);
        s10.setPrecoAno2023(225.890);

        s10.exibeCarro();
        s10.calcularMaiorPreco();
        s10.calcularMenorPreco();

    }
}
