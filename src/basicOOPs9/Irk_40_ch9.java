package basicOOPs9;

class Employee{
   private int id;
    private String name;
   void setId(int id1){
//        id = id1;
       this.id = id1;
    }
    int getId(){
       return id;
    }
   void setName(String name1){
       //name = name1;
       this.name = name1;
   }

   String getName(){
       return name;
   }

}

class Circle{
    private int r = 5;
    private float pi = 3.14f;

    void setValue(int r1,float pi1){
        this.r = r1;
        this.pi = pi1;
    }
    float getArea(){
        return pi*r*r;
    }
    float getPerimeter(){
        return 2*pi*r;
    }
}
public class Irk_40_ch9 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        // Access modifiers, getters & setters
        //e1.id = 34;
       // e1.name  = "monika"; --> throws an error due to private access modifier
//        e1.setId(12);
//        System.out.println("Employee id = "+e1.getId());
//        e1.setName("Irshad Khan");
//        System.out.println("Employee name = "+e1.getName());

        Circle cr = new Circle();
        cr.setValue(3,3.14f);
        System.out.println("Area of circle "+cr.getArea());
        System.out.println("Area of perimeter "+cr.getPerimeter());

    }
}
