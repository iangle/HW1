/*Isaac Angle
 * This program will ask the user for a number between 
 * 10 and 100 and will then print out that many numbers and
 * tell the user if they are even or odd*/

import java.util.Scanner;
import java.util.Random;

public class Odd_or_Even {

	public static void main(String[] args) {
		//min and max for rand numbers
		int min = 0,max = 100;
		int userNum = 0;
		Scanner scan = new Scanner(System.in);
		//PT -- why 50? -2
		while(userNum < 10 || userNum > 50) {
			System.out.println("Enter a number between 10 and 100 ");
			userNum = scan.nextInt();
		}
		// runs the the numbers and checks to see if they are even or odd
		for(int i = 0; i < userNum; i++) {
			//generates a random number
			Random rand = new Random();
			int randNum = Math.abs(rand.nextInt() % (max -min +1) + min);
			if(randNum % 2 == 0) {
				System.out.printf("the number %d is even\n", randNum);
			}else {
				System.out.printf("the number %d is odd\n", randNum);
			}
			
		}
	}

}
