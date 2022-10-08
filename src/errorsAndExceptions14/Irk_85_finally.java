package errorsAndExceptions14;

public class Irk_85_finally {
    public static int greet() {
        try {
            int a = 34;
            int b = 2;
            int c = a / b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println ("This is the end of the program");
           // return -1; will be return -1
        }
       return -1;
    }
    public static void main(String[] args) {
//        int k = greet();
//        System.out.println (k);
        int x = 8;
        int y = 9;

        while(true){
            try{
                System.out.println (x/y);
            }
            catch(Exception e){
                System.out.println (e);
                break;
            }
            finally{
                System.out.println ("This is a finally "+y);
            }
            --y;
        }

        try{
            System.out.println (5/3);
        }
        finally{
            System.out.println ("This finally block");
        }
    }
}
