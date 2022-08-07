package basicJava;
import java.io.*;
public class Irk_06_Cal_Percentage {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int phy,math,chem,eng,hindi;
        System.out.println("Enter five subject :");
        phy = Integer.parseInt(br.readLine());
        System.out.println("Physics Marks = "+phy);
        math = Integer.parseInt(br.readLine());
        System.out.println("Math Marks = "+math);
        chem = Integer.parseInt(br.readLine());
        System.out.println("Chemistry Marks = "+chem);
        eng = Integer.parseInt(br.readLine());
        System.out.println("English Marks = "+eng);
        hindi = Integer.parseInt(br.readLine());
        System.out.println("Hindi Marks = "+hindi);

        int total = ((phy+math+chem+eng+hindi)/5);
        System.out.println("Total percentage = "+total);

    }
}
