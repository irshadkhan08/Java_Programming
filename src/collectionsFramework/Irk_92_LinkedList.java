package collectionsFramework;
import java.util.*;
public class Irk_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>l1 = new LinkedList<>();
        LinkedList<Integer>l2 = new LinkedList<>();
        l2.add(11);
        l2.add(20);
        l1.add(4);
        l1.add(3);
        l2.add(40);
        l1.add(1);
        l2.add(60);
        l1.add(109);
        l1.addLast(100);
        l1.add(101);
        System.out.println (l1);
        l1.add(4);
        l2.add(88);
        l2.add(84);
        l1.add(12);
        l1.add(5);
        l2.add(80);
        l2.add(89);
        l1.clear(); // l1 no print
        l1.add(0,23);
        l1.add(0,24);
        //l1.addAll(l2);//l2 add in end
        l1.addAll(0,l2); // l2 element print in start 0 index

        System.out.println (l1.contains (500));// because 500 is not present in l1 answer is false
        System.out.println (l1.indexOf(600));// return -1
        System.out.println (l1.lastIndexOf (80));//5
        // l1.clear();
        l1.set(2,456);
        l1.addLast(100);
        l1.addFirst (1000);
        //l1.remove (0);// remove 20 in 0th index
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ,");
        }


    }
}
