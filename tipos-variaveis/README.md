# Operadores Java, Tipos e Variáveis

Este documento tem como objetivo apresentar de forma simples e clara os conceitos de operadores, tipos de dados e variáveis em Java. Se você está começando no aprendizado da linguagem Java, este conteúdo será útil para entender como lidar com dados e operações básicas.

## 🔹 Tipos de Dados em Java
Java é uma linguagem fortemente tipada, ou seja, cada variável deve ser declarada com um tipo específico. Os principais tipos são:

### Tipos Primitivos
- **Inteiros:** `byte`, `short`, `int`, `long`
- **Ponto flutuante:** `float`, `double`
- **Caractere:** `char`
- **Booleano:** `boolean`

### Exemplos:
```java
int idade = 25;
float altura = 1.75f;
double peso = 70.5;
char inicial = 'A';
boolean aprovado = true;
```

### Tipos Não Primitivos
- **Strings:** `String nome = "João";`
- Arrays e objetos criados a partir de classes.

## 🔹 Variáveis em Java
Variáveis são espaços na memória do computador onde armazenamos dados. Em Java, antes de usar uma variável, precisamos declará-la:

```java
int numero;
numero = 10;
```
Ou de forma direta:
```java
int numero = 10;
```

### Regras para nomeação de variáveis:
- Devem começar com uma letra, `$` ou `_`.
- Não podem começar com números.
- Não podem ter espaços ou caracteres especiais como `@`, `#`, etc.

## 🔹 Operadores em Java
Java possui diversos operadores para realizar operações com variáveis e valores.

### Operadores Aritméticos
- `+` (adição)
- `-` (subtração)
- `*` (multiplicação)
- `/` (divisão)
- `%` (módulo - resto da divisão)

**Exemplo:**
```java
int a = 10;
int b = 3;
System.out.println(a + b);  // Saída: 13
System.out.println(a % b);  // Saída: 1
```

### Operadores de Comparação
- `==` (igual a)
- `!=` (diferente de)
- `>` (maior que)
- `<` (menor que)
- `>=` (maior ou igual a)
- `<=` (menor ou igual a)

**Exemplo:**
```java
int x = 5;
int y = 10;
System.out.println(x > y);  // Saída: false
```

### Operadores Lógicos
- `&&` (E lógico)
- `||` (OU lógico)
- `!` (NÃO lógico)

**Exemplo:**
```java
boolean resultado = (x > 2) && (y < 15);  // true
```

### Operadores de Atribuição
- `=` (atribuição simples)
- `+=`, `-=`, `*=`, `/=`, `%=` (atribuições combinadas)

**Exemplo:**
```java
int z = 10;
z += 5;  // z agora vale 15
```

## 🔹 Conclusão
Compreender variáveis, tipos de dados e operadores é essencial para desenvolver qualquer aplicação em Java. Esses conceitos são a base para a lógica de programação na linguagem.

Caso tenha alguma dúvida ou sugestão, fique à vontade para contribuir!

