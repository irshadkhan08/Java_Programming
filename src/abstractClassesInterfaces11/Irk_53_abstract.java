package abstractClassesInterfaces11;

abstract class Parent {
    public Parent()
    {
        System.out.println("I am constructor of base class");
    }
    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class  Child extends Parent{
    @Override
    public  void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet1(){
        System.out.println("good after noon");
    }
}
 abstract class Child1 extends Parent{

      void  who(){
         System.out.println("I am method of child abstract class");
     }
}
public class Irk_53_abstract {
    public static void main(String[] args) {
        /* Parent a = new Parent(); //will be show error */
        Parent b = new Child();
        b.greet();
        b.greet1();
      //  Child1 c = new Child1(); // will be show error

    }
}
