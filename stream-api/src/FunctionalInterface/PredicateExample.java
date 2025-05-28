package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//é usado para filtrar os elementos do Stream com base em alguma condição.
public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "python", "javascript", "C", "GO", "Ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
