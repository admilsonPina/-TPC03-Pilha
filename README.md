# -TPC03-Pilha
Calculadora Simples utilizando a estrutura de dados **Pilha**.

A aplicação possui um *modo* **texto (consola)** e um *modo* **gráfico**.

O modo consola está dentro do **pacote calculadora** e o modo gráfico está no **pacote interface**.

O **IDE** utilizado neste trabalho foi o **NetBeans**

# Modo Consola : Calculadora

## Classe No

A classe `No` representa um nó da pilha e possui dois atributos: `valor` e `proximo`.

- O construtor `No(int valor)` é responsável por criar um novo nó e definir o valor fornecido para o atributo `valor`. O atributo `proximo` é inicializado como `null`.
- Os métodos `getValor()` e `setValor(int valor)` permitem obter e definir o valor do nó, respectivamente.
- Os métodos `getProximo()` e `setProximo(No proximo)` permitem obter e definir o próximo nó na pilha, respectivamente.

## Classe Pilha

A classe `Pilha` implementa a estrutura de dados de uma pilha.

- O construtor `Pilha()` é responsável por criar uma nova pilha vazia. O atributo `topo` é inicializado como `null`.
- O método `push(int valor)` insere um novo elemento na pilha. Ele cria um novo nó com o valor fornecido e o adiciona no topo da pilha.
- O método `pop()` remove e retorna o elemento do topo da pilha. Se a pilha estiver vazia, ele lança uma exceção `EmptyStackException`.
- O método `peek()` retorna o elemento do topo da pilha sem removê-lo. Se a pilha estiver vazia, ele lança uma exceção `EmptyStackException`.
- O método `isEmpty()` verifica se a pilha está vazia e retorna um valor booleano indicando isso.

## Classe Calculadora

A classe `Calculadora` contém o método `main`, que é o ponto de entrada do programa.

- Dentro do método `main`, é criada uma instância da classe `Scanner` para ler a entrada do usuário e uma instância da classe `Pilha` para armazenar os valores.
- Em seguida, um loop é executado para permitir que o usuário interaja com a calculadora até que a opção de encerramento seja escolhida.
- Durante cada iteração do loop, é exibido um menu de opções para o usuário escolher.
- Dependendo da opção escolhida, a calculadora realiza operações como inserir um número na pilha, somar, subtrair, multiplicar, dividir ou encerrar o programa.
- Para cada operação, são feitas verificações para garantir que a pilha não esteja vazia antes de realizar a operação.
- Os valores são obtidos da pilha, operações são realizadas e os resultados são armazenados novamente na pilha.
- O loop continua até que a opção de encerrar seja escolhida.
- No final, uma mensagem é exibida indicando o encerramento do programa.


# Modo Interface : Calculadora

# Relatório de Funcionamento: Calculadora

A calculadora implementada permite realizar cálculos básicos utilizando uma interface gráfica simples. Abaixo, você encontrará informações detalhadas sobre o funcionamento da calculadora, bem como um exemplo de uso para guiar o usuário.

## Funcionamento da Calculadora

1. Ao iniciar a calculadora, uma janela é exibida com os botões numéricos, operadores e um campo de texto para exibir os números e resultados.

2. Os botões numéricos de 0 a 9 permitem inserir os respectivos números no campo de texto.

3. Os botões de operadores (+, -, *, /) permitem realizar operações matemáticas.

   - Exemplo: Para somar dois números, siga os passos abaixo:
     - Insira o primeiro número (por exemplo, 5) clicando no botão "5".
     - Clique no botão "+" para definir a operação de adição.
     - Insira o segundo número (por exemplo, 3) clicando no botão "3".
     - Clique no botão "=" para obter o resultado da adição.
     - O resultado (neste caso, 8) será exibido no campo de texto.

4. O botão "C" permite limpar a calculadora, apagando todos os valores e resultados.


5. A calculadora suporta a realização de várias operações em sequência. Por exemplo:

   - Exemplo: Para calcular 1 + 2 - 3 * 4 / 2, siga os passos abaixo:
     - Insira o primeiro número (1) clicando no botão "1".
     - Clique no botão "+" para definir a primeira operação de adição.
     - Insira o segundo número (2) clicando no botão "2".
     - Clique no botão "-" para definir a segunda operação de subtração.
     - Insira o terceiro número (3) clicando no botão "3".
     - Clique no botão "*" para definir a terceira operação de multiplicação.
     - Insira o quarto número (4) clicando no botão "4".
     - Clique no botão "/" para definir a quarta operação de divisão.
     - Insira o quinto número (2) clicando no botão "2".
     - Clique no botão "=" para obter o resultado da expressão.
     - O resultado (-2) será exibido no campo de texto.


A classe `Calculadora` implementa uma calculadora básica com interface gráfica. Ela utiliza a classe `Pilha` para realizar as operações matemáticas.

## Classe Calculadora

### Atributos

- `pilha`: Um objeto da classe `Pilha` utilizado para armazenar os valores e operadores.
- `display`: Um campo de texto para exibir os números e resultados.

### Método `main`

- Inicia a interface gráfica da calculadora.
- Cria a janela da calculadora com os botões e o campo de texto.

### Classe interna `ButtonClickListener`

- Implementa a interface `ActionListener` para lidar com os eventos dos botões.
- Ao clicar em um botão, o método `actionPerformed` é executado.
- Verifica qual botão foi clicado e realiza a ação correspondente:
  - Se o botão for "C", limpa a pilha e o campo de texto.
  - Se o botão for "=", realiza o cálculo dos valores na pilha e exibe o resultado no campo de texto.
  - Se o botão for um operador (`+`, `-`, `*`, `/`), adiciona o operador na pilha.
  - Caso contrário, o botão representa um número e o adiciona na pilha, exibindo-o no campo de texto.

### Método `isOperator`

- Verifica se uma string representa um operador (`+`, `-`, `*`, `/`).
- Retorna `true` se for um operador e `false` caso contrário.

### Método `calculate`

- Realiza a operação matemática entre dois números com base no operador informado.
- Retorna o resultado da operação.

## Classe No

- Implementa um nó de uma lista encadeada.
- Armazena um valor inteiro e uma referência para o próximo nó.

### Método `getValor`

- Retorna o valor armazenado no nó.

### Método `setValor`

- Define o valor armazenado no nó.

### Método `getProximo`

- Retorna a referência para o próximo nó.

### Método `setProximo`

- Define a referência para o próximo nó.

## Classe Pilha

- Implementa uma pilha utilizando a classe `Stack` do Java.

### Atributo

- `stack`: Uma pilha genérica para armazenar objetos.

### Método `push`

- Insere um valor inteiro na pilha, criando um novo nó com o valor.

### Método `pop`

- Remove e retorna o valor do topo da pilha.

### Método `pushString`

- Insere uma string na pilha.

### Método `popString`

- Remove e retorna a string do topo da pilha.

### Método `isEmpty`

- Verifica se a pilha está vazia.
- Retorna `true` se estiver vazia e `false` caso contrário.

### Método `clear`

- Limpa a pilha, removendo todos os elementos.

### Método `size`

- Retorna o tamanho atual da pilha.

