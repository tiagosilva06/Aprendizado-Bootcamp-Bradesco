package FunctionalInterface.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Lista ordenada em ordem crescente:");
        numeros.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Lista ordenada exibindo somente os numeros pares:");
        numeros.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Verificando se todos os numeros são positivos:");
        boolean todosPositivos = numeros.stream().allMatch(n -> n > 0);

        if (todosPositivos){
            System.out.println("Todos os numeros da lista são positivos");
        } else {
            System.out.println("Existe algum numero <= 0 na lista");
        }

        System.out.println("Verificando se todos os numeros são positivos:");

        System.out.println("Calculando a média dos numeros maiores que 5:");
        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer :: intValue)
                .average();

        if (media.isPresent()){
            System.out.println("Média dos numeros maiores que 5 = " + media.getAsDouble());
        } else {
            System.out.println("Nenhum numero maior que 5 encontrado");
        }
    }
}
