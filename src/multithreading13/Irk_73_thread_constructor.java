package multithreading13;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        while(true){
           // System.out.println("I am a thread");
        }
    }
}
// 4 Thread(Runnable r, String name){ }

class Thread2 extends Thread implements Runnable{
    Thread2(int id,String name){
        super(name);//with super(name) --> display I am constructorIrshad and serial 0,1,2
        // without super(name) ---> display I am constructorThread-0 and serial 1,3,5
    }

    @Override
    public void run(){
        //System.out.println("i am irshad "+name); does not access  because id and name private
        System.out.println("I am constructor"+this.getName());
    }

}

public class Irk_73_thread_constructor {
    public static void main(String[] args) {

//        MyThr t = new MyThr("Irshad");
//        MyThr t1 = new MyThr("Monika");
//        t.start();
//        System.out.println("The id of the thread t is "+t.getId());
//        System.out.println("The name of the thread t is "+t.getName());
//        System.out.println("The id of the thread t1 is "+t1.getId());
//        System.out.println("The name of the thread t1 is "+t1.getName());


        // extend and implements both method
        Thread2 thr = new Thread2(12,"Irshad");
        Thread t1 = new Thread(thr);
        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        Thread2 thr1 = new Thread2(12,"Anil");
        Thread t2 = new Thread(thr);
        t2.start();
        System.out.println(t2.getId());
        System.out.println(t2.getName());
        Thread2 thr3 = new Thread2(12,"Monika");
        Thread t3 = new Thread(thr);
        t3.start();
        System.out.println(t3.getId());
        System.out.println(t3.getName());
    }
}
