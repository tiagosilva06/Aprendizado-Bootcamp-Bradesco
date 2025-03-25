# Terminal, Argumentos e Scanner em Java

Este documento aborda conceitos básicos de como interagir com o terminal, passar argumentos e utilizar a classe `Scanner` em Java para entradas de dados. Esses conhecimentos são essenciais para desenvolver aplicações que interajam diretamente com o usuário.

## 🔹 Terminal em Java
O terminal é a interface de linha de comando onde você pode compilar e executar programas Java. Podemos compilar e rodar nossos códigos da seguinte forma:

```bash
javac MeuPrograma.java   // Compila o código
java MeuPrograma         // Executa o código
```

## 🔹 Executando com o Bin
Após compilar o código, é possível executar diretamente pelo terminal, utilizando o diretório `bin` para organizar os arquivos `.class` compilados. Por exemplo:

```bash
// Compilação com saída no diretório bin
javac -d bin AboutMe.java

// Execução do programa compilado
java -cp bin AboutMe
```

## 🔹 Argumentos de Linha de Comando
Os argumentos de linha de comando são informações passadas para o programa na hora da execução. Em Java, esses argumentos são acessados através do parâmetro `String[] args` do método `main`.

### Exemplo de uso no código AboutMe:
```bash
java -cp bin AboutMe Tiago Silva 28 1.85
```

No exemplo acima:
- `Tiago` é o nome
- `Silva` é o sobrenome
- `28` é a idade
- `1.85` é a altura

### Código AboutMe com Argumentos:
```java
/* Usando argumentos de linha de comando
String nome = args[0];
String sobrenome = args[1];
int idade = Integer.valueOf(args[2]);
double altura = Double.valueOf(args[3]);
*/
```

## 🔹 Scanner em Java
A classe `Scanner` é usada para receber entradas de dados do usuário durante a execução do programa. Podemos usá-la para leitura dinâmica no terminal:

```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = entrada.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.next();

        System.out.println("Digite sua altura:");
        double altura = entrada.nextDouble();

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

        entrada.close();
    }
}
```

## 🔹 Métodos Comuns da Classe Scanner:
- `nextInt()`: Lê um número inteiro.
- `nextDouble()`: Lê um número decimal.
- `nextLine()`: Lê uma linha inteira de texto.
- `next()`: Lê uma única palavra.
- `nextBoolean()`: Lê um valor booleano (true ou false).

## 🔹 Cuidados ao usar Scanner
- Sempre finalize o `Scanner` com o método `close()` para liberar os recursos.
- Quando alternar entre leitura de números e textos, use `nextLine()` para evitar problemas de quebra de linha.

### Exemplo de Solução para Problemas de Leitura:
```java
System.out.print("Digite um número: ");
int numero = scanner.nextInt();
scanner.nextLine(); // Consome a quebra de linha
System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();
```

## 🔹 Conclusão
Entender como interagir com o terminal, passar argumentos e utilizar o Scanner é essencial para criar programas dinâmicos e interativos em Java. Caso tenha dúvidas ou queira compartilhar algo, fique à vontade!

