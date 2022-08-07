package basicArrayJava6;

public class Irk_27_arrays {
    public static void main(String[] args) {

//        float []marks  = {98.5f, 45.5f, 79.5f,87.5f};
//        String []students = {"irshad", "monika","anil"};
//        System.out.println(students.length);
//        System.out.println(students[2]);

        int [] marks = {98,45,80,87,90};
        System.out.println(marks.length);

        //Displaying the Array (Native way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array (for loop)
        System.out.println("printing using for loop ");
        for(int i = 0; i<marks.length; i++)
        {
            System.out.println("marks["+i+"] = "+marks[i]);
        }

        System.out.println("printing using for loop in reverse order ");
        for(int j = marks.length-1; j>=0; --j)
        {
            System.out.println(marks[j]);
        }

        //quick quiz : Displaying the array (for-each loop)
        System.out.println("printing using for each loop..");
        for(int element: marks)
        {
            System.out.println(element);
        }
    }
}
