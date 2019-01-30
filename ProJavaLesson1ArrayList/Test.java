package ProJavaLesson1ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        int[] x = new int[3];
//        for (int i = 0; i < 3; i++) {
//            x[i] = 1;
//        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        System.out.println(list);
//        System.out.println(list.get(0));
//        System.out.println(list.get(99));
//        System.out.println(list.size());

//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//        for(int x : list)
//            System.out.println(x);

        list.remove(5);
        System.out.println(list);
    }
}

