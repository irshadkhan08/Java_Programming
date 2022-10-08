package basicMethodJava7;

public class Irk_33_varargs {

//    static int sum(int a,int b)
//    {
//        return a+b;
//    }
//    static int sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d)
//    {
//        return a+b+c+d;
//    }

//    static int sum(int ...arr)
//    {
//      //  int arr[]
////        int res = x;
//        int res = 0;
//        for(int e: arr){
//           res+=e;
//        }
//        return res;
//    }
static int sum(int x,int ...arr)
{
    //  int arr[]

    int res = x;
    for(int e: arr){
        res+=e;
    }
    return res;
}
//    static int sum(int a,int...arr){
//        int res = a;
//        for(int e:arr)
//        {
//            res+=e;
//        }
//        return res;
//      //  System.out.println(res+" ");
//    }
    public static void main(String[] args) {

        System.out.println("Welcome to varargs tutorial");
//        System.out.println("The sum of 4 and 5 is: "+ sum());// return is 0
//        System.out.println("The sum of 4 and 5 is: "+ sum());
//        System.out.println("The sum of 4, 5 and 7 is: "+ sum(4,5,7));
//        System.out.println("The sum of 4, 5 and 7 , 8 is: "+ sum(4,5,7,8));


       // System.out.println("The sum of 4 and 5 is: "+ sum()); // error will be show on display because 1 parameter will be pass in sum method
        System.out.println("The sum of 4, 5 and 7 is: "+ sum(4,5,7));
        System.out.println("The sum of 4, 5 and 7 , 8 is: "+ sum(4,5,7,8));
        System.out.println("The sum of 3 , and 5,6 is :"+sum(3,5,6));
        // sum(3,5,6);//use of void return type
    }
}
