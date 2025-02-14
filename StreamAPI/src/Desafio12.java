/*
 * Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Exibindo o produto de todos os números da lista: " +
            numbers.stream()
            .reduce(1, (a, b) -> a * b)
        );
    }
}
