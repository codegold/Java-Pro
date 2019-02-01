package SoloJavaSortingList;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {



    public static void main(String[ ] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");
        animals.add("7");
        animals.add("-56");
        animals.add("80");
        animals.add("3.14");
        animals.add("0");
        Collections.sort(animals);

        System.out.println(animals);
    }
}

