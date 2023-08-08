package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AccessElements {
    public static void main(String[] args) {

        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("Hashset: " + evenNumbers);

        // Iterator metodunun cagirilmasidir. next next ede ede elementleri cixardir
        Iterator<Integer> Iterate = evenNumbers.iterator();
        System.out.println("Hashset Iteratordan istifade edir;");


        // Accessing element hissesidir .
      while (Iterate.hasNext()){
          System.out.print(Iterate.next()); // print Ln edende pis gunde cixardir
          System.out.print(" . ");
      }

    }
}
