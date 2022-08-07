package basicJavaLoop5;
import java.util.Scanner;

public class Irk_22_Ch5_do_while {
    public static void main(String[] args) {

        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while(b<5);

        System.out.println("Conditions no check");
        int j = 20;
        do{
            System.out.println(j);
            j++;
        }while(j<10);

        System.out.println("Enter the natural number");
        int num = 100;
        System.out.println("Enter the natural number ="+num);
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=100);
    }
}
