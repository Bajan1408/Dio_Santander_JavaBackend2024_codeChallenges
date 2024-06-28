/*
 * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 10);

        List<Integer> soma = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

        System.out.println("A soma dos números pares é: " + soma.stream()
        .reduce(0, (n1, n2) -> n1 + n2));
          
    }
    
}
