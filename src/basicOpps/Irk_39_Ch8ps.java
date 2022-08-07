package basicOpps;

class Employee{
    int salary;
    String name;

   int getSalary(){
        return salary;
    }
    String getName(){
       return name;
    }

    void setName(String n)
    {
        name = n;
    }
}

class Cellphone {
   void ringing(){
       System.out.println("tone is ringing in phone");
   }
   void vibrating(){
       System.out.println("tone is vibrating in phone");
   }
   void calling(){
       System.out.println("calling home...");
   }
}

class Square{
    int side =6;
    int area(){
        return (side*side);
    }
    int perimeter()
    {
        return (4*side);
    }
}

class Rectangle{
    int l,b;

    void setData(int length,int width){
        l = length;
        b = width;
    }
    int area()
    {
        return (l*b);
    }

    int perimeter(){
        return (2*(l*b));
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{
    float r =3;
    float pi = 3.14f,ans;

    float area(){
        ans = pi*r*r;
        return ans;
    }
    float perimeter(){
        return 2*pi*r;
    }
}
public class Irk_39_Ch8ps {
    public static void main(String[] args) {

        // problem1
       /* Employee e1 = new Employee();
        e1.name = "irshad";
        e1.salary = 1200;
        e1.getSalary();
        e1.getName();
        e1.setName("sakir");
        System.out.println("name = "+e1.getName());
        System.out.println("salary = "+ e1.getSalary());

        // problem2
        Cellphone cp1 = new Cellphone();
        cp1.ringing();
        cp1.vibrating();
        cp1.calling();
        */

        //problem3
//        Square sq = new Square();
//        sq.side = 5;
//        sq.area();
//        sq.perimeter();
//        System.out.println("Area of square = "+sq.area());
//        System.out.println("Area of perimeter = "+sq.perimeter());

        //problem4
//        Rectangle rec = new Rectangle();
//        rec.setData(10,20);
//        System.out.println("Area of Rectangle = "+rec.area());
//        System.out.println("Area of Rectangle = "+rec.perimeter());

        //problem5
//        Tommy player=  new Tommy();
//        player.hit();
//        player.run();
//        player.fire();

        //problem6
        Circle c1 = new Circle();
        System.out.println("Area of circle = "+c1.area());
        System.out.println("Area of perimeter = "+c1.perimeter());


 }
}
