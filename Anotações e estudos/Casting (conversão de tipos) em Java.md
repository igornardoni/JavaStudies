# Casting (conversão de tipos) em Java

Casting é um recurso utilizado em Java para converter um tipo de dado em outro. Essa conversão pode ser feita de forma automática pelo  compilador (conversão implícita), quando o tipo de dado de destino é  compatível com o tipo de dado de origem, ou de forma manual (conversão  explícita), utilizando o operador de casting. 

O casting é utilizado para permitir que tipos de dados incompatíveis  possam ser utilizados em uma mesma operação ou expressão. Por exemplo,  se um método espera um parâmetro do tipo int e o valor que se deseja  passar é do tipo double, é necessário fazer um casting para converter o  valor em int.

## Casting implícito

O casting implícito é realizado automaticamente pelo compilador  quando o tipo de dado de origem é compatível com o tipo de dado de  destino. Por exemplo, é possível atribuir um valor de tipo int a uma  variável do tipo double, pois o tipo double é maior e suporta todos os  valores que o tipo int pode armazenar:

```java
int x = 10;
double y = x; // casting implícito
```

## Casting explícito

O casting explícito é realizado quando o tipo de dado de origem é  incompatível com o tipo de dado de destino. Nesse caso, devemos utilizar o operador de casting para realizar a conversão: 

```java
double x = 10.5;
int y = (int) x; // casting explícito
```

No exemplo anterior, o valor da variável x é convertido em um valor  inteiro utilizando o casting explícito. É importante notar que, neste  caso, a parte decimal será descartada e o valor atribuído à variável y  será 10.

Abaixo tem uma tabela, onde você pode visualizar mais facilmente as  conversões que são implícitas e as que necessitam ser feitas de forma  explícita.

![alt: Imagem de uma tabela, que descreve os tipos primitivos e indica os casos em que o cast é implícito e os casos em que é necessário informar de forma explícita.](https://caelum-online-public.s3.amazonaws.com/2858-java-criando-primeira-aplicacao/imagem21.png)

​		