package basicArrayJava6;

public class Irk_26_arrays {
    public static void main(String[] args) {
        /*classroom of 500 students - you have to story marks of these 500 students
        you have two options:
        1.Create 500 variables
        2. use Arrays ()
       */

        // There are three main ways to create an array in java

        // 1. Declaration and memory allocation
        // int[] marks = new int[5];

        // 2. Declaration and then memory allocation
        int [] marks;
        marks = new int[5];
        // Initialization
        marks[0] = 100;
        marks[1] = 80;
        marks[2] = 76;
        marks[3] = 87;
        marks[4] = 98;


        // 3. Declaration \,memory allocation and initialization together
        // marks[5] = 78; --> throws an error
        System.out.println(marks[4]);
    }
}
