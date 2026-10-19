# Desafios de Código sobre POO e Exceções com Java no Setor Bancário
# 1 / 2 - ByteBank Java: Operacoes Bancarias com POO e Excecoes


 Básico
 Princípios Básicos
## Desafio
No banco ByteBank, uma nova etapa do treinamento de desenvolvedores simula o processamento de operacoes em contas digitais. A equipe quer avaliar se os candidatos entendem como modelar comportamentos simples de objetos e como tratar situacoes invalidas, como se fossem excecoes de negocio. Para isso, cada teste descreve uma conta com saldo inicial e uma tentativa de operacao.

Implemente um programa que leia uma unica operacao bancaria e informe o resultado final. Existem dois tipos de operacao: DEPOSITO e SAQUE. Se a operacao for DEPOSITO, o valor deve ser somado ao saldo. Se for SAQUE, o valor deve ser subtraido apenas se houver saldo suficiente. Considere como erro qualquer valor menor ou igual a zero. Tambem e erro informar um tipo de operacao diferente dos dois permitidos. Nesses casos, em vez de atualizar a conta, o programa deve retornar uma mensagem de falha. O objetivo e representar a ideia de uma classe Conta com metodos de deposito e saque, alem de validacoes equivalentes ao lancamento de excecoes, embora a solucao final deva apenas imprimir a resposta pedida.

### Entrada
A entrada contem tres linhas. A primeira linha possui uma string com o tipo da operacao: DEPOSITO ou SAQUE. A segunda linha contem uma string representando um numero inteiro com o saldo inicial da conta. A terceira linha contem uma string representando um numero inteiro com o valor da operacao.

### Saída
Se a operacao for valida, imprima Saldo final: X, em que X e o saldo apos o processamento. Se o tipo for invalido, imprima Erro: operacao invalida. Se o valor for menor ou igual a zero, imprima Erro: valor invalido. Se um saque exceder o saldo, imprima Erro: saldo insuficiente.

### Exemplos
A tabela abaixo apresenta exemplos de entrada e saída:

| Entrada|Saída|
| --- | ---- |
| DEPOSITO <br> 100 <br> 50	| Saldo final: 150 |
| SAQUE <br> 80<br> 30 |	Saldo final: 50 |
| SAQUE <br> 20 <br> 40	| Erro: saldo insuficiente |
| PIX <br> 100 <br> 10	| Erro: operacao invalida |





# 2 / 2 - ByteBank Java: Operações Bancárias Com POO E Exceções
XP 1861/2554
NÍVEL 6
5/5
 Básico
 Princípios Básicos
## Desafio
No banco ByteBank, uma nova etapa do treinamento de desenvolvedores simula o processamento de operacoes em contas digitais. A equipe quer avaliar se os candidatos entendem como modelar comportamentos simples de objetos e como tratar situacoes invalidas, como se fossem excecoes de negocio. Para isso, cada teste descreve uma conta com saldo inicial e uma tentativa de operacao.

Implemente um programa que leia uma unica operacao bancaria e informe o resultado final. Existem dois tipos de operacao: DEPOSITAR e SACAR. Se a operacao for DEPOSITAR, o valor deve ser somado ao saldo. Se for SACAR, o valor deve ser subtraido apenas se houver saldo suficiente. Considere erro tambem quando o valor informado for menor ou igual a zero, ou quando o tipo de operacao for diferente dos dois permitidos. Em qualquer erro, o saldo nao deve ser alterado. A ideia representa, de forma simplificada, um metodo de classe Conta e validacoes equivalentes a excecoes. Ao final, imprima exatamente uma mensagem indicando sucesso ou erro.

### Entrada
A entrada contem uma unica linha com tres partes separadas por espaco: o tipo da operacao, o saldo inicial e o valor da operacao. O tipo sera uma string. Os dois valores numericos serao inteiros nao negativos. Exemplos de tipo valido: DEPOSITAR e SACAR.

### Saída
Se a operacao for valida, imprima OK seguido de um espaco e do saldo final. Se o tipo for invalido, imprima ERRO: OPERACAO INVALIDA. Se o valor for menor ou igual a zero, imprima ERRO: VALOR INVALIDO. Se for um saque sem saldo suficiente, imprima ERRO: SALDO INSUFICIENTE.

### Exemplos
A tabela abaixo apresenta exemplos de entrada e saída:

| Entrada |	Saída |
| -- | -- |
| DEPOSITAR 100 50 | 	OK 150 |
| SACAR 80 30 |	OK 50 |
| SACAR 20 40	 | ERRO: SALDO INSUFICIENTE |
| PIX 100 10	| ERRO: OPERACAO INVALIDA |