package hW1;

/*Isaac Angle
   This project will ask the user for a number 
   will the convert it to a string and then to an int.
   Then the program will print the number out
*/
import java.util.Scanner;

public class StringConverter{                         
   public static void main (String [] args) { 
      String userString = "";
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number: ");
      userString = scan.nextLine();
    	 
    	 int userNum = 0;
      try {
    	  userNum = Integer.parseInt(userString);
      
      }catch(NumberFormatException e) {
    	  System.out.println("That is not a number! ");
      }
      
      Integer.toString(userNum);
   } 
}