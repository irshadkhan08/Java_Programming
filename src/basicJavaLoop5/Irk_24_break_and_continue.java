package basicJavaLoop5;

public class Irk_24_break_and_continue {
    public static void main(String[] args) {
        // break and continue using loops
//        for(int i = 0; i<5; i++) {
//            System.out.println(i);
//            System.out.println("java is great ");
//            if(i==2)
//            {
//                System.out.println("Ending the loop");
//                break;
//            }
//        }

//       int i = 0;
//       do
//       {
//           if(i==2)
//           {
//               System.out.println("Ending the loop!!");
//               break;
//           }
//           System.out.println(i);
//           System.out.println("java is great");
//           i++;
//       }while(i<=5);

//        for(int i = 0; i<=5; i++){
//            if(i==2){
//                System.out.println("loop is skip iterate 2");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//        }
//        System.out.println("loop ends here");

        int i = 0;
        do{
            i++;

            if(i==3){
                System.out.println("3 value is skip");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great!!");
        }while(i<=5);
    }
}
