package basicArrayJava6;

public class Irk_28_multi_dim_arrays {
    public static void main(String[] args) {

        int [] marks; //A 1-D Array
        int [][] flats;
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;

        //Displaying the 2-D Array using (for loop)
        System.out.println("printing a 2-D arrays using for loop");
        for(int i = 0; i<=flats.length; i++)
        {
            for(int j = 0; j<=flats.length; j++)
            {
                System.out.print(flats[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
