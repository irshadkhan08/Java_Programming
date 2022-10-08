package basicMethodJava7;

public class Irk_32_method_overloading {
//    static void tellJoke()
//    {
//        System.out.println("I am irshad khan");
//    }

    static int change(int a){
        a = 86;//does not change value of a print 45
        return  a;
    }

    static void change2(int [] arr){
        arr[0] = 98;//array a[0] value can be change print 98
    }
    static void foo(){
        System.out.println("I am good boy");
    }

    static void foo(int a )
    {
        System.out.println("a ="+a);
    }

    static void foo(int a,int b)
    {
        System.out.println(a+"+"+b+" = "+a+b);//4050
        System.out.println(a+"+"+b+" = "+(a+b));//90
    }

    public static void main(String[] args) {
      //  tellJoke();

      // int [] marks = {55,76,87,68,98};
//        int x = 45;
//       int ans =  change(x);
//        System.out.println("The value of x after running change is = "+ x);

//        int [] marks = {55,76,87,68,98};
//        change2(marks);
//        System.out.println("The value of running change is :"+ marks[0]);

        //Method overloading
        foo();
        foo(300);
        foo(40,50);
        //arguments  are actual!

    }
}
