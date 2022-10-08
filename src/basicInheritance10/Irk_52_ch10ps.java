package basicInheritance10;

class Circle{
   public int radius;
   Circle(){
       System.out.println("I am non parameter of circle ");
   }
    Circle(int r){
       this.radius = r;
   }
    public double area(){
       return Math.PI*radius*radius;
   }
}
class Cylinder extends Circle{
   public int height;
   Cylinder(int r,int h){
       super(r);
       System.out.println("I am cylinder parameterized constructor");
       this.height = h;
   }
   public double volume()
   {
       return Math.PI*radius*radius*height;
   }
}

class Rectangle{
    public int length;
    public int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area()
    {
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    public int height;
   Cuboid(int length,int breadth,int height)
   {
       super(length,breadth);
       this.height = height;
   }
   double volume(){
       return area()*height;
   }
}

class Rectangle1{
    private float length,breadth;
    public void setLength(int l)
    {
        this.length = l;
    }
    public float getLength(){
        return length;
    }
    public void setBreadth(int b){
        this.breadth = b;
    }
    public float getBreadth(){
        return breadth;
    }
    public float area(){
        return length*breadth;
    }
}
class Cuboid1 extends Rectangle1{
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float volume(){
        return height*area();
    }
}
public class Irk_52_ch10ps {
    public static void main(String[] args) {

//        //problem1
     //  Circle c = new Circle(2);
      //  Cylinder cl = new Cylinder(4,5);
//        //problem3
//        System.out.println("Area of circle = "+cl.area());
//        System.out.println("Volume of Cylinder = "+cl.volume());

        //problem2
//        Cuboid cb = new Cuboid(3,4,5);
//        System.out.println("Area of rectangle = "+cb.area());
//        System.out.println("Volume of cuboid = "+cb.volume());

        //problem4 use of getters and setters method
        Cuboid1 cb1 = new Cuboid1();
        cb1.setLength(6);
        System.out.println("value of length = "+cb1.getLength());
        cb1.setBreadth(4);
        System.out.println("value of breadth = "+cb1.getBreadth());
        System.out.println("area of rectangle = "+cb1.area());
        cb1.setHeight(8);
        System.out.println("value of height = "+cb1.getHeight());
        System.out.println("volume of cuboid = "+cb1.volume());
    }
}
