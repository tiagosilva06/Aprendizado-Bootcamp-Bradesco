package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Utilizada para transformar ou mapear elementos do Stream em outros valores ou tipos
public class FunctionExample {
    public static void main(String[] args) {
        List <Integer> numeros = Arrays.asList(1,2,3,4,5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
