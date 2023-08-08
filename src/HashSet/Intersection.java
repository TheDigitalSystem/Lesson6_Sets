package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {


        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(3);
        evenNumbers.add(6);
        System.out.println("Hashset 1: " + evenNumbers);

        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(4);
        primeNumbers.add(6);
        System.out.println("Hashset 2: " + primeNumbers);

        evenNumbers.retainAll(primeNumbers);  // retainAll kesihmesini yoxlayir ortaq olanlar
        System.out.println("Intersection; " + evenNumbers);

    }
}
