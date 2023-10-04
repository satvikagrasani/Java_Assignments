package in.mindcraft;

/* 15. Write a class Employee for an application which will have data members for employee id, employee name and salary. Provide the following functionalities in Employee class.
		1. Initialing objects using default and parameterized constructors.
		2. Accepting and displaying the information of employee from console	
		In "main" method take an array list of Employee objects. 
			Write a menu driven program to -
				a. Insert record into an array list.
				b. Update information of specific employee on the basis of 
					emp_id accepted from user
				c. Display all records.
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int id) {
        empId = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    public void display() {
        System.out.println("Employee ID: " + empId + " Name: " + empName + " Salary: " + salary);
        System.out.println();
    }
}

public class Tester {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add New Employee");
            System.out.println("2. Update Employee Salary");
            System.out.println("3. Show All Employees");
            System.out.println("4. Exit");
            System.out.print(" Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print(" Enter Employee ID ");
                    int id = sc.nextInt();
                    System.out.println(" Enter Name ");
                    String name = sc.next();
                    System.out.println(" Enter Salary:");
                    double salary = sc.nextDouble();
                    Employee newEmployee = new Employee(id, name, salary);
                    employeeList.add(newEmployee);
                    break;
                case 2:
                    System.out.print(" Enter Employee ID to update salary: ");
                    int empIdToUpdate = sc.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = sc.nextDouble();
                    for (Employee employee : employeeList) {
                        if (employee.getEmpId() == empIdToUpdate) {
                            employee.setSalary(newSalary);
                            System.out.println("Salary updated successfully.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Employee List:");
                    for (Employee employee : employeeList) {
                        employee.display();
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
