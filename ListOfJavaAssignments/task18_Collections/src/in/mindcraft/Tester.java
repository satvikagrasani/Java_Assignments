package in.mindcraft;

/*18.Sort the objects of class Student (implemented earlier) according to their percentage. 
 * Use comparable interface
 */

import java.util.*;

import java.util.*;

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student otherStudent) {
        // Compare based on percentage
        return Double.compare(this.percentage, otherStudent.percentage);
    }

    // Other getters and setters for Student class

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

public class Tester {
    public static void main(String[] args) {
        UtilityList utilityList = new UtilityList();
        utilityList.createList();
        utilityList.printList();

        List<Student> studentList = utilityList.getList();

        // Sort the list based on percentage using Comparable (natural order)
        Collections.sort(studentList);

        System.out.println("\nSorted by Percentage (Comparable):");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}