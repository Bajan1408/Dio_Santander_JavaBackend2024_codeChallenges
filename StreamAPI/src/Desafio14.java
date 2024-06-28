/*
 * Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        System.out.println("O maior número par da lista é: " +
            numbers.stream()
            .filter(num -> num % 2 == 0)
            .max(Comparator.naturalOrder())
            .get()
        );
    }
}
