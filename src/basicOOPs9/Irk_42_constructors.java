package basicOOPs9;

class Employee1{
    private int id = 23;
    private String name = "Neha";
    private int salary = 250000;

  public  Employee1(){
        id = 45;
        name = "irshad";
        salary = 150000;
    }
    public Employee1(int id1,String name1,int salary1){
      id = id1;
      name = name1;
      salary = salary1;
    }
    public Employee1(String name1,int salary1){
      id = 24;
      name = name1;
      //this.name = name1; //display monika
      //name = name; //print neha
        salary = salary1;
    }

//    void setId(int id1)
//    {this.id = id1;}
    int  getId()
    {return id;}
//    void setName(String name1)
//    {this.name = name1;}
    String getName()
    {return name;}
    int getSalary()
    {return salary;}
}
public class Irk_42_constructors {
    public static void main(String[] args) {

//        Employee1 e = new Employee1();
//        Employee1 e = new Employee1(12,"sakir",175000);
        Employee1 e = new Employee1("Monika",200000);
//        e.setId(12);
//        e.setName("irshad");
        System.out.println("Employee id is = "+e.getId());
        System.out.println("Employee name is = "+e.getName());
        System.out.println("Employee salary is = "+e.getSalary());
    }
}
