package conditionalsJava4;

public class Irk_17_Logical {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        System.out.println("For Logical And...");
        if(a && b) {
            System.out.println("y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical OR...");
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For logical Not");
        if(a!=b){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
    }
}
