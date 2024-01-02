public class MiniDesafios {
    public static void main (String[] args) {

        // 1 - Crie um programa que realize a média de notas decimais e exiba o resultado:
        double math = 8.7;
        double chemistry = 7.0;
        double biology = 6.45;

        double mediaFinal = (math + chemistry + biology) / 3;
        System.out.println(mediaFinal);

        System.out.println("*******************************************");


        // 2 - Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.
        int mediaInteira = (int) mediaFinal;
        System.out.println(mediaInteira);

        System.out.println("*******************************************");

        // 3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = 'I'; // Sempre aspas simples em char
        String resto = "gor";
        System.out.println(letra + resto);

        System.out.println("*******************************************");

        // 4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 96.49;
        int quantidade = 2;
        double valorTotal = precoProduto * quantidade;
        String mensagem = String.format("O valor total a ser pago é: R$ %.2f", valorTotal);
        System.out.println(mensagem);

        // Tipos de format:
        // %s = formata em string
        // %d = formata em inteiro
        // %f = formata em ponto flutuante (double), no caso com duas casas decimais após a vírgula (%.2f)

        System.out.println("*******************************************");

        // 5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4,94 reais. Realize a conversão do valor em dólares
        // para reais e imprima o resultado formatado.
        double valorEmDolares = 50;
        double totalEmReais = valorEmDolares * 4.94;
        String valorFinal = String.format("Valor de 50 dólares em reais: R$ %.2f", totalEmReais);
        System.out.println(valorFinal);

        System.out.println("*******************************************");

        // 6 - Declare uma variável do tipo double precoOriginal.
        // Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável percentualDesconto e atribua um valor percentual de desconto
        // ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao
        // preço original e imprima o novo preço com desconto.
        double precoOriginal = 119.99;
        int percentualDesconto = 20;
        double valorASerPago = precoOriginal - (precoOriginal * percentualDesconto / 100);

        System.out.printf("Valor original: R$ %.2f\n", precoOriginal);
        System.out.printf("Desconto de %d%% aplicado. Valor com desconto: R$ %.2f\n", percentualDesconto, valorASerPago);

        // O \n é um caractere de escape usado para representar uma quebra de linha.
        // O %d é um especificador de formato que indica que um valor inteiro. No caso o %% é usado para representar o caractere de porcentagem literal. Isso ocorre porque o caractere % tem um significado especial em strings formatadas (é usado para indicar um especificador de formato), então, se você quiser incluir o caractere % literalmente, você precisa usar %%.

    }
}
