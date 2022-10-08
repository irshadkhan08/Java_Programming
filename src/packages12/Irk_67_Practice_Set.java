package packages12;
import java.util.Scanner;

class Calculator{
    public void calculator(int a,int b){
        System.out.println("your result is :"+a+b);
    }
}
class ScCalculator{
    public void calculate(int a,int b){
        System.out.println("your result is :"+ Math.sin(a+b));
    }
}
class MyCalculator{
    public void calculate(int a,int b){
        System.out.println("your result is :"+Math.sin(a+b));
    }
}
public class Irk_67_Practice_Set {
    public static void main(String[] args) {
        System.out.println("I am main method");
       //ques --2
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println("display a message "+text);
    }
}
