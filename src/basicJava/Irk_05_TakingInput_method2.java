package basicJava;
import java.io.*;

public class Irk_05_TakingInput_method2 {

           public static void main(String[] args)throws IOException {
                 int a,b,sum;
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                 InputStreamReader ir = new InputStreamReader(System.in);
                 BufferedReader br = new BufferedReader(ir);

                 System.out.println("Enter first number1 ");
                 a = Integer.parseInt(br.readLine());
                 System.out.println("Enter second number2 ");
                 b = Integer.parseInt(br.readLine());
                 sum = a+b;
                 System.out.println("sum of two number = "+sum);

}
    }
