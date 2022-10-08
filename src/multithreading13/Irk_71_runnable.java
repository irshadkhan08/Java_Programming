package multithreading13;

class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        int i = 0;
        ;
        while(i < 1000) {
            // while(true)
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements  Runnable{
    @Override

    public void run(){
        int i = 0;
        while(i < 1000) {
            // while(true)
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}
public class Irk_71_runnable {
    public static void main(String[] args) {
        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
