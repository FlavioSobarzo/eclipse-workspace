package ActividadThinkJava;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class mickey extends Canvas  {
	
	public void paint(Graphics g) {
		Rectangle bb = new Rectangle(100, 100, 200, 200); 
		mickey(g,bb);
	}
	
	public void boxOval(Graphics g, Rectangle bb) {
		g.fillOval(bb.x, bb.y, bb.width, bb.height);
		}
	
	public void mickey(Graphics g, Rectangle bb) {
		boxOval(g, bb);
		for(int i=2; i<=6; i = i+2) {
		int dx = bb.width / i;
		int dy = bb.height / i;
		if(i==2) {
		Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
		half.translate(-dx / 2, -dy / 2);
		boxOval(g, half);
		half.translate(dx * 2, 0);
		boxOval(g, half);
		}
		else {
		Rectangle half = new Rectangle(bb.x/(i-2), bb.y/(i-2), dx, dy);
		half.translate(-dx / 2, -dy / 2);
		boxOval(g, half);
		for(int j=2; j<=i; i= i+2) {
		half.translate(dx * 2, 0);
		boxOval(g, half);
		}
		}
		}
		}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new mickey();
		canvas.setSize(400, 400);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}
}
