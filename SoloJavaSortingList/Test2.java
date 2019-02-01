package SoloJavaSortingList;
import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[ ] args) {
        ArrayList<String> animals = new ArrayList<String>();
        String max, min, rev;
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        animals.add("-56");
        animals.add("3.14");
        animals.add("0");


        Collections.sort(animals);

        System.out.println("The sorted list is: " + animals);

        max = Collections.max(animals);
        min = Collections.min(animals);



        Collections.reverse(animals);
        System.out.println("The reversed list is: " + animals);
        System.out.println();
        Collections.shuffle(animals);
        System.out.println("The shuffled list is: " + animals);
        System.out.println();
        System.out.println("The maximum from the list is: " + max);
        System.out.println("The minimum from the list is: " + min);
    }
}