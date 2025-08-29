# Resolução de Problemas Estruturados - TDE01
Este repositório contém implementações em Java de estruturas de dados, como Pilhas e Filas, assim como um algoritmo de Merge para combinar duas filas ordenadas.

## Como Executar
Para rodar qualquer um dos módulos, compile e execute a classe `Main.java` (ou `Testes.java` dependendo das funcionalidades desejadas) dentro do pacote correspondente.

## Item 1: Pilha (Implementação com Lista Encadeada)
Este módulo contém uma implementação simples de uma Pilha, onde o último elemento a entrar é o primeiro a sair (LIFO).

Funcionamento: Os elementos são inseridos e removidos do "topo" da pilha, que é o início da lista encadeada e a única variável de referência mantida.

Como Executar: Para testar a funcionalidade de forma interativa, execute o arquivo principal do pacote `pilha/Main.java`.

Exemplo de Teste: O arquivo `pilha/Teste.java` permite que você insira observe todas as operações, assim como o endereço de memória que está sendo utilizado e o valor atual.

## Item 2: Fila (Implementação com Lista Encadeada)
Este módulo implementa uma Fila no formato "primeiro a entrar, primeiro a sair" (FIFO).

Funcionamento: Os elementos são inseridos no final (representado pela variável *ultimo*) da lista e removidos do início (representado pela variável *inicio*).

Como Executar: Para um teste interativo da fila, execute o arquivo principal do pacote `fila/Main.java`.

Exemplo de Teste: Assim como na pilha, o arquivo `fila/Teste.java` permite a visualização do funcionamento da fila, permitindo a visualização dos endereços e valores sendo utilizados.

## Item 3: Merge de Filas Ordenadas
Este módulo implmenta a mesclagem de duas filas previamente ordenadas para retornar uma única fila também ordenada. 

Nessa sessão, há duas implementações: uma com o uso de filas baseadas em vetores e a outra, fila de lista encadeada.

### 3.1. Merge com Fila de Lista Encadeada
Funcionamento: Utiliza a implementação de fila baseada em lista encadeada (`fila/Fila.java`). O processo de mesclagem é conceitualmente o mesmo da versão com vetor.

Como Executar: Rode o arquivo `merge/listaEncadeada/Main.java`.

Exemplo de Teste: O arquivo `merge/listaEncadeada/Main.java` inicializa duas filas com os seguintes valores:

fila1: [1, 3, 5, 8]

fila2: [2, 3, 6, 7]

Ao ser executado, ele imprime a fila: 

1 -> 2 -> 3 -> 3 -> 5 -> 6 -> 7 -> 8 -> Null.

### 3.2. Merge com Fila de Vetor
Funcionamento: Utiliza uma implementação de fila circular baseada em array (`filaVetor/Fila.java`). O algoritmo de Merge combina duas filas, elemento por elemento, em uma nova fila de resultado.

Como Executar: Rode o `arquivo merge/vetor/Main.java`.

Exemplo de Teste: O arquivo `merge/vetor/Main.java` usa exatamente os mesmos valores do exemplo da lista encadeada para demonstrar a mesclagem:

fila1: [1, 3, 5, 8]

fila2: [2, 3, 6, 7]

A saída será a mesma fila ordenada: 

[1, 2, 3, 3, 5, 6, 7, 8].
