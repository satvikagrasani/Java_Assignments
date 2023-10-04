package in.mindcraft;

import java.util.Scanner;

class MyThreads implements Runnable{
	
	private int num;
	private Thread t1,t2;
	
	public MyThreads(int num) {
		this.num = num;
		t1 = new Thread(this,"first");
		t2 = new Thread(this,"second");
		
		t1.start();
		t2.start();
		
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (Thread.currentThread()==t1)
				System.out.println("incremented value-"+(num+i));
			else if(Thread.currentThread()==t2)
				System.out.println("table value"+(num*i));
		}
	}
	
}
public class Tester {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		MyThreads m = new MyThreads(num);
		m.run();
	}

}

