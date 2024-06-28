/*
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    static int getSum(int num) {
        int sum;
        for(sum = 0; num > 0; sum += num % 10, num /= 10) {}
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        System.out.println("A soma dos dígitos de todos os números da lista é " +
            numbers.stream()
        .map(num -> getSum(num))
        .reduce(0, Integer::sum)
        );
        
        

        
        
    }
}
