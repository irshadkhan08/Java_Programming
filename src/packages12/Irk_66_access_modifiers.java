package packages12;

public class Irk_66_access_modifiers {
    public static void main(String[] args) {

        Main m = new Main();
        System.out.println("x = "+m.x);
        System.out.println("y = "+m.y);
        System.out.println("z = "+m.z);
       //System.out.println(m.a); // will be show error

    }
}

class Main{
    public int x = 3;
    protected int y = 34;
    int z = 34;
    private  int a = 38;
    void input(){
        System.out.println("a = "+a);
    }
}