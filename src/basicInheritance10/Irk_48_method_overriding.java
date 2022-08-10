package basicInheritance10;

class A {
    int a;

    int getA() {
        return a;
    }

    public void meth2() {
        System.out.println("Method 2 class of A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("Method 2 class of B");
    }

    public void meth3(){
        System.out.println("Method 3 class of B");
    }
}
public class Irk_48_method_overriding {
    public static void main(String[] args) {

        A o1 = new A();
        o1.meth2(); // o1.meth2() output Method 2 class of A
        B o2 = new B();
        o2.meth2();// o2.meth2() output  Method 2 class of B
    }
}
