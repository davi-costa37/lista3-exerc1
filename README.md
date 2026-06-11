🧮 Contador de Dígitos Recursivo (Java)
Este projeto apresenta uma solução elegante e performática em Java para contar a quantidade de dígitos de um número inteiro utilizando o conceito de recursividade.

⚙️ Como Funciona o Algoritmo
A lógica do método contarDigitos foi estruturada em duas partes fundamentais da recursão:
Condição de Parada (Caso Base): Se o número for menor que 10 (ex: de 0 a 9), ele possui apenas 1 dígito. 
O método então interrompe as chamadas e retorna 1.
Relação de Recorrência: Se o número for maior ou igual a 10, o algoritmo divide o número por 10 (removendo o último dígito devido à divisão inteira do Java) e soma 1 ao resultado da chamada recursiva com o restante do número.

🚀 Estrutura do Código
O controlador possui o seguinte método principal:
public int contarDigitos(int numero): Recebe um valor inteiro e retorna a quantidade total de dígitos que o compõem.
Exemplo de Execução Passa a Passo
Se passarmos o número 345:contarDigitos(345) retorna $1 + \text{contarDigitos}(34)$contarDigitos(34) retorna $1 + \text{contarDigitos}(3)$contarDigitos(3) atinge a condição de parada e retorna 1.
Resultado final: $1 + 1 + 1 = 3$.

🛠️ Requisitos e Tecnologias
Linguagem: Java (JDK 8 ou superior)
Conceito Aplicado: Recursividade e Estrutura de Decisão.
