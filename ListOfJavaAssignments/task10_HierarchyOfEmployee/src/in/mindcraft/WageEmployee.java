package in.mindcraft;

public class WageEmployee extends Employee{
	protected static int hour;
	protected static int rate;
	
	public WageEmployee() {
		hour = 0;
		rate = 0;
	}
	
	public WageEmployee(int id, String n, int d, int m, int y, int h,int r) {
		super(id,n,d,m,y);
		hour=h;
		rate=r;
		
	}
	
	public int showSalary() {
		return hour*rate;
	}
	
	public void show() {
		super.show();
		System.out.println("Salary:"+ showSalary());
		System.out.println(" ");
	}
	
}
