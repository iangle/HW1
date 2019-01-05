/*Isaac Angle
   This project will ask the user for a weight and a height
   in inches and pounds respectively. It will then convert them to 
   kilograms and meters.
*/
import java.util.Scanner;

public class BMI{                         
   public static void main (String [] args) { 
      double bmi = 0.0;
      //the conversion factor from inches to meters
      final double meterConversion = 0.0254;
      //the conversion factor from pounds to kilograms
      final double kilogramConversion = 0.45359237;
      Scanner scan =  new Scanner(System.in);
      System.out.println("What is your weight in pounds? ");
      double weight = scan.nextDouble();
      System.out.println("What is your height in inches? ");
      double height = scan.nextDouble();
      
      double height_in_meters = height*meterConversion;
      double weight_in_kilograms = weight*kilogramConversion;
      bmi = (weight_in_kilograms / (height_in_meters * height_in_meters));
      System.out.println("You height in meters is: " + height_in_meters);
      System.out.println("You weight in kilograms is: " + weight_in_kilograms);
      System.out.println("Your body mass index is: " + bmi + " (kg/m^2) ");
   } 
}