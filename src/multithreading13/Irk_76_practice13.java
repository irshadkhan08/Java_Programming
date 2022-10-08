package multithreading13;

class Practice13 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Practices13 extends Thread{
    public void run(){
        int i = 1;
        while(i<=400) {
            System.out.println("Welcome");
            i++;
        }
    }
}
class PracticeA extends Thread {

    public void run() {
        System.out.println("Good Morning");
    }
}
class PracticesB extends Thread{

    public void run(){
//        while(true){
//        System.out.println("Welcome");
//    }

    }
}
public class Irk_76_practice13 {
    public static void main(String[] args) {

        //ques 1 & 2
//        Practice13 p1 = new Practice13();
//        Practices13 p2 =  new Practices13();
//        p1.start();
//       // p2.start();
//       p2.run();

       //ques3
        PracticeA a = new PracticeA();
        PracticesB b =  new PracticesB();
//        a.setPriority(6);
//        b.setPriority(8);
//        System.out.println(a.getPriority()); // normal priority = 5
//        System.out.println(b.getPriority()); //normal priority = 5
//        a.start();
//        b.start();

        // ques4
        System.out.println(b.getState()); // NEW
        b.start(); // runnable print after start()
        System.out.println(b.getState()); // RUNNABLE

        //ques5
        // current state
        System.out.println(Thread.currentThread().getState()); //RUNNABLE
    }
}
