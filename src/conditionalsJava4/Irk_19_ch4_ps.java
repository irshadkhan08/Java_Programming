package conditionalsJava4;
import java.util.Scanner;

public class Irk_19_ch4_ps {
    public static void main(String[] args) {
        //practice1
        // error ques1 why because a doesn't assign in if statement
//        int a = 10;
//        if(a=11)
//        {
//
//        }

        //practice2

//        byte m1,m2,m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in chemistry");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in math ");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is: "+avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
//        {
//            System.out.println("Congratulations, you have been promoted");
//        }
//        else{
//            System.out.println("Sorry, you have not been promoted ");
//        }

        // practice3

        Scanner sc = new Scanner(System.in);
        System.out.println("Income Tax program :");
        int income = sc.nextInt();
        System.out.println("Enter the income = "+income);
        float tax = 0;
        if(income>0 && income<=250000)
        {
            tax = 0;
        }
        else if(income>250000 && income<=500000)
        {
            tax = 0;
            tax = tax+((income-250000)*5/100);
        }
        else if(income>500000 && income<=1000000)
        {
           tax = 0;
           tax = tax+(500000-250000)*5/100;
           tax = tax+(income-500000)*20/100;
        }
        else {
           if(income>1000000)
           {
               tax = tax+0;
               tax = tax+(500000-250000)*5/100;
               tax = tax+(1000000-500000)*20/100;
               tax = tax+(income-1000000)*30/100;
           }
        }
        System.out.println("Total income tax = "+tax);
        
        //ques4
       // Scanner sc = new Scanner(System.in);
       // int day = sc.nextInt();
//        switch(day){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("saturday");
//            case 7-> System.out.println("sunday");
//       }
        //using in hence switch case
//        switch(day){
//            case 1 ->{
//                System.out.println("monday");
//                System.out.println("Tuesday");
//                System.out.println("Friday");
//            }
//            default -> System.out.println("Weekend day enjoy with my friends");
//        }

        //ques5
//        int year = 2021;
//        if(year%400==0)
//        {
//            if(year%100==0)
//            {
//                if(year%4==0)
//                {
//                    System.out.println("Leap year is "+year);
//                }
//                else
//                {
//                    System.out.println(year+" is not leap year");
//                }
//            }
//            else
//            {
//                System.out.println("Leap year is "+year);
//            }
//        }
//        else{
//            System.out.println(year+" is not leap year");
//        }

//        int year = 2019;
//        boolean isLeap =  false;
//        if(year%4!=0)
//        {
//            isLeap = false;
//        }
//        else if(year%100==0)
//        {
//            isLeap = false;
//        }
//        else if(year%400==0)
//        {
//            isLeap = true;
//        }
//        else
//        {
//            isLeap = true;
//        }
//        if(isLeap)
//        {
//            System.out.println("Leap year is "+year);
//        }
//        else {
//            System.out.println("Does not leap year is "+year);
//        }
//
        //ques6
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org"))
//        {
//            System.out.println("This is organization website ");
//        }
//        else if(website.endsWith(".com"))
//        {
//            System.out.println("This is commercial website");
//        }
//        else if(website.endsWith(".in"))
//        {
//            System.out.println("This is indian website");
//        }
    }
}
