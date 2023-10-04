package in.mindcraft;

public class SalesPerson extends WageEmployee{
	private int sale;
	private int commitio;
	
	public SalesPerson() {
		sale=0;
		commitio=0;
	}
	
	public SalesPerson(int id, String n, int d, int m, int y, int h,int r,int s,int c) {
		super(id,n,d,m,y,h,r);
		sale = s;
		commitio = c;
	}
	
	public int showSalary() {
		return super.showSalary() + sale*commitio;
	}
	public void show() {
		super.show();
		System.out.println("Salary:"+ showSalary());
		System.out.println(" ");
	}
	
}
