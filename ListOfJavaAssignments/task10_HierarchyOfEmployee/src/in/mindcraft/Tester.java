package in.mindcraft;

/*10.Construct a hierarchy of employees.
     a. Create an Employee class with attributes like employee id, name, date of birth.
	 b. Inherit class WageEmployee from super class Employee
	 c. WageEmployee class should have following members
		a. Number of hours worked
		b. Rate per hour
	 d. Inherit class SalesPerson from super class WageEmployee. SalesPerson should have following members
		a. Number of items sold
		b. Commission per item
	 e. Write constructors for WageEmployee and SalesPerson  classes. 
	 f. Override the methods for displaying details, calculating salary in WageEmployee and  	  	    	     SalesPerson class. 
		WageEmployee Salary = hours * rate
		SalesPerson Salary = hours*rate + sales*commission
 */

public class Tester {

	public static void main(String[] args) {
		SalesPerson sp = new SalesPerson(101, "satvik", 01, 01, 2023, 9, 2500, 10, 10000);
		sp.show();

		WageEmployee we = new WageEmployee(102, "parth", 02, 01, 2023, 9, 2500);
		we.show();

	}

}
