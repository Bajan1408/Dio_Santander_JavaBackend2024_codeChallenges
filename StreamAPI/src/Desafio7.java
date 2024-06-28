/*
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 24, 8, 9, 10, 5, 4, 3, 25);
        
        int biggerNumber = numbers.stream()
            .max(Comparator.naturalOrder()).get();

        List<Integer> listNumbers = numbers.stream()
        .collect(Collectors.toList());

        listNumbers.remove((Integer) biggerNumber);

        System.out.println("O segundo maior número da lista é " + listNumbers.stream()
        .max(Comparator.naturalOrder()).get() + "..");

    }
}
