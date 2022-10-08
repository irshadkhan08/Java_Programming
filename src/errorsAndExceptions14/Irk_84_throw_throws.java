package errorsAndExceptions14;
class NegativeRadiusException extends Exception{

//    @Override
//   public String toString(){
//        return "Radius cannot be negative";
//    }
//    @Override
//    public String getMessage(){
//        return "Radius cannot be negative";
//    }
}
public class Irk_84_throw_throws {

  //  public static int divide(int a, int b) throws ArithmeticException {
//        // by made by akram
//        int result = a / b;
//        return result;
//    }
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException ();
        }
        double res = Math.PI * r * r;
        return res;
    }

//        public static double area(int r){
//        double res = Math.PI*r*r;
//        return res;
//    }


    public static void main(String[] args) {
       // created by irshad
//        int c = divide(3,0);
//        System.out.println (+c);

        try {
//            int c = divide(4,0);
//            System.out.println (c);
            double ar = area (-5);
            System.out.println (+ar);
        } catch (Exception e) {
            //System.out.println ("Exception");

        }
    }
}
