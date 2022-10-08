package multithreading13;

class Threads extends Thread{

    public void run(){
        int i  = 1;
        while(i<=20) {
            System.out.println("I am irshad");
            try {
                Thread.sleep(19);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class Threads1 extends Thread{
    public void run(){

        int i = 1;
        while(i<=23) {
            System.out.println("My best friend Akram");
            i++;
        }
    }
}

public class Irk_75_thread_methods {
    public static void main(String[] args) throws InterruptedException {
       Threads t1 = new Threads();
       Threads1 t2 = new Threads1();
       t1.start();
//       try{
//           t1.join();
//       }
//       catch(Exception e){
//           System.out.println(e);
//        }
       t2.start();
    }
}


