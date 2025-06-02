# DynamicArray

Este projeto implementa uma estrutura de dados chamada `DynamicArray` em Java, semelhante a um array dinâmico, com suporte a iteração personalizada.

## Estrutura do Projeto
- `DynamicArray.java`: Implementação da estrutura de dados dinâmica.
- `MyIterator.java`: Implementação de um iterador personalizado para o `DynamicArray`.
- `Main.java`: Classe principal para testar e demonstrar o uso do `DynamicArray` e do iterador.

## Como Executar
1. Compile todos os arquivos Java:
   ```sh
   javac src/*.java
   ```
2. Execute a classe principal:
   ```sh
   java -cp src Main
   ```

## Exemplo de Uso
```java
Integer[] array = {1, 2, 3, 4, 5};
DynamicArray dc = new DynamicArray(array);
MyIterator iterator = (MyIterator) dc.iterator();
dc.remove(2); // Remove o elemento no índice 2
```

## Autor
Projeto de exemplo para estudo de estruturas de dados em Java.
