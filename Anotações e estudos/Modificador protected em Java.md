# O modificador protected em Java

Ao usar herança no Java, temos a possibilidade de utilizar o modificador de acesso **protected**, que permite que os atributos de uma classe sejam acessados por outras classes do mesmo pacote e também por suas subclasses, independentemente do pacote em que se encontram.

O modificador protected é útil em situações em que uma classe precisa permitir que suas subclasses acessem diretamente seus atributos, sem a necessidade de restringir o acesso apenas pelos métodos getters e setters. Por exemplo, suponha que temos as seguintes classes em um projeto: 

```java
public class Conta {

  private String titular;
  private double saldo;

  public void sacar(double valor) {
    //implementacao do metodo omitida
  }

  public void depositar(double valor) {
    //implementacao do metodo omitida
  }

  //getters e setters
}
```



```java
public class ContaPoupanca extends Conta {

  private double taxaDeJuros;

  public void calcularJuros() {
    double juros = this.getSaldo() * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
  }

  //getters e setters
}
```

No código anterior, repare que no método `calcularJuros`, da classe `ContaPoupanca`, o atributo `saldo` não é acessado diretamente, pois ele foi declarado como private na classe `Conta`, devendo então seu acesso ser feito pelo método `getSaldo()`.

Podemos declarar o atributo `saldo` como protected, para evitar essa situação e liberar o acesso direto a ele pelas classes que herdam da classe `Conta`:

```java
public class Conta {

  private String titular;
  protected double saldo;

  public void sacar(double valor) {
    //implementacao do metodo omitida
  }

  public void depositar(double valor) {
    //implementacao do metodo omitida
  }

  //getters e setters
}
```



```java
public class ContaPoupanca extends Conta {

  private double taxaDeJuros;

  public void calcularJuros() {
    double juros = this.saldo * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
  }

  //getters e setters
}
```

Repare que agora o atributo `saldo` foi acessado diretamente pela classe `ContaPoupanca`.