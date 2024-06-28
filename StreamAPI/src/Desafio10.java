/*
 * Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio10 {
   public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

      List<Integer> multiples3And5 = numbers.stream()
         .filter(num -> num % 3 == 0 || num % 5 == 0)
         .collect(Collectors.toList());

      System.out.println("Exibindo lista de múltiplos de 3 e de 5: " + multiples3And5);
   }
    
}
