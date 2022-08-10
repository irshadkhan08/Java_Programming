package basicInheritance10;

class Base{
    int x;

    void setX(int x){
        this.x = x;
    }
    int getX(){
        return x;
    }
}

class Derived extends Base{
    int y;

    void setY(int y){
        this.y = y;
    }

    int getY(){
        return y;
    }
}
public class Irk_45_inheritance {
    public static void main(String[] args) {

        // creating  an object of superclass or Base class
        Base b = new Base();
        b.setX(3);
        System.out.println(b.getX()+" ");

        //creating an object of subclass or Derived class
        Derived d = new Derived();
        d.setY(7);
        d.getY();
//        d.setX(67);
//        d.getX();
        System.out.println( d.getY()+" "+d.getX());
    }
}
