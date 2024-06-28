/*
 * Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 25);

        System.out.println(
            numbers.stream()
            .distinct()
            .collect(Collectors.toList())
        );
    }
    
}
