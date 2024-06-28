/*
 * Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        System.out.println("Soma dos quadrados de todos os números da lista: " +
            numbers.stream()
            .map(num -> (int) Math.pow(num, 2))
            .reduce(0, (a, b) -> a + b)
        );
    }
}
