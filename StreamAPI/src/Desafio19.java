import java.util.Arrays;
import java.util.List;

/*
 * Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
 * 
 */

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 4, 3,25);

        System.out.println("A soma dos números divisíveis por 3 e por 5 ao mesmo tempo é: " + 
            numbers.stream()
            .filter(num -> num % 3 == 0 && num % 5 == 0)
            .reduce(0, (a, b) -> a + b)
        );
    }
}
