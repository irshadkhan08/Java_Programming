package basicJava;
import java.io.*;
public class Irk_06_Cal_Percentage {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float phy,math,chem,eng,hindi;
        System.out.println("Enter five subject :");
//        phy = Integer.parseInt(br.readLine());
        phy = Float.parseFloat(br.readLine());
        System.out.println("Physics Marks = "+phy);
        math = Float.parseFloat(br.readLine());
        System.out.println("Math Marks = "+math);
        chem = Float.parseFloat(br.readLine());
        System.out.println("Chemistry Marks = "+chem);
        eng = Float.parseFloat(br.readLine());
        System.out.println("English Marks = "+eng);
        hindi = Float.parseFloat(br.readLine());
        System.out.println("Hindi Marks = "+hindi);

        float total = ((phy+math+chem+eng+hindi)/5.0f);
        System.out.println("Total percentage = "+total);

    }
}
