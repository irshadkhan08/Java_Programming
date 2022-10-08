package errorsAndExceptions14;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am string method";
       // return super.toString()+"I am toString()";
    }
    @Override
    public  String getMessage(){
        return "I am get method";
       // return super.getMessage ()+" I am getMessage";
    }
}
public class Irk_83_exception_class {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            try {
                //throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());//This is an exception
                System.out.println (e.toString ());//java.lang.ArithmeticException: This is an exception
                //System.out.println (e);//display toString() method only
                e.printStackTrace();
                System.out.println ("Finished");
            }
            System.out.println ("yes,finished");
        }
    }
}
