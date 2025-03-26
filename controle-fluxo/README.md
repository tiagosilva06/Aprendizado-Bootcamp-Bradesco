# Controle de Fluxos e Estruturas Condicionais em Java

Este README apresenta os conceitos de controle de fluxos e estruturas condicionais em Java, fundamentais para criar lógica condicional e controlar o comportamento do código de acordo com diferentes condições.

---

## 🔹 Controle de Fluxos
O controle de fluxos permite direcionar o caminho de execução do programa com base em condições. As principais estruturas de controle de fluxos em Java são:

### ✅ Estruturas Condicionais:
1. **if, else if, else**
   ```java
   int idade = 18;
   if (idade >= 18) {
       System.out.println("Você é maior de idade.");
   } else {
       System.out.println("Você é menor de idade.");
   }
   ```

2. **switch-case**
   ```java
   char letra = 'A';
   switch (letra) {
       case 'A':
           System.out.println("Vogal A");
           break;
       case 'E':
           System.out.println("Vogal E");
           break;
       default:
           System.out.println("Não é uma vogal conhecida.");
   }
   ```

### 🔹 Operador Ternário:
É uma forma reduzida de escrever estruturas condicionais simples.
```java
int numero = 10;
String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
System.out.println("O número é " + resultado);
```

---

## 🔹 Estruturas de Repetição como Complemento Condicional
Estruturas de repetição podem complementar o controle de fluxos, repetindo blocos de código com base em condições.

1. **while** - Repetição controlada por condição.
   ```java
   int contador = 0;
   while (contador < 5) {
       System.out.println("Contador: " + contador);
       contador++;
   }
   ```

2. **do-while** - Garante pelo menos uma execução do bloco de código.
   ```java
   int x = 0;
   do {
       System.out.println("Valor de x: " + x);
       x++;
   } while (x < 5);
   ```

---

## 🔹 Palavras-chave de Controle de Fluxos
- **break:** Interrompe a execução do laço ou fluxo atual.
- **continue:** Interrompe a iteração atual e avança para a próxima.
- **return:** Finaliza a execução de um método e, se necessário, retorna um valor.

### Exemplo:
```java
for (int i = 0; i < 5; i++) {
    if (i == 3) break;  // Para no 3
    if (i == 1) continue; // Pula o 1
    System.out.println("Valor: " + i);
}
```

---

## 🔹 Conclusão
O domínio das estruturas de controle de fluxos e condicionais é crucial para desenvolver programas Java eficientes e flexíveis. Compreender quando e como utilizá-las é a chave para criar lógicas bem estruturadas.

