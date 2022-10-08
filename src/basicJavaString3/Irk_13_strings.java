package basicJavaString3;
import java.util.Scanner;

public class Irk_13_strings {
    public static void main(String[] args) {
//        String name = new String("irshad");
//        String name1 = new String("irshad");
//        System.out.println(name==name1); //false
//        String name2 = "irshad";
//        String name3 = "irshad";
//        System.out.println(name2==name3); //true
//
//        System.out.println("name = "+name);
//        String names = "irshad";
//        System.out.println("name1 = "+names);

        int a = 6;
        float b = 2.3f;
//        System.out.printf("The value of a is %d and value of b is %f \n",a,b); // format and printf same do work
        System.out.format("The value of a is %d and value of b is %f ",a,b);
        char ch = 'a';
        System.out.println("ch = "+ch);

        System.out.println("");

        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        System.out.println(st);
        String st1 = sc.nextLine();
       // System.out.println(st1);
        System.out.printf("My name is %s ",st1);

    }
}
