package com.nardonitech.animais;

public class TesteAnimais extends Animal{
    public static void main(String[] args) {

        Cachorro cachorrinho = new Cachorro();
        cachorrinho.emitirSom();
        cachorrinho.abanarRabo();

        Gato gatinho = new Gato();
        gatinho.emitirSom();
        gatinho.arranharMoveis();
    }
}
