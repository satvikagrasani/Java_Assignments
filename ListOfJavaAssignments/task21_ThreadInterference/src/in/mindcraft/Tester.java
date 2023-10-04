package in.mindcraft;

/*21.Refer class Account implemented in question 19. 
 *Make its methods synchronized to avoid thread interference.
 */

class Account{
	private int balance;
	
	public Account() {
		balance = 10000;
	}
	
	public synchronized void deposite(int amount) {
		System.out.println("Balance before deposite-"+balance);
		synchronized(this) {
			balance = balance+amount;
		}
		
		System.out.println("Balance after deposite-"+balance);
	}
	
	public synchronized void withdraw(int amount) {
		System.out.println("Balance before withdraw-"+balance);
		synchronized(this) {
			balance = balance-amount;
		}
		
		System.out.println("Balance after withdraw-"+balance);
	}
		
}

class AccountUser extends Thread {
	String name,tot;
	Account account;
	int amount;
	
	public AccountUser(String name,Account account,String tot,int amt) {
		this.name =  name;
		this.account = account;
		this.tot = tot;
		this.amount = amt;
	}
	
	public void run() {
		if(tot.equals("deposite"))
			account.deposite(amount);
		else if (tot.equals("withdraw"))
			account.withdraw(amount);
	}
	
}

public class Tester {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		AccountUser user1 = new AccountUser("Satvik",account,"deposite",5000);
		AccountUser user2 = new AccountUser("Parth",account,"withdraw",2000);
		
		user1.start();
		user2.start();
	}

}
