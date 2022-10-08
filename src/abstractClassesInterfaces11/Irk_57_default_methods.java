package abstractClassesInterfaces11;

interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        //greet();
        System.out.println("Recording in 4k");
    }
    private  void greet(){
        System.out.println("Good morning sister");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);

}
class MyCellPhone{
    void callNumber(int phoneNumber)
    {
        System.out.println("calling..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi,Camera
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
    public void record4kVideo(){
        System.out.println("Taking snap recording in 4k");
    }

}
public class Irk_57_default_methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
       // ms.greet(); --> Throws an error!

        String[] arr = ms.getNetworks();
        for(String  item : arr){
            System.out.println(item+" ");
        }
    }
}
