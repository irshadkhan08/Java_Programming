package basicJava;
import java.io.*;
import java.util.Scanner;

public class Irk_Ch1_Ps {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //   problem--1
//        int a,b,c,sum;
//        a = Integer.parseInt(br.readLine());
//        b = Integer.parseInt(br.readLine());
//        c = Integer.parseInt(br.readLine());
//        sum = a+b+c;
//        System.out.println("sum of value = "+sum);

        // problem --2
//        float marks1 = Float.parseFloat(br.readLine());
//        float marks2 = Float.parseFloat(br.readLine());
//        float marks3 = Float.parseFloat(br.readLine());
//        float cgpa = ((marks1+marks2+marks3)/30);
//        System.out.println("cgpa = "+cgpa);

        //problem--3
//        String name = br.readLine();
//        System.out.println("Hello "+name+" have a good day ");

        //problem --4
        // Mile to Km 1mile = 1.609km
        // KM to mile  1KM = 1Mile/1.609

//        float mile = 1.609f;
//        float km = Float.parseFloat(br.readLine());
//        Float Miles = (mile*km);
//        System.out.println("Kilometers to miles = "+Miles+"km");

//        float km = 1/1.609f;
//        float mile = Float.parseFloat(br.readLine());
//        float KM = km*mile;
//        System.out.println("Miles to Kilometers = "+KM+"miles");

        // problem --5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        boolean a = sc.hasNextFloat();
        System.out.println("float or not"+"\nvalue is "+a);


    }
}
