package basicMethodJava7;

public class Irk_35_practice_methods7 {
//    static void multiplication(int n) {
//        System.out.println("The table print of 7 ");
//        for (int i = 1; i<=10; i++ ){
//            System.out.format("%d X %d = %d\n",n,i,n*i);
//}
//}

//    static void pattern(int n){
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<i+1; j++)
//            {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }

    //sum(n) = 1+2+3...+n
    //sum(n) = 1+2+3...+n-1+n
    //sum(n) = sum(n-1)+n
    //sum(3) = 3+sum(2)
    //sum(3) = 3+2+sum(1)
    //sum(3) = 3+2+1
//    static int sumRec(int n){
//        if(n==1){
//            return 1;
//        }
//        else{
//            return n + sumRec(n-1);
//        }
//    }

//    static void pattern1(int n)
//    {
//        for(int i = n; i>0; i--){
//            for(int j = i; j>0; j--)
//            {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }

  ///  static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
//        if(n==1 || n==2){
//            return n-1;
//        }
//        else{
//            return fib(n-1)+fib(n-2);
//        }
//    }

//        static int avg(int ...arr){
//            int res = 0;
//            int average = 0;
//           for(int e : arr){
//               res+=e;
//               average++;
//           }
//           return res/average;
//        }

//    static void pattern2_rec(int n)
//    {
//      if(n>0)
//      {
//          pattern2_rec(n-1);
//          for(int i = n; i>0; --i)
//          {
////            pattern2_rec(n-1);
//              System.out.print("*"+" ");
//          }
//
//          System.out.println();
//      }
//    }

//    static void pattern1_rec(int n){
//      if(n>0)
//      {
//          pattern1_rec(n-1);
//          for(int i =0; i<n; i++){
//              System.out.print("*"+" ");
//          }
//          System.out.println();
//      }
//    }

    //pattern1_rec(3)
    //pattern1_rec(2)+3 times star and new line
    //pattern1_rec(1)+2 times star and new line + 3 times star and new line
    //pattern1_rec(0)+1 times star and new line + 2 times star and new

//    static void convert_c_to_f(int n)
//    {
//        int ces = 0;
//        float f = 32+9/5*ces;
//        System.out.println(f+"f");
//    }

    static void iterative_method(int n)
    {
        int sum = 0;
        for(int i =1; i<=n; i++)
        {
            sum+=i;
        }
        System.out.println("sum of natural number iterative method = "+sum);
    }


    public static void main(String[] args) {
        //problem1
      //multiplication(7);

        //problem2
//        pattern(4);

        //problem3
//       int ans =  sumRec(3);
//        System.out.println("first n natural of sum is "+ans);

        //problem4
//        pattern1(4);

        //problem5
        // fibonacci series - 0,1,1,2,3,5,8,13,21,34
//       int ans =  fib(7);
//       System.out.println("ans = "+ans);

        //problem6
//            System.out.println("The sum of average number using varargs "+avg(2,3,4));
        //problem7
       // pattern2_rec(5);

        //problem8
        //pattern1_rec(9);

        //problem9
     //   convert_c_to_f(0);

        //problem10
        iterative_method(10);
    }
}
