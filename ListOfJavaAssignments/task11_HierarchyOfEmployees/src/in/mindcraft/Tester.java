package in.mindcraft;

/*11.Construct a hierarchy of employees.
	1. Create an Employee class with attributes like employee id, name, basic salary.
	2. Inherit class Manager and MarketingExecutive from super class Employee
	3. Manager class should have following members
		a. Petrol Allowance: 8% of basic salary
		b. Food Allowance: 12% of basic salary
		c. Other Allowance: 4% of basic salary
	4. MarketingExecutive class should have following members
		a. Kilometers travelled
		b. Tour Allowance: Rs.5/- per kilometer
		c. Telephone Allowance Rs.2000/-
	5. Write constructors for the derived classes. (Use super keyword)
	6. Implement methods - display, calculateGrossSalary and calculateNetSalary in Manager
	   and MarketingExecutive class. 
		gross salary = basic salary + allowances
		net salary = gross salary - PF
		PF = 12.5% of basic salary
	7. Declare method printObjects in client code as - 
		void printObjects(Employee e)
		{
			//----
		}
	   Pass objects of different classes to printObjects method and display corresponding details.
 */

class employees {
	protected int empid;
	protected String name;
	protected double sal;
	protected double allowance;
	
	public employees() {
	}
	
	public employees(int id,String n,double s) {
		empid = id;
		name = n;
		sal = s;
	}

	public double getSal() {
		return sal;
	}
	
	public void display() {
		System.out.println("EmpId: "+empid+" Name: "+name+" Basic Sal: "+sal);
	}
}
class manager extends employees{
	private double Pa;
	private double Fa;
	private double Oa;
	
	public manager(int i, String string, int j) {
		super(i,string,j);
		Pa = 0.08*getSal();
		Fa = 0.12*getSal();
		Oa = 0.04*getSal();
	}
	
	public void display() {
		super.display();
		System.out.println("Petrol Allowance: "+Pa);
		System.out.println("Food Allowance: "+Fa);
		System.out.println("Other Allowance: "+Oa);
	}
	public double calculateGrossSalary() {
		return getSal()+ Pa+Fa+Oa;
	}
	
	public double calculateNetSalary() {
		return calculateGrossSalary() - (0.125 *getSal());
	}	
}

class marketingExecutive extends employees{
	private int km;
	private double teleall= 2000;
	private double tourall;
	
	public marketingExecutive (int id,String n,double s,int t) {
		super(id,n,s);
		km = t;
		tourall = 5*km;
	}
	public double calculateGrossSalary() {
		return getSal()+teleall+tourall;
	}
	
	public double calculateNetSalary() {
		return calculateGrossSalary() - (0.125 *getSal());
	}	
	
	public void display() {
		super.display();
		System.out.println("Telephone Allowance: "+teleall);
		System.out.println("Tour Allowance: "+tourall);
	}
}

public class Tester {
	
	public static void main(String[] args) {
	    manager m1 = new manager(1, "Satvik", 20000);
	    System.out.println("Manager Details:");
	    m1.display();
	    System.out.println("Gross Salary: " + m1.calculateGrossSalary());
	    System.out.println("Net Salary: " + m1.calculateNetSalary());
	    System.out.println();

	    marketingExecutive e1 = new marketingExecutive(2, "Parth", 30000, 50);
	    System.out.println("Marketing Executive Details:");
	    e1.display();
	    System.out.println("Gross Salary: " + e1.calculateGrossSalary());
	    System.out.println("Net Salary: " + e1.calculateNetSalary());
	}


}
