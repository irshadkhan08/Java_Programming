package basicInheritance10;
//class Ekclass{
//    int a = 3;
//    public int getA()
//    {
//        return a;
//    }
//    Ekclass(int a)
//    {
//        a = a;//output a = 3 without this .this is reference current
//        this.a = a; // this keyword use print is a = 4
//    }
//}

// super keyword work to start in inheritance
class Ekclass{
    int a = 3;
    public int getA()
    {
        return a;
    }
    Ekclass(int a)
    {
        a = a;//output a = 3 without this .this is reference current
        this.a = a; // this keyword use print is a = 4
    }
}

class Doclass extends Ekclass{

    int c;
    int getC(){
        return c;
    }
    Doclass(int c){
        super(4);// parameter constructor use super() and default constructor no use super()
        System.out.println("I am a constructor "+a);
        System.out.println("I am a constructor "+c);
    }
}
public class Irk_47_this_super {
    public static void main(String[] args) {
      //this keyword
//            Ekclass e = new Ekclass(4);
//            System.out.println("The value of a = "+e.getA());
        // super keyword
        Ekclass e = new Ekclass(56);
        System.out.println("value of a = "+e.getA());
        Doclass d = new Doclass(34);

    }
}
