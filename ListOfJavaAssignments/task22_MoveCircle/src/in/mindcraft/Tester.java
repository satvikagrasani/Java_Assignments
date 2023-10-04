package in.mindcraft;

/*22.Display a filled circle in a frame. 
 * Make this circle to move/toggle between left and right walls of frame. 
 * Use multi threading.
 */


import java.awt.*;

@SuppressWarnings("serial")
class MovingCircle extends Frame implements Runnable{
	private Thread t1;
	private int x,flag=0;
	
	public MovingCircle() {
		x= 100;
		
		t1 = new Thread(this,"t1..");
		t1.start();
		
	}
	
	public void paint(Graphics g) {

		g.fillOval(x, 200, 100, 100);
	}
	
	public void run() {
		
		while(true) {
			
			if(Thread.currentThread()==t1) {
				if(flag==0)
					x++;
				else if(flag==1)
					x--;
			}
			
			if(x==this.getWidth()-100)
				flag=1;
				
			if(x==0)
				flag=0;
			
			try {
				Thread.sleep(10);
			} catch (Exception e) {}
			
			repaint();
		}
	}
}


public class Tester {

	public static void main(String[] args) {
		MovingCircle ms=new MovingCircle();
		ms.setSize(500,500);
		ms.setVisible(true);
	}

}
