/**@author Isaac Angle
 * This is the main class to run the date class
 * */
package hW1;

public class DateTest {

	public static void main(String[] args) {
		Date date1 = new Date(6,11,2000);
		Date date2 = new Date(8,25,2019);
		System.out.println(date1.getMonth());
		System.out.println(date2.getMonth());
		Date.GetCurrentDate();
		System.out.println(date1.calcDifference(date1, date2));
		System.out.println(date1.createNewDate(5, date1).getMonth());
		System.out.println(date1.createNewDate(0, date1).get_Day_of_month());
		System.out.println(date1.createNewDate(0, date1).getYear());

	}

}
