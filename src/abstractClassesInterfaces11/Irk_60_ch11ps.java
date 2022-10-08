package abstractClassesInterfaces11;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Fountain extends Pen{
    @Override
     void write(){
        System.out.println("Write");
    }
    @Override
     void refill(){
        System.out.println("refill");
    }
   public void changeNib(){
        System.out.println("Changing the nib");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello anil");
    }
    @Override
   public void eat(){
       System.out.println("eating");
    }
    @Override
   public void sleep(){
       System.out.println("sleeping");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    @Override
    public void ring(){
        System.out.println("ringing...");
    }
    @Override
    public void lift()
    {
        System.out.println("lifting...");
    }
   @Override
   public void disconnect(){
        System.out.println("disconnecting...");
   }
    public void display(){
        System.out.println("displaying...");
    }
}

interface TvRemote{
    void channel();
    void remote();
}
interface smartTvRemote extends TvRemote{
    void voiceAssist();
    void android();
}
class Tv implements smartTvRemote{
    @Override
    public void channel() {
        System.out.println("crate the channel");
    }
    @Override
    public void remote() {
        System.out.println("remote..");
    }
    @Override
    public void voiceAssist() {
        System.out.println("Using voice command to change the channel");
    }

    @Override
    public void android() {
        System.out.println("We can use Jio tv ");
    }
}

public class Irk_60_ch11ps {
    public static void main(String[] args) {
        //ques-1 and ques-2
//       Fountain pen = new Fountain();
//       // Fountain pen = new Pen();
//        pen.write();
//        pen.refill();
//        pen.changeNib();

        // ques-3
//        Human irshad = new Human();
//        irshad.eat();
//        irshad.sleep();

        // ques-5
//        Monkey m1 = new Human();
//        m1.bite();
//        m1.jump();
       // m1.speak(); //  -->  Cannot use speak method the interface is monkey which does not have speak method

//       BasicAnimal akash = new Human();
//      // akash.speak(); -->error
//       akash.sleep();
//       akash.eat();

       // ques-4
       Telephone nokia = new SmartTelephone();
       nokia.lift();
       nokia.ring();
       nokia.disconnect();
       // nokia.display(); // --> this is error

//       SmartTelephone apple = new SmartTelephone();
//       apple.ring();
//       apple.display();

        //ques-6+7

         smartTvRemote tv = new Tv();
       // Tv tv = new Tv();
        tv.android();
        tv.channel();
        tv.remote();
        tv.voiceAssist();


    }
}
