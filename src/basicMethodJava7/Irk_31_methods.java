package basicMethodJava7;

public class Irk_31_methods {
    static  int logic(int x, int y){
        int z;
        if(x>y){
            z = x*y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }

    static int sum(int x,int y){
        int ans;
        ans = x+y;
        return ans;
    }
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;
        int c;
        //Method invocation using object creation
      //  Irk_31_methods  obj = new Irk_31_methods();
        //c = obj.logic(a,b);
        c = logic(a,b);
        System.out.println("The value of c = "+c);
        int a1 = 5;
        int b1 = 6;
        //int c1 = obj.logic(a1,b1);
        int c1 = logic(a1,b1);
        System.out.println("The value of c1 = "+c1);
        int d2 = 23;
        int d1 = 34;
        int ans = sum(d2,d1);
        System.out.println("sum of two number "+ans);
    }
}
