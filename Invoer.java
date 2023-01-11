import java.util.Scanner;   


class Invoer{
  
 public static void main(String[] args){
  

  Scanner in = new Scanner(System.in);

  String str = "Hello world!";

   int i = str.indexOf('e');
   String str2 = str.concat(" again");
  
   String str3 = str + str2;

   String str4 = str.substring(3,4);
   String str5 = str.replace(0,4, "Good bye ");

  System.out.println(str + " " + str2 + " " + str3 + " " + str4 + " "+ str5);

  

  
  
 }
}