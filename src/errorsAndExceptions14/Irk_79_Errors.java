package errorsAndExceptions14;
import java.util.Scanner;

import java.util.Scanner;

public class Irk_79_Errors {
    public static void main(String[] args) {

        //Syntax error demo
        // int a = 0 // Error: no semicolon
        // b = 6; // Error: b not declared!

        // Logical error demo
        // write a program to print all prime numbers between 1 - 100
//        System.out.println(2);
//        for(int i = 1; i<5; i++){
//            System.out.println(2+"*"+i+"+"+1+" = "+(2*i+1));
//        }

        // RunTime Error Demo
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);

        // runtime error output ArithmeticException
//        0
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at errorsAndExceptions14.Irk_79_Errors.main(Irk_79_Errors.java:25)

    }
}
