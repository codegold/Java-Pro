package SoloJavaIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();
        //  String value = it.next();
        /** Sort array before iterate */
        Collections.sort(animals);

        /** Iterate all collection */
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println(animals);
    }
}

