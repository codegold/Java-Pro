package SoloJavaIterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        System.out.println();

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> itnum = numbers.iterator();
        while(itnum.hasNext()) {
            int valnumber = itnum.next();
            System.out.println(valnumber);
        }
        System.out.println();

        Iterator<String> it = animals.iterator();
        /**Iterator is class name, java recommendation is
          class name always start with capital letter,but
          with small "i" is the name of the method
        */
         while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}
