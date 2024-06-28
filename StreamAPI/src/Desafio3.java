/*
 * 
 * Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 3, 30, 4, 50, 6, 70, 8, 90, 10, 50, 4, 30, 24);

        System.out.println(numbers.stream().allMatch((num) -> num % 2 == 0) ? "Todos os números da lista são pares.." : "Tem número impar na lista.."  );
        

    }
}
