/*
 * Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 7, 8, 9, 10, 5, 4, 3,25);

        System.out.println(numbers.stream()
        .anyMatch(num -> num < 0) ? "Há pelo menos um número negativo na lista.." : "Não há números negativos na lista.."); 
    }
}
