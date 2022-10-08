package basicMethodJava7;

public class Irk_31_methods {
     static int logic(int x, int y){
        int z;
        if(x>y){
            z = x*y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }

    static int sum(int d2,int d1){
        int ans;
        ans = d2+d1;
        return ans;
    }
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        //Method invocation using object creation
//        Irk_31_methods  obj = new Irk_31_methods();
//        int ans =   obj.logic(a,b);//using object basically object use without static call function
//       System.out.println("The value of ans "+ans);
        int c = logic(a,b);
        System.out.println("The value of c is :"+c);
        int a1 = 5;
        int b1 = 6;
//        //int c1 = obj.logic(a1,b1);
        int c1 = logic(a1,b1);//using object basically object use without static call function
        System.out.println("The value of c1 is = "+c1);
        int d2 = 23;
        int d1 = 34;
        int ans = sum(d2,d1);
        System.out.println("sum of two number :"+ans);
    }
}
