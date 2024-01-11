package com.nardonitech.carros;

public class Carro {
    private String modelo;
    private double precoAno2021;
    private double precoAno2022;
    private double precoAno2023;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno2021() {
        return precoAno2021;
    }

    public void setPrecoAno2021(double precoAno2021) {
        this.precoAno2021 = precoAno2021;
    }

    public double getPrecoAno2022() {
        return precoAno2022;
    }

    public void setPrecoAno2022(double precoAno2022) {
        this.precoAno2022 = precoAno2022;
    }

    public double getPrecoAno2023() {
        return precoAno2023;
    }

    public void setPrecoAno2023(double precoAno2023) {
        this.precoAno2023 = precoAno2023;
    }


    public void exibePrecos(double precoAno2021, double precoAno2022, double precoAno2023) {
        this.precoAno2021 = precoAno2021;
        this.precoAno2022 = precoAno2022;
        this.precoAno2023 = precoAno2023;
    }

    // Não pode ser else if, pois quero executar todas possibilidades
    public double calcularMenorPreco() {
        double menorPreco = precoAno2021;

        if (precoAno2022 < menorPreco) {
            menorPreco = precoAno2022;
        }
        if (precoAno2023 < menorPreco) {
            menorPreco = precoAno2023;
        }
        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno2021;

        if (precoAno2022 > maiorPreco) {
            maiorPreco = precoAno2022;
        }
        if (precoAno2023 > maiorPreco) {
            maiorPreco = precoAno2023;
        }
        return maiorPreco;
    }

}
