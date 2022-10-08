package basicJavaString3;

import java.util.Locale;

public class Irk_14_String_methods {
    public static void main(String[] args) {
        String  name = "irshad";
        System.out.println(name);
       // System.out.println(name.length());//length of name is 6
        // System.out.println(name.toLowerCase());
       //  System.out.println(name.toUpperCase());
        // name = "     irshad    "; space return from a trim method
        // System.out.println(name.trim());//irshad
        //System.out.println(name.substring(4));//ad
      // System.out.println(name.substring(2,4));//sh
       //System.out.println(name.replace('i','I'));//Irshad
     //   System.out.println(name.startsWith("ir"));//true
     //  System.out.println(name.endsWith("ad"));//true
      // System.out.println(name.charAt(2));//s
      // System.out.println(name.indexOf("s"));//2
       // System.out.println(name.indexOf("d",4));//5
      // System.out.println(name.lastIndexOf("s"));//2
       // System.out.println(name.lastIndexOf("d",3));// -1
      //  System.out.println(name.lastIndexOf("s",3));//1
      //  System.out.println(name.equals("irshad"));
       // System.out.println(name.equalsIgnoreCase("Irshad"));//ture

      // String name = "irshad";
//       int value = name.length();
//        System.out.println("value = "+value);
//
//        String lstring = name.toLowerCase();
//        System.out.println("lstring = "+lstring);
//
//        String ustring = name.toUpperCase();
//        System.out.println("ustring = "+ustring);

//        String nonTrimmedString = "    irshad      ";
//        System.out.println("nonTrimmedString is no use = "+nonTrimmedString);
//        System.out.println("TrimmedString trim method string is use = "+nonTrimmedString.trim());

       // System.out.println(name.substring(1));//rshad
        //System.out.println(name.substring(0,6));//irshad

//        System.out.println(name.replace('i','I'));//Irshad
    //  System.out.println(name.replace("irshad","IRSHAD Khan"));//IRSHAD Khan

       // System.out.println(name.startsWith("irs"));//true
     //   System.out.println(name.endsWith("khan"));//false

        //System.out.println(name.charAt(3));//h
//        String name1 = "monika";
//        System.out.println(name1.indexOf("j"));// if no match name1 string return -1
//        System.out.println(name1.indexOf("ka"));  // string is match element return 4

        String modifiedName = "Irshaahaad";
       // System.out.println(modifiedName.indexOf("haa",7)); //6
//        System.out.println(modifiedName.lastIndexOf("haa",10));//6
//
//        System.out.println(name.equals("irshad"));//true
//        System.out.println(name.equalsIgnoreCase("IRSHAD"));//true
//
//        //Escape Sequence characters
        System.out.println("I am escape sequence \t double quote "); // tab escape sequence characters
        System.out.println("I am escape sequence \\ double quote ");

    }
}
