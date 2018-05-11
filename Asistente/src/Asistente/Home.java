package Asistente;
import java.util.Scanner;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import javax.swing.JFrame;
import javax.swing.JLabel;
//  cambiar a arraylist *ver bien los ojetos
// como asistente llamada noticia tarea listallamada  
// no confundir funciones con clases
public class Home implements Runnable{
	
	public static Scanner in = new Scanner(System.in);
	public static boolean ocupado = false; //si esta false es porque el modo ocupado no esta activo
	public static double segundo =0;;
	private Popup popup;
	public static JFrame frame = new JFrame("FrameDemo");
	public static String[] GuardarLlamada = new String [20];
	private JCheckBox chckbxNewCheckBox;
	//static String[] GuardarNoticias = new String [20];
	//static int minuto=0; //Por ahora no lo uso
	

	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Home());
		String nombre;
		for(int j = 0; j < GuardarLlamada.length; j = j + 1){
			GuardarLlamada[j] = "";
			//GuardarNoticias[j] = "";
		}
		/*System.out.println("¿Como te llamas?");
		nombre = in.nextLine();
		System.out.println("Bienvenido " + nombre); //pequeña introduccion    */ 
        
		while (true) { //se crea un while para que el codigo constantemente revise si hay alguna noticia o llamada	
		Date tiempo = new Date();
		if(segundo != tiempo.getSeconds()){ 
		//si el seg guardado anterior es igual al seg actual no entra
		//asi se evita de que la noticia se imprima muchas veces
	    segundo = tiempo.getSeconds(); //guardo en la variable el seg actual
	    
	    /*minuto = tiempo.getMinutes();
	    //double horaActual = minuto + segundo/100; //Para mas adelante
	    System.out.println(horaActual);*/
	    
	    Noticias horaNoticia = new Noticias(segundo,ocupado, frame); //llamo a la clase Noticias
	    Llamadas horaLlamada = new Llamadas(segundo, ocupado, frame, GuardarLlamada); //llamo a la clase Llammadas
	    frame.setVisible(true);
		}
		}
     }
	  public void run() {
	        JPanel panel = new JPanel();
	        panel.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                if (popup != null) {
	                    popup.hide();
	                }
	                JLabel text = new JLabel("You've clicked at: " + e.getPoint());
	                popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, e.getXOnScreen(), e.getYOnScreen());
	                if(e.getX() >= 0 && e.getX() <= 800 && e.getY() >= 0 && e.getY() <= 400) {
	                	if(ocupado == false) {
	                		ocupado = true;
	                		System.out.println("Modo ocupado activo ");
	                	}
	                	else {
	                		ocupado = false;
	                		System.out.println("Modo ocupado desactivado ");
	                	}
	                }
	                popup.show();
	            }
	        });
	        frame.add(panel);
	        frame.setSize(800, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        chckbxNewCheckBox = new JCheckBox("Modo ocupado");
			frame.getContentPane().add(chckbxNewCheckBox, BorderLayout.SOUTH);
			if(chckbxNewCheckBox.isSelected() == false) {
				ocupado = false;
        		System.out.println("Modo ocupado desactivado ");
			}
			if(chckbxNewCheckBox.isSelected() == true) {
				ocupado = true;
        		System.out.println("Modo ocupado activo ");
			}
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}

