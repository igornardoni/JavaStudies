// Alice estava praticando seus conhecimentos sobre a estrutura de repetição while e teve a ideia de fazer um programa que apresentasse os números de 1 a 10. Assim, ela escreveu o seguinte trecho de código:

/*
public class Programa {

    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 10) {
            System.out.println(contador);
        }
    }
}

*/

// No entanto, seu programa só imprime no console o número 1 infinitamente. Qual problema no código de Alice?

public class ExWhile01 {
    public static void main(String[] args) {

        // Contar de 0 a 10 com o loop While
        int contador = 0;

        while (contador != 10) {
            contador++;
            System.out.println(contador);
        }
    }
}


//O primeiro código que você forneceu não funciona como esperado porque no primeiro exemplo, a condição contador <= 10 nunca muda, então o loop while continua indefinidamente. Ele precisa de um incremento++ para poder contar até 10