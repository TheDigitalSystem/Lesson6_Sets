package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Add_addAll {
    public static void main(String[] args) {
        Set<String> animals = new HashSet<>();
        animals.add("Qashqaldaq");
        animals.add("Djanavar");
        animals.add("Xaski");
        System.out.println(animals);


        Set<String> cars = new HashSet<>();
        cars.add("CLS");
        cars.add("E");
        cars.add("C");
        System.out.println(cars);
        System.out.println("-----------------------");

        System.out.println(animals.addAll(cars)); //true verir
        System.out.println(cars); // cars cixardir
        System.out.println(animals); // hamisini cixardir

        Set<String> numbers = new HashSet<>();
        numbers.add("1");
        numbers.add("2");
        System.out.println(animals.addAll(numbers));
        System.out.println(animals); // bunda ise hamisi cixir. Sebebi Lifo prinsipidir

        System.out.println("-------------------------------------------");


        Set<Integer>  evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("Hashset: " + evenNumbers);


        Set<Integer> differentNums = new HashSet<>();
        differentNums.addAll(evenNumbers);
        differentNums.add(5);
        System.out.println("New Hashset:" + differentNums);

    }
 }
