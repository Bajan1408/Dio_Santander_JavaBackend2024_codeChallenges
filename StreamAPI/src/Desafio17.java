/*
 * Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
    static boolean isPrime(Integer num) {
        int numAux = num;
        if(num <= 1) {
            return false;
        }
        else if(num <= 3) {
            return true;
        } else {
            while(numAux > 2) {
                if(num % (numAux - 1) == 0) {
                    System.out.println("O numero é divisivel por " + (numAux - 1));
                    return false;
                }
                numAux--;
            }
        }
        
        return true;
    }

    static boolean multiplyByTwo(int num) {
        return num % 2 == 0 ? true : false;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        
        List<Integer> primes = numbers.stream()
        .filter(num -> isPrime(num))
        .collect(Collectors.toList());

        //System.out.println(primes);

        primes.forEach(System.out::println);
    
        System.out.println("O número 1234567 é primo? " + isPrime(81234567));
    }
}
