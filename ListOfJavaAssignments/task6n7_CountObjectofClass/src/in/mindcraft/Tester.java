package in.mindcraft;

/*6.Write a class Student with members for rollno, name and percentage. 
 * Implement necessary methods inside class. 
 * Write a code to print number of objects created for class Student. Use static.
*/
class student{
	private int rollno;
	private String name;
	private long percentage;
	private static int cnt;
	
	public student(){
		rollno = 1;
		name = "Satvik";
		percentage = 100;
		cnt++;
	}
		
	public student(int rollno, String name, long percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		cnt++;
	}

	/*
	 * 7.Implement getter/setter methods and method “toString”.
	 */
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPercentage() {
		return percentage;
	}

	public void setPercentage(long percentage) {
		this.percentage = percentage;
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		student.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}

	public void show() {
		System.out.println(rollno+" "+name+" "+percentage);
	}
	public static void showcnt() {
		System.out.println("Total Count:"+cnt);
	}
}

public class Tester {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student(2,"Dummy",100);
		
		s1.show();
		s2.show();
		student.showcnt();
		
		System.out.println(s1.getName());
		System.out.println(s1.toString());

	}

}
