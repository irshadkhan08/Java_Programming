package basicOOPs9;

class Cylinder{
   private int radius;
   private int height;

//   public Cylinder(int radius, int height){
//       this.radius = radius;
//       this.height = height;
//   }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

   public double surfaceArea(){
        // surface area of cylinder = (2*pi*r*r+2*pi*r*h) = 2*pi*r(r+h)
//        return 2*3.14*radius*radius+2*3.14*radius*height;
       return 2*Math.PI*radius*radius+2*3.14*radius*height;
    }
    public double volume(){
       // return 3.142*radius*radius*height;
        return Math.PI*radius*radius*height;
        // Math.PI use for exact value
    }

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 12;
        this.breadth = 8;
    }

    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getLength()
    {
        return length;
    }
    int getBreadth(){
        return breadth;
    }
}

class Sphere{
    private int radius;
    void setRadius(int radius){
        this.radius = radius;
    }
    int getRadius(){
        return radius;
    }
    double areaOfSphere(){
        return 4*Math.PI*radius*radius;
    }
    double volumeOfSphere(){
        return 4*Math.PI*radius*radius*radius/3;
    }

    Sphere(int radius){
        this.radius = radius;
    }
}
public class Irk_44_ps09 {
    public static void main(String[] args) {
       //problem1
/*      Cylinder cl = new Cylinder(3,6);
//        cl.setRadius(9);
//        cl.setHeight(12);
        System.out.println("Radius of Cylinder = "+cl.getRadius());
        System.out.println("Height of Cylinder = "+cl.getHeight());8

        //problem2
        System.out.println("surface area of cylinder = "+cl.surfaceArea());
        System.out.println("volume of cylinder = "+cl.volume());*/

        //problem3
//        Cylinder cl = new Cylinder(3,6);
//
//        System.out.println("Radius of Cylinder = "+cl.getRadius());
//        System.out.println("Height of Cylinder = "+cl.getHeight());

        //problem4
//        Rectangle rec = new Rectangle(16,12);
//        System.out.println("Length of rectangle = "+rec.getLength());
//        System.out.println("breadth of rectangle = "+rec.getBreadth());

        //problem5
        Sphere sp = new Sphere(5);
//        sp.setRadius(4);
        System.out.println("radius of Sphere = "+sp.getRadius());
        System.out.println("surface area of sphere = "+sp.areaOfSphere());
        System.out.println("volume of sphere = "+sp.volumeOfSphere());

    }
}
