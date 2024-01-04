# Modificadores de acesso em Java

Em Java, os modificadores de acesso são palavras-chave que definem o nível de visibilidade de classes, atributos e métodos, sendo que eles ajudam a garantir a segurança e encapsulamento do código.

Existem quatro tipos de modificadores de acesso em Java: public, protected, private e default (também conhecido como package-private). 

## Public

O modificador de acesso **public** é o mais permissivo de todos. Uma classe, atributo ou método declarado como public pode ser acessado por qualquer classe em qualquer pacote. Ou seja, ele possui visibilidade pública e pode ser utilizado livremente. Por exemplo: 

```java
public class Conta {

  public double saldo;

  public void sacar(double valor) {
    // lógica de saque...
  }
}
```

```java
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }

}
```



## Default (Package-private)

O modificador de acesso default é aquele que não especifica nenhum modificador de acesso. Quando nenhum modificador de acesso é especificado, a classe, atributo ou método pode ser acessado apenas pelas classes que estão no mesmo **pacote**. Por exemplo:

```java
package br.com.alura.conta;

public class Conta {

  double saldo;

  void sacar(double valor) {
    // lógica de saque...
  }
}
```

```java
package br.com.alura.testes;

public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }

}
```



No código anterior, a classe `Conta` está em um pacote e a classe `Principal` em outro pacote distinto. A classe `Conta` pode ser instanciada dentro da classe `Principal`, pois ela possui o modificador de acesso **public**, entretanto, o atributo `saldo` e o método `sacar` tem o modificador **default** e, portanto, **não** podem ser acessados de dentro da classe `Principal`, o que vai causar um erro de compilação no código anterior.

## Private

O modificador de acesso **private** é o mais restritivo de todos. Uma classe, atributo ou método declarado como private só pode ser acessado dentro da própria classe. Ou seja, ele possui visibilidade restrita e não pode ser utilizado por outras classes. Por exemplo:

```java
public class Conta {

  private double saldo;

  private void sacar(double valor) {
    // lógica de saque...
  }
}
```

```java
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }

}
```

No código anterior, vai ocorrer erro de compilação na classe `Principal`, pois o atributo `saldo` e o método `sacar` foram declarados como private, não podendo com isso serem acessados de fora da própria classe `Conta`.

Existe ainda um último modificador de acesso, que é o **protected**, mas falaremos dele mais adiante no curso, após ser apresentado o conceito de **herança** de classes.