/**@author Isaac Angle
 * this class will create a date and allow the user to change
 * certain variables and get the current date*/

package hW1;

public class Date {
	private final int numDaysInYear = 365;
	private int day_of_month,month,year;
	private int daysInMonth;
	//default constructor, takes a month, day and year
	Date(int month, int day_of_month, int year){
		if(month == 2 && day_of_month >= 31 || day_of_month > 31 || month > 12 || month < 1 || day_of_month < 1) {
			
			System.out.println("----- That is not a valid day! -----");
			
		}else {
			this.day_of_month = day_of_month;
			this.month = month;
			this.year = year;
		}
	}
	
	public int get_Day_of_month() {
		return day_of_month;
	}

	public void set_Day_of_month(int day_of_month) {
		this.day_of_month = day_of_month;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public static void GetCurrentDate() {
		//from https://www.javatpoint.com/java-get-current-date
		System.out.println(java.time.Clock.systemUTC().instant()); 
	}
	
	public int calcDifference(Date date1,Date date2) {
		if(date1.getYear() > date2.getYear()) {
			System.out.println("The first date has to be before the second date! ");
			return 0;
		}
		
		int yearDif = 0;
		if(date1.getYear() - date2.getYear() == 0) {
			yearDif = Math.abs(date1.getYear() - date2.getYear());
		} else {
			yearDif = Math.abs(date1.getYear() - date2.getYear());
		}
		int days = yearDif*numDaysInYear;
		int difInMonth = 0;
		if(date1.getMonth() > date2.getMonth()) {
			difInMonth = 12 - (date1.getMonth() - date2.getMonth());
		} else {
			difInMonth = Math.abs(date1.getMonth() - date2.getMonth());
		}
		
		int daysOfMonth = 0;
		int counter =  1;
		for(int i = 1; i < difInMonth; i++) {
			if(i+date1.getMonth() > 12) {
				daysOfMonth += getDaysInMonth(counter);
			}else {
				daysOfMonth += getDaysInMonth((i + date1.getMonth()));
			}
		}
		
		int difOfDays = 0;
		days += daysOfMonth;
		
		if(difInMonth != 0) {
			difOfDays = (getDaysInMonth(date1.getMonth()) - date1.get_Day_of_month());
			difOfDays += date2.get_Day_of_month();
		} else {
			difOfDays = date2.get_Day_of_month() - date1.get_Day_of_month();
		}
		
		days += difOfDays;
		
		days += LeapYear(date1,date2);
		
		return days;
	}
	// adds the amount of days to the current date and then returns the number of days passed
	public Date createNewDate(int days, Date currentDate) {
		int numDays = days;
		int month = 0;
		int year;
		if(days < numDaysInYear) {
			year = currentDate.getYear();
		} else {
			year = days % numDaysInYear;
			numDays -= year*numDaysInYear;
			year = currentDate.getYear() + year;
		}
		
		if(numDays < 12) {
			month = currentDate.getMonth();
		}else {
			month = numDays % 12;
			numDays -= month*12;
			month = currentDate.getMonth() + month;
		}
		numDays = numDays + currentDate.get_Day_of_month();
		currentDate.set_Day_of_month(numDays);
		currentDate.setMonth(month);
		currentDate.setYear(year);
		
		return currentDate;
	}
	
	public int getDaysInMonth(int month) {
		
		switch(month) {
		case 1:
			return 31;
		case 2:
			return 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		}
		
		return 0;
	}
	
	// checks to see how many leap years are between the two dates
	//I found the formula at https://support.microsoft.com/en-us/help/214019/method-to-determine-whether-a-year-is-a-leap-year
	
	public int LeapYear(Date date1, Date date2) {
		int counter = 0;
		int LeapYear = 0;
		for(int i = 0; i < Math.abs(date1.getYear() - date2.getYear()); i++) {
			if(((date1.getYear() + counter) % 4) == 0) {
				if(((date1.getYear() + counter) % 100) == 0) {
					
				}else {
					LeapYear++;
				}
				
					if(((date1.getYear() + counter) % 400) == 0) {
						LeapYear++;
				}
			}
			counter++;
		}
		return LeapYear;
	}
}
