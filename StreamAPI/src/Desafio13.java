/*
 * Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        System.out.println("Exibindo os números no intervalo entre o 5º e o 10º número da lista: " +
            numbers.stream()
            .skip(5)
            .limit(5)
            .collect(Collectors.toList())
        );
    }
}
