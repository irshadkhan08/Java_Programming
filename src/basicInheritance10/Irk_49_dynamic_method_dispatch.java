package basicInheritance10;

//class Super{
class Phone{
    void meth1(){
        System.out.println("I am method1");
    }
    void meth2(){
        System.out.println("I am method2 of phone class");
    }
}
//class Sub extends Super{
    class SmartPhone extends Phone{
    void meth2(){
        System.out.println("I am method2 of smartphone class");
    }
    void meth3(){
        System.out.println("I am method3 of smartphone class");
    }
}
public class Irk_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Super obj1 = new Sub(); // This is allowed
        Phone obj1 = new SmartPhone(); // This is a allowed or phone class ka reference smartphone ke object ke ho hog
       // Smartphone obj1 = new Phone(); this is not allowed or smartphone reference doesn't equal object of phone class
        obj1.meth1();
        obj1.meth2();
       // obj1.meth3(); // It is not allowed because meth3() is not present in Phone class
    }
}
