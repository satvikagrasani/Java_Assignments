package in.mindcraft;

/*5.Create a class AccountHolder with -
 *Instance variables - account number, account holder name, account balance
 *Class methods - constructors, getter/setter methods, deposit, withdraw
 *Create an array of AccountHolder objects in main. 
 *Write a menu driven program to perform -
 		1. Add record for account holder
		2. Display details of all account holders.
		3. Deposit an amount into particular account
		4. Withdraw an amount from particular account
 * 
 */

import java.util.Scanner;

class AccountHolder{
	private int accno;
	private String name;
	private double balance; 
	
	public AccountHolder(int accno,String name,double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public void show() {
		System.out.println(accno+"  "+name+"  "+balance);
	}
}


public class Tester {

	public static void main(String[] args) {
		int choice, cnt =0, acno;
		AccountHolder []arr = new AccountHolder[10];
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("1. Add a record");
			System.out.println("2. Display all records");
			System.out.println("3. Deposite");
			System.out.println("4. Withdraw");
			System.out.println("5. Exit");
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.println(" \nEnter Account number \n");
					int acnoN = sc.nextInt();
					System.out.println(" \nHolders name \n");
					String nameN = sc.next();
					System.out.println(" \nBalance \n");
					double balanceN = sc.nextDouble();
					arr[cnt++] = new AccountHolder(acnoN,nameN,balanceN); // Add new account record
					break;
				case 2:
					for(int i=0; i<cnt;i++)
						arr[i].show(); // Display all records
					break;
				case 3:
					System.out.println(" \nEnter account number: \n");
					acno = sc.nextInt();
					
					for(int i =0;i<cnt;i++)
						if(arr[i].getAccno()==acno) {
							System.out.println(" \nEnter amount to Deposit: \n");
							arr[i].deposit(sc.nextDouble()); // Deposit the amount to the account
						}
					break;
				case 4:
				    System.out.println("Enter account number: ");
				    acno = sc.nextInt();
				    for (int i = 0; i < cnt; i++) {
				        if (arr[i].getAccno() == acno) {
				            System.out.println("Enter amount to be Withdraw: ");
				            double amount = sc.nextDouble();
				            arr[i].withdraw(amount); // Withdraw the amount from the account
				        }
				    }
				    break;
				case 5:
					System.out.println(" \nThankyou! \n");
					System.exit(0); // exit
					sc.close();
				
			}
			
			
		}
	}

}
