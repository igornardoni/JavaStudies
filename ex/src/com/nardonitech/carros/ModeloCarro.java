package com.nardonitech.carros;

public class ModeloCarro extends Carro {
    private String tipoDeCarro;
    private String cor;

    public String getTipoDeCarro() {
        return tipoDeCarro;
    }

    public void setTipoDeCarro(String tipoDeCarro) {
        this.tipoDeCarro = tipoDeCarro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibeCarro() {
        System.out.println("Modelo do veículo: " + getModelo());
        System.out.println("Tipo: " + getTipoDeCarro());
        System.out.println("Cor: " + getCor());
        System.out.println("Preço do modelo ano 2021: R$ " + getPrecoAno2021());
        System.out.println("Preço do modelo ano 2022: R$ " + getPrecoAno2022());
        System.out.println("Preço do modelo ano 2023: R$ " + getPrecoAno2023());
        System.out.println("Maior preço: " + calcularMaiorPreco());
        System.out.println("Menor preço: " + calcularMenorPreco());
    }
}
