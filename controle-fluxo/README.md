# Controle de Fluxo e Exceptions em Java

O controle de fluxo em Java define como as instruções do programa são executadas, dependendo de condições e laços de repetição. Já as exceptions são usadas para tratar erros e garantir que o programa continue funcionando mesmo quando ocorrem problemas inesperados.

## 1. Controle de Fluxo em Java

### Estruturas Condicionais

1. **if-else**: Executa um bloco de código se a condição for verdadeira.
   ```java
   int numero = 10;
   if (numero > 0) {
       System.out.println("Número positivo");
   } else {
       System.out.println("Número negativo ou zero");
   }
   ```

2. **switch-case**: Escolhe entre múltiplas opções baseando-se em um valor específico.
   ```java
   int dia = 3;
   switch (dia) {
       case 1: System.out.println("Domingo"); break;
       case 2: System.out.println("Segunda"); break;
       case 3: System.out.println("Terça"); break;
       default: System.out.println("Dia inválido");
   }
   ```

### Estruturas de Repetição

1. **for**: Executa um bloco de código um número determinado de vezes.
   ```java
   for (int i = 0; i < 5; i++) {
       System.out.println("Valor de i: " + i);
   }
   ```

2. **while**: Executa enquanto a condição for verdadeira.
   ```java
   int contador = 0;
   while (contador < 5) {
       System.out.println("Contador: " + contador);
       contador++;
   }
   ```

3. **do-while**: Executa o bloco pelo menos uma vez, depois verifica a condição.
   ```java
   int num = 0;
   do {
       System.out.println("Executando pelo menos uma vez");
       num++;
   } while (num < 1);
   ```

### Controle de Fluxo em Laços

- **break**: Interrompe um loop antes da conclusão.
  ```java
  for (int i = 0; i < 10; i++) {
      if (i == 5) {
          break;
      }
      System.out.println(i);
  }
  ```

- **continue**: Pula a iteração atual e continua a execução do loop.
  ```java
  for (int i = 0; i < 5; i++) {
      if (i == 2) {
          continue;
      }
      System.out.println(i);
  }
  ```

## 2. Exceptions em Java

As exceptions são usadas para lidar com erros inesperados no programa e evitar que ele falhe de maneira inesperada.

### Tipos de Exceptions

1. **Checked Exceptions**: Precisam ser tratadas obrigatoriamente com `try-catch` ou declaradas com `throws`.
   - Exemplo: `IOException`, `SQLException`.

2. **Unchecked Exceptions**: Ocorrem em tempo de execução e não precisam ser tratadas explicitamente.
   - Exemplo: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

### Tratamento de Exceptions

1. **try-catch**: Captura uma exceção e permite que o programa continue rodando.
   ```java
   try {
       int resultado = 10 / 0; // Gera uma ArithmeticException
   } catch (ArithmeticException e) {
       System.out.println("Erro: divisão por zero");
   }
   ```

2. **finally**: Executa um bloco de código independentemente de ocorrer exceção ou não.
   ```java
   try {
       System.out.println("Executando código...");
   } catch (Exception e) {
       System.out.println("Ocorreu um erro");
   } finally {
       System.out.println("Finalizando execução");
   }
   ```

3. **throws**: Declara que um método pode lançar uma exceção.
   ```java
   public void lerArquivo() throws IOException {
       throw new IOException("Erro ao ler o arquivo");
   }
   ```

4. **throw**: Lança manualmente uma exceção.
   ```java
   throw new IllegalArgumentException("Parâmetro inválido");
   ```

## 3. Conclusão

O controle de fluxo e o tratamento de exceptions são fundamentais para criar programas robustos e confiáveis. Aprender a utilizá-los corretamente ajuda a evitar comportamentos inesperados e melhora a manutenção do código.

### Recursos Adicionais

- [Documentação Oficial do Java](https://docs.oracle.com/en/java/)
- [Guia de Exceptions do Java](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Stack Overflow](https://stackoverflow.com/)

Praticar essas estruturas e o tratamento de exceptions ajudará a desenvolver um código mais eficiente e seguro!

