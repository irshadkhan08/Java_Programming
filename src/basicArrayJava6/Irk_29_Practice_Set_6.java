package basicArrayJava6;
import java.util.Scanner;

public class Irk_29_Practice_Set_6 {
    public static void main(String[] args) {
        //practice1
        //float marks[] = new float[5];
//        float marks[] = {95.5f,89.5f,87.5f,97.0f,87.0f};
//        float sum = 0;
//        for(int i = 0; i<marks.length; i++)
//        {
//            sum = sum+marks[i];
//        }
        //for each loop
//        for(float element : marks)
//        {
//            sum = sum+element;
//        }
//       System.out.println("sum of 5 floats number = "+sum);

        //practice2

//        int marks[] = {56,45,67,98,78};
//     int num = 67;
//     boolean isInArray = false;
//     for(int element : marks){
//         if(element==num){
//             isInArray = true;
//             break;
//         }
//     }
//     if(isInArray){
//         System.out.println("the value is present in the array");
//     }
//     else{
//         System.out.println("The value is not present in the array");
//     }


        //practice3
//        float[] marks = {45.7f,67.8f, 63.4f, 99.2f,100.0f};
//       float sum = 0;
//        float a[] = new float[5];
//        Scanner sc = new Scanner(System.in);
//        for(int i =0; i<a.length; i++)
//        {
//            a[i] = sc.nextFloat();
//        }
//        for(float element : a){
//            sum = sum+element;
//        }
//       System.out.println("The value of average marks is "+sum/a.length);

       // practice4
//        int [][] mat1 = {{1,2,3},
//                          {4,5,6}};
//        int mat2[][] = {{7,8,9},
//                        {10,2,3}};
    //    int result[][] = new int[2][3]; --> first rule
//        int  result [][] = {{0,0,0},
//                            {0,0,0}}; --> second rule
//        for(int i = 0; i<mat1.length; i++) // row number of times
//        {
//            for(int j = 0; j<mat2[i].length; j++) // column number of times
//            {
//                    // result[][] = mat1[i][j]+mat2[i][j];
//                result [i][j] = mat1[i][j]+mat2[i][j];
//            }
//          //  System.out.println(" ");
//        }
//
//        for(int i = 0; i<mat1.length; i++) // row number of times
//        {
//            for(int j = 0; j<mat2[i].length; j++) // column number of times
//            {
//
//                //result [i][j] = mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println(" ");
//        }

        //practice5
//        int arr[] = {1,2,3,4,5};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i =0; i<n; i++){
//            //Swap a[i] and a[l-1-i]
//            // |4|  |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element : arr){
//            System.out.println(element);
//        }

        //practice6
//        int arr[] = {1,4,3,2,5,-3};
//        int max = 0;
//        for(int i = 0; i<arr.length; i++)
//        {
//            if(arr[i]>max)
//            {
//                max = arr[i];
//            }
//        }
//        System.out.println("The value of maximum is = "+max);


        //practice7
//        int arr[] = {1,4,3,2,5,-3,3};
//      //  int min = Integer.MIN_VALUE;
//        int min = -1;
//        for(int i = 0; i<arr.length; i++)
//        {
//            if(min>arr[i])
//            {
//                min = arr[i];
//            }
//        }
//        System.out.println("The value of minimum is = "+min);

        //practice8
        int [] arr = {1,2,3,4,5,6,9};
        boolean isSorted = true;
        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

    }
}
