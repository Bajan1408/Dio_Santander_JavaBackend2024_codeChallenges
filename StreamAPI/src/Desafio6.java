/*
 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        Boolean numberGreaterThan10 = numbers.stream()
            .anyMatch((num) -> num > 10);

        System.out.println(numberGreaterThan10 ? "Número maior que 10 encontrado!" : "Não foi encontrado nenhum número maior que 10!");  
    }
}
