package basicOOPs8;

class Employee1{
    int salary = 1233;
    String name;
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
   public  void setName(String name1)
   {
        name = name1;
    }
}

class Cellphone{
    void ringing(){
        System.out.println("Ringing....");
    }
    void singing(){
        System.out.println("Singing....");
    }
    void callFriend(){
        System.out.println("Calling sakir");
    }
}

class Square{
    int side = 6;

    int area(){
      return side*side;
    }
    int perimeter(){
       return 4*side;
    }
}

class Rectangle{
    int len;
    int breadth;

    int area(){
        return len*breadth;
    }

    int perimeter(){
        return (2*(len*breadth));
    }
}

class Tommy{
    void hit(){
        System.out.println("Hitting on the enemy");
    }
    void run(){
        System.out.println("Running on the enemy");
    }
   void fire(){
       System.out.println("Firing on the enemy");
   }
}

class Circle{
    int r = 3;
    float pi = 3.14f;

    float area(){
        return pi*r*r;
    }
    float perimeter(){
        return 2*pi*r;
    }

}
public class Irk_39_ch8ps {
    public static void main(String[] args) {

        // problem1
       /* Employee1 emp = new Employee1();
        System.out.println("Employee salary "+emp.getSalary());
        emp.setName("irshad khan");
        System.out.println("Employee name "+emp.getName());

        //problem2
        Cellphone samsung = new Cellphone();
        samsung.ringing();
        samsung.singing();
        samsung.callFriend();*/

        //problem3
//        Square s1 = new Square();
//        s1.side = 5;
//        System.out.println("Area of square "+s1.area());
//        s1.perimeter();
//        System.out.println("Perimeter of square "+s1.perimeter());

        //problem4
//        Rectangle rect = new Rectangle();
//        rect.len = 50;
//        rect.breadth = 40;
//        System.out.println("Area of rectangle = "+rect.area());
//        System.out.println("Perimeter of rectangle = "+rect.perimeter());

        //problem5
//        Tommy t = new Tommy();
//        t.hit();
//        t.run();
//        t.fire();

        //problem6
        Circle c1 = new Circle();

        System.out.println("area of circle = "+c1.area());
        System.out.println("Perimeter of circle = "+c1.perimeter());
    }
}
