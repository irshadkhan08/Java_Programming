package basicInheritance10;

class Base1{
    public Base1(){
        System.out.println("This is base class constructor");
    }
    public Base1(int x){
        System.out.println("This is base class an overloaded constructor with value taken x is :"+x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(120);
        System.out.println("This is derived class constructor");
    }

    Derived1(int x, int y){
        super(20);
        System.out.println("This is derived class an overloaded constructor with value of y as: "+y);
    }
}

class Grandchild extends Derived1{
    Grandchild(){
        System.out.println("This is a Grandchild class constructor");
    }
    Grandchild(int x,int y,int z){
       super(20,30);
        System.out.println("This is Grandchild an overloaded constructor with value of z as :"+z);
    }
}
public class Irk_46_constructors_in_inheritance {
    public static void main(String[] args) {
        // Base1 b1 = new Base1();
//     Derived1 d = new Derived1();
//      Derived1 d = new Derived1(4,6);
     // Grandchild gc = new Grandchild();
        // Grandchild gc1 = new Grandchild(2,3,4); // call non parameter constructor call default super(); method
      Grandchild gc1 = new Grandchild(1,2,30);
    }
}
