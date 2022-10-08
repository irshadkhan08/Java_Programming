package multithreading13;

class MyThread extends Thread{
    @Override
    public void run(){
        while(true) {
            System.out.println("My Thread is Running");
            System.out.println("I am happy");
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My Thread is Running");
            System.out.println("I am sad");
        }
    }
}
public class Irk_70_thread {
    public static void main(String[] args) {
        MyThread t1  = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
