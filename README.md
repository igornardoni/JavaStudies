![](C:\Users\Igor Augusto\JavaStudies\img\banner.png)

# Desafio

Vamos implementar uma aplicação para controlar nossa conta bancária, seja ela virtual ou não.

## 🔨 Objetivos do projeto

- Criar um cabeçalho inicial com os dados do cliente (Nome, Tipo da Conta e Saldo)
- Criar um menu que descreve as operações. Aqui você pode escolher o nome de método que mais lhe agradar, como *saca* (ou *transfere*, *enviaPix*) para simular a **retirada** de valores da conta e *deposita* (ou *recebeTransferencia*, *recebePix*) para representar a **entrada** de valores na conta. 
- O menu deve ter quatro opções: a de entrada de valor, saída de valor, consulta de saldo e finalização da aplicação.
- Lembre-se que para fazer a saída de valores, é necessário ter saldo suficiente.
- O menu deve aparecer continuamente até que o usuário digite a opção para sair.
- Caso ele digite qualquer opção que não seja correta, deve apresentar a mensagem de opção inválida.
- Usaremos a classe Scanner para fazer a leitura da opção do usuário.



Exemplo/Sugestão de tela para o menu:



[![image](https://user-images.githubusercontent.com/66698429/218162389-1b68a232-e91b-44ba-b7b3-317920d69ee1.png)](https://user-images.githubusercontent.com/66698429/218162389-1b68a232-e91b-44ba-b7b3-317920d69ee1.png)



## Mais informações:



### Transcrição =>

**Jacqueline:** Vamos deixar um desafio para você. Pode parecer mais simples do que quando trabalhamos juntos, mas quando estamos iniciando um projeto de fato, pode ser que tenhamos dificuldade quanto tentarmos por conta própria.

Apresentaremos um projeto para nos desafiar e, ao longo das aulas, iremos resolver e fazer sugestões de como trabalhar. Assim, iremos consolidar os conhecimentos com tudo o que aprendemos no curso.

No IntelliJ, a ideia é controlarmos nossa conta bancária virtual e nomearemos os métodos como `recebeTransferencia()`, `fazTransferencia()`, `enviaPix()` ou `recebePix()`, por exemplo. Mas poderemos nomear como acharmos melhor.

A proposta é iniciarmos os dados do cliente como um extrato, e em seguida, teremos quatro opções de operações com a linha para inserir a opção desejada:

```markdown
***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
```

Se apertarmos a tecla "1", iremos consultar o saldo e mostraremos o valor atual de `R$ 2500.0`, mas se apertarmos "2", exibiremos um segundo campo para escrevermos: `Informe o valor a receber:`.

Inseriremos o valor que iremos depositar, como `700` por exemplo, e, ao apertarmos "Enter", mostraremos o saldo atualizado de `R$ 3200.0`.

```yaml
//omitido

Digite a opção desejada:
2

Informe o valor a receber:
700

Saldo atualizado R$ 3200.0
```

Mas se formos fazer uma transferência ou um saque com a tecla "3", teremos o campo `Informe o valor que deseja transferir:`. Se digitarmos `1000`, exibiremos o saldo atualizado de `R$ 2200.0`.

```bash
//omitido

Digite a opção desejada:
3

Informe o valor que deseja transferir:
1000

Saldo atualizado R$ 2200.0
```

Por fim, para encerrarmos a aplicação, bastará apertarmos a tecla "4" em `Digite a opção desejada:`. Mas se digitarmos um número inválido como "9" por exemplo, receberemos a mensagem `Opção inválida`.

Se temos dois mil e duzentos reais e tentarmos transferir um valor maior que este, como `500`, teremos uma mensagem de que o saque não pode ser realizado:

```bash
Não há saldo suficiente para fazer essa transferência.
```

Com este projeto, conseguiremos praticar tudo o que aprendemos no curso, como declaração de variável, condicional e *loop*.

Nossa sugestão é que faça por etapas passando por cada detalhe e testando, como em um *checklist*:

- **Inicializar dados do cliente**
- **Menu de opções**
- **Visualização do saldo**
- **Enviar valor**
- **Receber valor**

Esperamos que te ajude a fixar ainda melhor o conteúdo. Se quiser, compartilhe conosco, nos marque no LinkedIn ou coloque no GitHub!

A seguir, daremos as dicas para resolvermos o desafio.