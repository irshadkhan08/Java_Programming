package basicJava2;
import java.util.Scanner;

public class Irk_ch2_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arithmetic operators
//        int a = sc.nextInt();
//        float b = sc.nextFloat();
//        System.out.println("a*b = "+(a+b));
//        System.out.println("a/b = "+(a/b));
//        System.out.println("a%b = "+(a%b));
//        a++;
//        --b;
//        System.out.println("a++ = "+a);
//        System.out.println("--b = "+b);
//        System.out.println(1.1%4.8); //--> returns decimal remainder

        //Assignment operators
//        int a = 6;
//        int b = 8;
//
//        a+=b;
//        System.out.println("a+b = "+a);// a = 14
//        b*=a;
//        System.out.println("b*a  = "+b);

        //Comparison operators
//        System.out.println(6==6);
//        System.out.println(23>=23);
//        System.out.println(45<56);
//        System.out.println(34>34);

        //Logical operators
        System.out.println(23>3 && 34>23);
        System.out.println(23<34 || 45>56);
        System.out.println(34>45 != 34>56);

        //Bitwise operators
        // left shift a<<2 = a*2^2
        //right shift a>>2 = a/2^2

        System.out.println(10 & 11);
        System.out.println(2|3);
        System.out.println(2>>2);
        System.out.println(2<<2);

    }
}
