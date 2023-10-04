package in.mindcraft;

class Account {
    private int balance;

    public Account(int b) {
        balance = b;
    }
    
    public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) throws Exception {
        if (amount > 15000) {
            throw new Exception("Overlimit - cannot withdraw more than 15000 at a time");
        } else if (amount > balance) {
            throw new Exception("Insufficient balance");
        }
        balance = balance - amount;
    }
}

public class Tester {
    public static void main(String[] args) {
        Account acc = new Account(20000);
        System.out.println(acc.getBalance());
        acc.deposit(10000);
        System.out.println(acc.getBalance());
        try {
            acc.withdraw(10000);
            System.out.println(acc.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
