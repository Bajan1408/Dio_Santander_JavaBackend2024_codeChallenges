/*
 * Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        // System.out.println("Exibindo a soma dos números da lista maiores que 5... " +
        //     numbers.stream()
        // .filter(num -> num > 5)
        // .reduce(0, (a, b) -> a + b)
        // );

        
        int somaMaioresQue5 = numbers.stream()
        .filter(num -> num > 5)
        .reduce(0, (a, b) -> a + b);
        

        System.out.println("Exibindo a soma dos números da lista maiores que 5... " + somaMaioresQue5);
        


    }
}
