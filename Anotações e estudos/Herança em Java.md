# Herança em Java

A herança é um conceito fundamental da orientação a objetos, sendo implementada em Java através da relação **é um** entre classes. Isso significa que uma classe pode herdar atributos e métodos de outra classe, tornando com isso o código mais reutilizável.

No Java, a herança é realizada através da palavra-chave **extends**. A classe que herda é chamada de **subclasse**, e a classe que é herdada é chamada de **superclasse**. A subclasse pode acessar todos os atributos e métodos públicos e protegidos da superclasse, além de poder sobrescrever os métodos da superclasse para criar comportamentos específicos. 

Por exemplo:

```csharp
public class Conta {

  private String titular;
  private double saldo;

  public void sacar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor deve ser maior do que zero!");
    } else if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Saque realizado com sucesso. Saldo atual: " +saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito realizado com sucesso. Saldo atual: " +saldo);
    } else {
      System.out.println("Valor deve ser maior do que zero!");
    }
  }

  //getters e setters
}
```

```csharp
public class ContaPoupanca extends Conta {

  private double taxaDeJuros;

  public void calcularJuros() {
    double juros = this.getSaldo() * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
  }

  public void sacar(double valor) {
    double taxaSaque = 0.01;
    super.sacar(valor + taxaSaque);
  }

  //getters e setters
}
```

No código anterior, a classe `Conta` é a superclasse e a classe `ContaPoupanca` é a subclasse. A classe `ContaPoupanca` herda os atributos e métodos da classe `Conta`, e adiciona um novo atributo `taxaDeJuros` e um novo método `calcularJuros`. Embora os atributos sejam herdados, como eles foram declarados como private na superclasse, não poderão ser acessados diretamente na subclasse, devendo então serem utilizados os métodos getters/setter, que são públicos. 

Repare também no código anterior que a subclasse sobrescreveu o método sacar, para que seja descontada a taxa de saque, além de utilizar a palavra chave **super** para chamar o método da superclasse, evitando com isso duplicar um código já existente. Essa é a grande vantagem da herança: reaproveitamento de código com flexibilidade para sobrescrever comportamentos.

## Herança múltipla

Em Java, é importante notar que a herança múltipla não é permitida. A herança múltipla ocorre quando uma subclasse herda de duas ou mais superclasses. Por exemplo:

```java
public class ContaPoupanca extends Conta, Pagamento {
  //codigo da classe omitido
}
```

O código anterior não compila, pois o `extends` aceita apenas uma única classe, ou seja, uma classe pode ter apenas uma superclasse.

Entretanto, é possível criar uma hierarquia de classes utilizando herança, simulando com isso uma herança múltipla. Por exemplo:

```kotlin
public class Conta {
  //codigo da classe omitido
}
```

```java
public class ContaCorrente extends Conta {
  //codigo da classe omitido
}
```

```java
public class ContaCorrentePessoaFisica extends ContaCorrente {
  //codigo da classe omitido
}
```

No código anterior, a classe `ContaCorrentePessoaFisica` está herdando de `ContaCorrente`, que por sua vez herda da classe `Conta`, ou seja, indiretamente a classe `ContaCorrentePessoaFisica` vai herdar de `Conta`, pois sua superclasse herda dela.





# Exercício sobre Herança

Considere a seguinte hierarquia de classes em Java:



## Superclasse Animal:

```java
public class Animal {

    private String nome;
    private double peso;

    public void fazerBarulho() {
        System.out.println("fazendo barulho!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
```



## Subclasse Cachorro:

```java
public class Cachorro extends Animal {

    public void fazerBarulho() {
        System.out.println("Au au au!");
    }

    public void buscarBolinha() {
        System.out.println("Buscando a bolinha!");
    }
}
```



## Subclasse Gato:

```java
public class Gato extends Animal {

    public void brincarComLaser() {
        System.out.println("Brincando com o laser!");
    }
}
```



Em relação ao conceito de **herança**:

- **A classe `Gato` não pode herdar da classe `Cachorro`.**
  - *Como a classe `Gato` já está herdando de `Animal`, não pode herdar também características de `Cachorro`, pois no Java não é permitido herança múltipla.*

- **Um objeto do tipo `Animal` pode ser instanciado e fazer barulho, mas não é possível chamar o método `buscarBolinha`.**
  - *O método `buscarBolinha` é exclusivo da classe `Cachorro`, portanto não é possível chamá-lo em um objeto do tipo `Animal`.* 

