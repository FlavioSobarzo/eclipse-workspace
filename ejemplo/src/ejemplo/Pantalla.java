package ejemplo;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class Pantalla extends JFrame{

    public Pantalla(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(450,450);

        JButton button =new JButton("press");
        panel.add(button);
    }

    public void paint(Graphics g) {
        super.paint(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;
        Line2D lin = new Line2D.Float(100, 100, 250, 260);
        g2.draw(lin);
    }

    public static void main(String []args){
        Pantalla s=new Pantalla();
        s.setVisible(true);
    }
}