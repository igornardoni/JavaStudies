package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    /*
         // Sobrecarga de métodos

    public void inclui(Filme f) {
        this.tempoTotal += f.getDuracaoEmMinutos();
    }


    public void inclui(Serie s) {
        this.tempoTotal += s.getDuracaoEmMinutos();
    }

     */


    // O método entende que, apesar de estar usando a classe mãe, no caso de série, ele precisa
    // pegar a duração em minutos específicos do override da classe filha Serie

    public void inclui(Titulo titulo) {
        // Em tempo de execução, o método consegue fazer a distinção necessária
        System.out.println("Adicionando duração em minutos de: " + titulo);

        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
