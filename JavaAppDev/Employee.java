/*Isaac Angle
 * this class will create an employee object that
 * will have an id, a name, a hire date, current position in the company
 * and a manager that resides over the employee
 * */
package employee;

public class Employee {
	private String ID = "A126790";
	private String name = "Dan",hireDate = "12-11-15";
	private String currentPosition = "lab tech";
	private String Manager = "Fred Davis";
	public Employee(String ID, String name, String hireDate, String currentPosition, String manager) {
		this.ID = ID;
		this.name = name;
		this.hireDate = hireDate;
		this.currentPosition = currentPosition;
		this.Manager = manager;
	}
}
