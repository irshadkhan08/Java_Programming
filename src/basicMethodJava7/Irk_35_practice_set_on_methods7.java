package basicMethodJava7;

public class Irk_35_practice_set_on_methods7 {
    static void multiply(int n,int t){
        System.out.println("The table print of 8");
        for(int i = 1; i<=10; i++)
        {
//            System.out.println(t+"*"+i+" = "+(t*i));
            System.out.format("%d X %d = %d\ngf",t,i,t*i);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int t = 8;
        multiply(n,t);
    }
}
