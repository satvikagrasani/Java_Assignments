package in.mindcraft;

import com.mindcraft.pack1.*;
import com.mindcraft.pack2.Batch;

public class Tester {

	public static void main(String[] args) {
		Student A = new Student(1,"Satvik","Maths");
		Student B = new Student(2,"Parth","Science");
		
		A.showStudent();
		B.showStudent();
		System.out.println("Total Strength: "+Batch.BatchStrength);
	}

}
