package abstractClassesInterfaces11;

 interface Bicycle{
    void applyBrake();
    void speedUp();
}
interface HornBicycle{
     void Horn();
}
class AvonCycle implements Bicycle,HornBicycle
{
    private int increment;

    void blowHorn(){
        System.out.println("Pe Pe Pe");
    }
    public void applyBrake(){
        System.out.println("Applying horn");
    }
   public void speedUp(){
       //this.increment = increment;
       System.out.println("High Speed");
    }

    public void Horn(){
        System.out.println("Your cycle horn is very nice voice");
    }
}
public class Irk_54_interfaces {
    public static void main(String[] args) {

//       // Bicycle b = new Bicycle(); will be error show
        Bicycle c = new AvonCycle();
        //  c.blowHorn();
        c.applyBrake();
       c.speedUp();
        // c.Horn();
    }
}

