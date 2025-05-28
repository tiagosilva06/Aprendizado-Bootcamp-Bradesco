package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//É usado para realizar operaões de redução em pares de elementos, como combinar numeros ou somar objetos
public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos numeros é = " + resultado);
    }
}
