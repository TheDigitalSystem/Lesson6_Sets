package HashSet;

import java.util.HashSet;
import java.util.Set;

public class ContainsAll {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Hashset; " + numbers);

Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(1);
        primeNumbers.add(2);
        System.out.println(primeNumbers);

        boolean result = numbers.containsAll(primeNumbers);
        System.out.println("1 is 2 subset of " + result);
    }
}
