Desafio da Bilheteria

O desafio aqui é criar um código para resolver o problema relatado abaixo. Assim que estiver pronto, anexe os arquivos da resposta nesse exercício.

Há uma bilheteria de cinema onde possui uma grande fila. Cada uma das pessoas na fila possuem notas de 100, 50 ou 25 reais e o bilhete do filme custa 25 reais.

O caixa iniciará vazio. Precisamos criar um algoritmo para verificar se haverá troco suficiente para cada pessoa que será atendida na fila, conforme elas vão chegando e seguindo a ordem correta.

Retorne SIM, se haverá troco pra todo mundo, observando apenas os valores que estão na fila. Caso contrário, retorne NÃO. 
Exemplos:

Fila.ingressos(25,25,25,50,25,50,50,100) - Retorna SIM
Fila.ingressos(25,25,25,100) - Retorna SIM
Fila.ingressos(25,50,100) - Retorna NÃO, pois não terá troco ao último da fila
Fila.ingressos(25,50,50,25) - Retorna NÃO, pois não terá troco para o terceiro da fila
