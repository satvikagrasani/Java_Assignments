package in.mindcraft;

interface printable{
	public void printDetails();
}

class CktPlayer implements printable{
	private String Name;
	private int Runs;
	
	public CktPlayer() {
		Name = "Satvik";
		Runs = 50;
	}
	
	public CktPlayer(String n, int r) {
		Name = n;
		Runs = r;
	}
	public void printDetails() {
		System.out.println("Name: "+Name+" Runs: "+Runs);
	}
	
}

class FtPlayer implements printable{
	private String Name;
	private int Goals;
	
	public FtPlayer() {
		Name = "Satvik";
		Goals = 50;
	}
	
	public FtPlayer(String n, int r) {
		Name = n;
		Goals = r;
	}
	public void printDetails() {
		System.out.println("Name: "+Name+" Goals: "+Goals);
	}
	
}

public class Tester {

	public static void main(String[] args) {
		CktPlayer c = new CktPlayer();
		c.printDetails();
		
		FtPlayer f = new FtPlayer("Parth",60);
		f.printDetails();

	}

}
