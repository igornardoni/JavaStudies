# Classes e Objetos em Java

Uma classe é uma estrutura que define um tipo de objeto. A classe é como um molde, que define quais são as características (atributos) e comportamentos (métodos) que os objetos desse tipo vão possuir. Por exemplo, podemos definir uma classe chamada `Pessoa` que tenha os atributos `nome` e `idade`, além do método `fazAniversario()`

A sintaxe para definir essa classe em Java é a seguinte:

```java
public class Pessoa {

    // Características (atributos) 
    String nome;
    int idade;
    
    // Comportamentos (métodos)
    void fazAniversario() {
      idade++;
    }

}

```



Já um objeto, é uma instância de uma classe, sendo por meio dele que conseguimos representar informações na aplicação, pois a classe serve apenas para padronizar os objetos, mas não para representar um objeto em si. Para criar um objeto em Java, precisamos utilizar a palavra reservada **new** seguida do nome da classe e de parênteses vazios. Por exemplo, para criar um objeto do tipo Pessoa, podemos escrever o seguinte código:

```java
// Criação do Objeto pessoa1. (Apesar de que contextualmente pessoa1 seja a variável que indica o 'caminho' a este objeto em questão.)

Pessoa pessoa1 = new Pessoa();

```

Nesse exemplo, criamos um objeto a partir da classe `Pessoa`, e guardamos na variável `pessoa1` uma referência a ele. Como esse objeto foi criado como sendo do tipo `Pessoa`, ele possui os atributos nome e idade, além do método `fazAniversario()`. É a partir do objeto que podemos de fato representar uma pessoa, ou seja, preencher os atributos e chamar os métodos. Por exemplo:

```java
Pessoa pessoa1 = new Pessoa();

pessoa1.nome = "Ana";
pessoa1.idade = 20;

System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

pessoa1.fazAniversario();

System.out.println("A idade agora é: " + pessoa1.idade);

```

Podemos criar vários objetos do tipo `Pessoa`, sendo que todos eles terão os mesmos atributos e métodos, já que são da mesma classe, mas cada um pode possuir informações distintas. Por exemplo:

```java
Pessoa pessoa1 = new Pessoa();

pessoa1.nome = "Ana";
pessoa1.idade = 20;

System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

pessoa1.fazAniversario();

System.out.println("A idade agora é: " +pessoa1.idade);

Pessoa pessoa2 = new Pessoa();

pessoa2.nome = "Carlos";
pessoa2.idade = 20;

System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");

pessoa2.fazAniversario();

System.out.println("A idade agora é: " +pessoa2.idade);

```





# Exercício sobre métodos de objetos

Suponha que você esteja trabalhando em uma aplicação Java de uma loja, que tenha a seguinte classe:

```java
public class Produto {

    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double precoFinal = preco - descontoParaPix;
        } else {
            double precoFinal = preco;
        }
    }

}

```

O método **pegaPrecoFinal** realiza o cálculo do preço final do produto, levando em consideração se o pagamento será realizado via pix. No entanto, esse método foi definido de maneira incorreta.

Qual o problema do método `pegaPrecoFinal`?

> R: A variável está restrita dentro do if else.  Além disso ele não tem um retorno do valor esperado



**Você acertou em cheio!**

Igor, sua resposta está correta, parabéns! Você identificou corretamente que a variável precoFinal está restrita ao escopo dos blocos if e else, o que impede que ela seja acessada fora desses blocos. Além disso, você também percebeu que o método não está retornando nenhum valor, o que é necessário para que o método cumpra sua função de retornar o preço final do produto. Continue assim, prestando atenção aos detalhes do escopo das variáveis e à estrutura dos métodos!