package HashSet;

import java.util.HashSet;
import java.util.Set;

public class RemoveAll {
    public static void main(String[] args) {
        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("Hashset: " + evenNumbers);

        evenNumbers.remove(6);
        System.out.println(evenNumbers); // remove 6-ni sildi

        evenNumbers.removeAll(evenNumbers);
        System.out.println(evenNumbers);
        System.out.println("==================================");







    }
}
