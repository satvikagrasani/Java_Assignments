package in.mindcraft;

public class Date {
	private int dd,mm,yy;
	
	public Date() {
		dd=1;
		mm=1;
		yy=2000;
	}
	
	public Date(int d,int m,int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	public void show() {
		System.out.println("Date: "+dd+"/"+mm+"/"+yy);
	}
}


