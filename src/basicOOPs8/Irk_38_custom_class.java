package basicOOPs8;
 class Employee{
    int id = 10;
    int salary = 34000 ;
    String name = "sakir";

    void printDetails(){
        System.out.println("your id is "+id);
        System.out.println("your name is "+name);
    }

    int getSalary(){
        return salary;
    }
}
public class Irk_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is custom class");

        Employee irshad = new Employee();  // Instantiating a new Employee object
        Employee monika = new Employee();

        //setting attributes for irshad
        irshad.id = 20;
        irshad.name ="irshad";
        irshad.salary = 4500;


        // setting attributes for monika
        monika.id = 12;
        monika.name = "monika";
        monika.salary = 150000;

        //printing the attributes
        irshad.printDetails();
        int salary1 = irshad.getSalary();
        System.out.println("Irshad salary is :"+salary1);

        monika.printDetails();
        int salary = monika.getSalary();
        System.out.println("monika salary is :"+salary);
    }
}


