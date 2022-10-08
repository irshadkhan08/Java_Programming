package errorsAndExceptions14;
import java.io.*;

import java.util.Scanner;

public class Irk_81_Handling_Specific_Exception {
    public static <ArrayIndexOutOFBoundsExcept> void main(String[] args) {
  // public static void main(String args[])throws IOException{
        int marks[] = new int[2];
        marks[0] = 3;
        marks[1] = 4;
      //  marks[4] = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int index = sc.nextInt();

        System.out.println("Enter the you want to divide with");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is:"+marks[index]);//ArrayIndexBoundsOfException occur
            System.out.println("The value of array = value/number "+marks[index]/number); // Arithmetic Exception occur
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occur :");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexBoundsOfException occur :");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occur :");
            System.out.println(e);
        }
    }
}
