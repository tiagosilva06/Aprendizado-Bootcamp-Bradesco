package FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Usada para criar ou fornecer novos objetos de um determinado tipo
public class SupplierExample {
        public static void main(String[] args) {
            Supplier<String> saudacao = () -> "Olá seja bem vindo(a)";

            //Usar o supplier para obter uma lista com 5 saudações
            List<String> listaSaudacoes = Stream.generate(() -> "Olá seja bem vindo(a)")
                    .limit(5)
                    .toList();

            listaSaudacoes.forEach(System.out::println);
        }
}
