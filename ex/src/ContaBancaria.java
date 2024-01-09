public class ContaBancaria {
    // Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado),
    // saldo (privado) e titular (publico). Implemente métodos getters e setters
    // para os atributos privados.

    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void exibeConta() {
        System.out.printf("Titular da conta: %s\n", getTitular());
        System.out.printf("Número da conta: %d\n", getNumeroConta());
        System.out.printf("Saldo da conta: %.2f\n", getSaldo());
    }

    public static void main(String[] args) {

        ContaBancaria conta001 = new ContaBancaria();

        conta001.setTitular("Igor Nardoni");
        conta001.setNumeroConta(1879253);
        conta001.setSaldo(18795.58);

       conta001.exibeConta();

    }
}



