package in.mindcraft;

/* 24.Create table student in database with fields for rollno, name and percentage.
   Using JDBC perform following operations on this table through menu driven java program.
		a.Insert record
		b.Update record
		c.Delete record
		d.Display particular record from table
		e.Display all records from table
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test1", "root", "root");
        Statement stmt = conn.createStatement();

        Scanner sc = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println("\nStudent Database");
            System.out.println("\n1. Insert Record");
            System.out.println("2. Update Record");
            System.out.println("3. Delete Record");
            System.out.println("4. Display Some Record");
            System.out.println("5. Display All Records");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Student rollno: ");
                    int ri = sc.nextInt();
                    System.out.print("Enter Student name: ");
                    String name = sc.next();
                    System.out.print("Enter Student percentage: ");
                    double per = sc.nextDouble();

                    boolean insert = stmt.execute("INSERT INTO student VALUES(" + ri + ",'" + name + "'," + per + ")");
                    if (!insert)
                        System.out.println("Executed successfully");
                    break;
                case 2:
                    System.out.print("\nEnter roll of Student for update: ");
                    int ru = sc.nextInt();
                    System.out.print("Enter percentage: ");
                    double pre = sc.nextDouble();

                    boolean update = stmt.execute("UPDATE student SET percentage = " + pre + " WHERE rollno = " + ru);
                    if (!update)
                        System.out.println("Executed successfully");
                    break;
                case 3:
                    System.out.print("\nEnter roll of Student to delete: ");
                    int rd = sc.nextInt();
                    
                    boolean delete = stmt.execute("DELETE FROM student WHERE rollno = " + rd);
                    if (!delete)
                        System.out.println("Record deleted successfully");
                    break;
                case 4:
                    System.out.print("\nEnter roll of Student to display: ");
                    int rdsp = sc.nextInt();
                    
                    ResultSet resultSet = stmt.executeQuery("SELECT * FROM student WHERE rollno = " + rdsp);
                    while (resultSet.next()) {
                        int rollno = resultSet.getInt("rollno");
                        String studentName = resultSet.getString("name");
                        double percentage = resultSet.getDouble("percentage");
                        System.out.println("Roll No: " + rollno + ", Name: " + studentName + ", Percentage: " + percentage);
                    }
                    resultSet.close();
                    break;
                case 5:
                    ResultSet allRecords = stmt.executeQuery("SELECT * FROM student");
                    while (allRecords.next()) {
                        int rollno = allRecords.getInt("rollno");
                        String studentName = allRecords.getString("name");
                        double percentage = allRecords.getDouble("percentage");
                        System.out.println("Roll No: " + rollno + ", Name: " + studentName + ", Percentage: " + percentage);
                    }
                    allRecords.close();
                    break;
                case 6:
                	sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

