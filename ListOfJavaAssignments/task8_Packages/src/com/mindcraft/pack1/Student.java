package com.mindcraft.pack1;
import com.mindcraft.pack2.*;

public class Student {
	public int Rollno,Strength;
	public String Name;
	public Batch Batch;
	
	
	public Student (int Rollno,String Name,String Batch) {
		this.Rollno = Rollno;
		this.Name = Name;
		this.Batch = new Batch(Batch);
	}
	
	
	public void showStudent() {
		System.out.println("Rollno: "+Rollno+" Name: "+Name+" Batch: "+ Batch.CourseName);
	}
}



