package TreeSet;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println( "evenNumbers:  "+ evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(15);
        numbers.addAll(evenNumbers);
        System.out.println("new treeset: " + numbers);
        System.out.println("new treeset: " + numbers.first());
        System.out.println("new treeset: " + numbers.last());
    }
}
