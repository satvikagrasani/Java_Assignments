package in.mindcraft;

/*9.  Write a class Student having following –
	a.Student Roll Number (int)
	b.Student Name (String)
	c.Date of Birth (Date class object where Date is user defined class)
	Implement default constructor, parameterized constructor, accept, display. 
	Generate the student roll number automatically.
*/

import java.text.SimpleDateFormat;
import java.util.Date;

class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

   	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        @SuppressWarnings("deprecation")
		Date date = new Date(year - 1900, month - 1, day);
        return dateFormat.format(date);
    }
}

class Student {
    private static int nextRollNumber = 1;
    private int rollNumber;
    private String name;
    private DateOfBirth dateOfBirth;

    // Default constructor
    public Student() {
        this.rollNumber = nextRollNumber++;
        this.name = "Satvik";
        this.dateOfBirth = new DateOfBirth(1, 1, 2000); 
    }

    // Parameterized constructor
    public Student(String name, DateOfBirth dateOfBirth) {
        this.rollNumber = nextRollNumber++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Dummy", new DateOfBirth(15, 9, 2001));

        student1.display();
        System.out.println();

        student2.display();
    }
}
