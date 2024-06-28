/*
 * Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        List<Integer> numbers = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2);

        System.out.println(
            numbers.stream()
            .allMatch(num -> num == numbers.get(0)) ? "Sim, todos os números da lista são iguais." : "Não, os números da lista não são todos iguais."
        );
    }
}