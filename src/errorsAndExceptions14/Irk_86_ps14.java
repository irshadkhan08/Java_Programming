package errorsAndExceptions14;

public class Irk_86_ps14 {
    public static void main(String[] args) {
        //problem 1
       // int a = 4 --> syntax error

//        int age = 78;
//        int year_born = 2000-78;
//        System.out.println (year_born);// Logical error
//        System.out.println (6/0); // this is a runtime error

        //problem 2
        try{
          int c = 333/4;
        }
        catch(IllegalArgumentException e){
            System.out.println ("HeHe");
        }
        catch (ArithmeticException e)
        {
            System.out.println ("Haha");
        }
    }
}
