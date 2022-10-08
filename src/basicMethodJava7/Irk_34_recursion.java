package basicMethodJava7;

public class Irk_34_recursion {

    //factorial(0) = 1
    //factorial(n) = n*n-1 *...1
    // factorial(5) = 5*4*3*2*1 = 120
    // factorial(n) = n*factorial(n-1)

    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
//        else{
//            return n*factorial(n-1);
//        }
        else{
            int factorial = 1;
            for(int i = 1; i<=n; i++)
            {
                factorial*=i;
            }
            return factorial;
        }
    }
    public static void main(String[] args) {
        int ans = factorial(4);
        System.out.println("factorial of 4 is :"+ans);
        System.out.println("factorial of 5 is :"+factorial(5));
    }
}
