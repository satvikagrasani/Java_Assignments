package in.mindcraft;

/* 16.a. Write a student class with attributes - 
		class Student
		{
			private int rollno;
			private String name;
			private double percentage;
			private Set<String> skillset

			// methods of Student class
		}
	  b. Now write a class 'UtilityList' which has list of Student objects as member.
		class UtilityList
		{
			private List<Student> list;
			// methods of Utility class
		}
	   Implement methods 'createList()' and 'printList()' in class UtilityList.
			createList - will accept Students from user and will store it into list of students.
			printList - will print whole list of students.

	  c. Write a class 'UtilityReport' has a method 'showReport()' This method shows report like: StudentName-->Percentage
		class UtilityReport
		{
			private Map<String, Double> m;
			// method of class UtilityReport
		}

 * 
 */

import java.util.*;

class Student {
    private int rollno;
    private String name;
    private double percentage;
    private Set<String> skillset;

    public Student(int rollno, String name, double percentage, Set<String> skillset) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
        this.skillset = skillset;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + "\nName: " + name + "\nPercentage: " + percentage + "\nSkillset: " + skillset + "\n";
    }

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

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Set<String> getSkillset() {
		return skillset;
	}

	public void setSkillset(Set<String> skillset) {
		this.skillset = skillset;
	}
}

class UtilityList {
    private List<Student> list;

    public UtilityList() {
        list = new ArrayList<>();
    }

    public void createList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students to add: ");
        int numStudents = sc.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter Student Roll No: ");
            int rollno = sc.nextInt();
            System.out.println("Enter Student Name: ");
            String name = sc.next();
            System.out.println("Enter Student Percentage: ");
            double percentage = sc.nextDouble();
            
            // Collect skills as a Set
            Set<String> skillset = new HashSet<>();
            System.out.println("Enter the number of skills: ");
            int numSkills = sc.nextInt();
            for (int j = 0; j < numSkills; j++) {
                System.out.println("Enter skill " + (j + 1) + ": ");
                skillset.add(sc.next());
            }

            list.add(new Student(rollno, name, percentage, skillset));
        }
    }

    public void printList() {
        System.out.println("Student List:");
        for (Student student : list) {
            System.out.println(student);
        }
    }
    public List<Student> getList() {
        return list; 
    }
}

class UtilityReport {
    private Map<String, Double> m;

    public UtilityReport(List<Student> studentList) {
        m = new HashMap<>();
        for (Student student : studentList) {
            m.put(student.getName(), student.getPercentage());
        }
    }

    public void showReport() {
        System.out.println("Student Report:");
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}

public class Tester {
    public static void main(String[] args) {
        UtilityList utilityList = new UtilityList();
        utilityList.createList();
        utilityList.printList();

        UtilityReport utilityReport = new UtilityReport(utilityList.getList());
        utilityReport.showReport();
    }
}

