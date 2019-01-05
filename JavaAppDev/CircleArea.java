
/*Isaac Angle
   This project will ask the user for a radius
   and then use the number pi to compute the area
   of the circle
*/
import java.util.Scanner;
public class CircleArea{                         
   public static void main (String [] args) { 
      // variable to hold the value pi
      double radius = 0.0;
      final double PI = 3.14;
      double area = 0.0;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      radius = scan.nextDouble();
      area = PI*radius*radius;
      System.out.println("The area of your circle is: " + area);
   } 
}