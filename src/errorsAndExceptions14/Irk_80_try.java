package errorsAndExceptions14;

public class Irk_80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        /* Without Try: */
//        int c = a/b;
//        System.out.println(+c);

        // With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch (Exception e){  // Exception is class and e is an object
            System.out.println("we failed to divide. Reason:");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
