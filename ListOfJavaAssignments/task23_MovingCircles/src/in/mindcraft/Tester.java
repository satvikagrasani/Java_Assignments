package in.mindcraft;

/*23.There are three circles in a frame (red, blue green). 
 * These circles moves from left to right with constant speed. 
 * Red is fastest moving. 
 * Green is slowest moving and blue is moving with intermediate speed. 
 * All of them start at same time. 
 * Whichever reaches to right edge will wait for others to come. 
 * When last one(green) will reach to right edge, 
 * 	all of them will again start the execution from left.
 */

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

@SuppressWarnings("serial")
class MovingCircle extends Frame implements Runnable{
	private Thread t1,t2,t3;
	private int x,y,z;
	
	public MovingCircle() {
		x = y = z = 100;
		t1 = new Thread(this,"t1");
		t2 = new Thread(this,"t2");
		t3 = new Thread(this,"t3");
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(x, 100, 100, 100);
		g.setColor(Color.BLUE);
		g.fillOval(y, 250, 100, 100);
		g.setColor(Color.GREEN);
		g.fillOval(z, 400, 100, 100);
	}
	
	public void run() {
		
		while(true) {
			
			if(Thread.currentThread()==t1) {
				synchronized(this) {
					x++;
					if(x==this.getWidth()-100) {
						try {
							wait();
						}catch (InterruptedException e) {}
				}
			}
			try {
				Thread.sleep(30);
			} catch (Exception e) {}
			}
			else if(Thread.currentThread()==t2) {
				synchronized (this) {
					y++;
					if(y==this.getWidth()-100) {
						try {
							wait();
						}catch (InterruptedException e) {}
					}
			
				}
				try {
						Thread.sleep(60);
					} catch (Exception e) {}
				}
			else if(Thread.currentThread()==t3) {
				synchronized (this) {
					z++;
					if(z==this.getWidth()-100) {
						x = y = z= 0;
						notifyAll();
					}
			
				}
				try {
						Thread.sleep(90);
					} catch (Exception e) {}
				}
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