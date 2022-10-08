package errorsAndExceptions14;
import java.io.*;
import java.util.Scanner;

public class Irk_82_nested_try_catch {
    public static void main(String[] args) {
//        int marks[] = new int[3];
//        marks[0] = 1;
//        marks[1] = 4;
//        marks[2] = 45;
//        Scanner sc = new Scanner(System.in);
//        int ind = sc.nextInt();
//        boolean flag = true;
//        try{
//            System.out.println("Welcome to you sir");
//            try{
//                System.out.println(marks[ind]);
//                flag = false;
//            }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("sorry this index is does not exist");
//                System.out.println ("Exception in level 2:"+e);
//            }
//        }
//        catch(Exception e){
//            System.out.println("Exception in level 1");
//        }
//        System.out.println ("Thanks for using this program");

//        int marks[] = new int[2];
//        marks[0] = 22;
//        marks[1] = 34;
//        Scanner sc = new Scanner(System.in);
//        System.out.println ("Enter the index");
//        int index = sc.nextInt();
//        System.out.println ("Enter the number");
//        int number = sc.nextInt();
//        try {
//            System.out.println ("The marks the value of " + marks[index]);
//            try {
//                System.out.println ("The marks id divide by number " + marks[index] / number);
//               }
//            catch (ArithmeticException e) {
//                System.out.println ("Arithmetic Exception is occur");
//                System.out.println (e);
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println ("The ArrayIndexOutOfBoundsException :");
//            System.out.println (e);
//        }


        //quick quiz
        int a[] = new int[2];
        a[0] = 2;
        a[1] = 45;
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println ("Enter the index:");
                int index = sc.nextInt();
                System.out.println (a[index]);
                break;
            }catch(Exception e){
                System.out.println ("Error");
            }
        }
    }
}