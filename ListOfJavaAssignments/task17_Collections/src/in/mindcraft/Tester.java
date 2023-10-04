package in.mindcraft;

/*
 * 17.Sort the objects of class Student (implemented earlier) according to their percentage. Use comparator interface
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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


class StudentPercentageComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Compare based on percentage
        return Double.compare(student1.getPercentage(), student2.getPercentage());
    }
}

public class Tester {
    public static void main(String[] args) {
        UtilityList utilityList = new UtilityList();
        utilityList.createList();
        utilityList.printList();

        List<Student> studentList = utilityList.getList();

        // Sort the list based on percentage using the custom comparator
        Collections.sort(studentList, new StudentPercentageComparator());

        System.out.println("\nSorted by Percentage (Comparator):");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
