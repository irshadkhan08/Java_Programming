package collectionsFramework;

import java.util.ArrayDeque;

public class Irk_93_arraydeque {
    public static void main(String[] args) {

        ArrayDeque<Integer>ad1 = new ArrayDeque<> ();
        ad1.add(3);
        ad1.add(30);
        ad1.add(45);
        ad1.addFirst(2);
        System.out.println (ad1.getFirst());
        System.out.println (ad1.getLast());

    }
}
