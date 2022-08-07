package basicJava;
import  java.util.Scanner;

public class Irk_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user ");
        Scanner sc = new Scanner(System.in);

      //  System.out.println("Integer number");
//        System.out.println("Enter first number :");
//        int a = sc.nextInt();
//        System.out.println("Enter second number :");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("sum of two number = "+sum);
//        System.out.println("float value");
//        System.out.println("Enter first number");

      //  System.out.println("floating number ");
//        float num1 = sc.nextFloat();
//        System.out.println("Enter second number");
//        float num2 = sc.nextFloat();
//        float add = num1+num2;
//        System.out.println("Add of two float number = "+add);

      //  System.out.println("string method");
//        String str1 = sc.nextLine();
//        System.out.println("nextLine()method = "+str1);
//        String str = sc.next();
//        System.out.println("next()method = "+str);

        System.out.println("Enter The value :");
        //boolean a = sc.hasNextInt();
        boolean a = sc.hasNextBigInteger();
        System.out.println(a);
    }
}
