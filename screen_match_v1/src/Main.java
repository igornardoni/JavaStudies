public class Main {

   public static void main(String[] args) {
       // Mensagem de Boas-vindas
       String mensagem = "Bem vindo ao ScreenMatch! Seu streaming em qualquer lugar";

       // Informações sobre o primeiro filme
       String filme1 = "Top Gun: Maverick";
       int anoFilme1 = 2022;
       double notaDoFilme1 = 8.1;
       boolean incluidoNoPlanoFilme1 = false;

       // Informações sobre o segundo filme
       String filme2 = "Taxi Driver";
       int anoFilme2 = 1976;
       double notaDoFilme2 = 8.2;
       boolean incluidoNoPlanoFilme2 = true;

       // Informações sobre o terceiro filme
       String filme3 = "Interestelar";
       int anoFilme3 = 2014;
       double notaDoFilme3 = 8.7;
       boolean incluidoNoPlanoFilme3 = false;

       // Informações sobre o quarto filme
       String filme4 = "A Identidade Bourne";
       int anoFilme4 = 2002;
       double notaDoFilme4 = 7.8;
       boolean incluidoNoPlanoFilme4 = true;

       // Exibição da mensagem de Boas-vindas
       System.out.println("****************************");
       System.out.println(mensagem);
       System.out.println("****************************");

       // Exibição das informações do primeiro filme
       System.out.println("Filme: " + filme1);
       System.out.println("Ano de lançamento: " + anoFilme1);
       System.out.println("Nota do filme: " + notaDoFilme1);
       System.out.println("Está incluido no plano? "+ incluidoNoPlanoFilme1);

       // Divisória
       System.out.println("-----------------------------");

       // Exibição das informações do segundo filme
       System.out.println("Filme: " + filme2);
       System.out.println("Ano de lançamento: " + anoFilme2);
       System.out.println("Nota do filme: " + notaDoFilme2);
       System.out.println("Está incluido no plano? " + incluidoNoPlanoFilme2);

       // Divisória
       System.out.println("-----------------------------");

       // Exibição das informações do terceiro filme
       System.out.println("Filme: " + filme3);
       System.out.println("Ano de lançamento: " + anoFilme3);
       System.out.println("Nota do filme: " + notaDoFilme3);
       System.out.println("Está incluido no plano? " + incluidoNoPlanoFilme3);

       // Divisória
       System.out.println("-----------------------------");

       // Exibição das informações do quarto filme
       System.out.println("Filme: " + filme4);
       System.out.println("Ano de lançamento: " + anoFilme4);
       System.out.println("Nota do filme: " + notaDoFilme4);
       System.out.println("Está incluido no plano? " + incluidoNoPlanoFilme4);


       System.out.println("#### M E D I A S ####");

       // Média sem precedência de operadores
       double mediaSemPrecedencia =  8.1 + 8.2 + 8.7 + 7.8 / 4;

       // Média com precedência de operadores
       double media = (8.1 + 8.2 + 8.7 + 7.8) / 4;

       System.out.println("Média sem precedência: " + mediaSemPrecedencia);
       System.out.println("Média correta: " + media);

       // Classificação de média em estrelas
       int classificacao = (int) (media / 2);
       System.out.println(classificacao + " estrelas");

   }
}

