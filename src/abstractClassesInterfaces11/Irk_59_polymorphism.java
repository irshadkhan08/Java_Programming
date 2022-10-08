package abstractClassesInterfaces11;

interface Camera2{
    void takeSnap();
    void recordVideo();
//    default void record4kVideo(){
//        //greet();
//        System.out.println("Recording in 4k");
//    }
//    private  void greet(){
//        System.out.println("Good morning sister");
//    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);

}
class MyCellPhone2{
    void callNumber(int phoneNumber)
    {
        System.out.println("calling..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi,Camera
{

    @Override
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    @Override
    public void  recordVideo(){
        System.out.println("Taking record");
    }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Irshad","sakir","Anil"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
//    public void record4kVideo(){
//        System.out.println("Taking snap recording in 4k");
//    }

}
public class Irk_59_polymorphism {
    public static void main(String[] args) {

        //Camera2  ref = new Camera2();

        MySmartPhone2 ref = new MySmartPhone2();
        ref.getNetworks();
        ref.recordVideo();;

    }
}
