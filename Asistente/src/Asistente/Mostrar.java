package Asistente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Mostrar {

	public Mostrar(String titulo, double hora, JFrame frame, int NewsOrCall){
		String TipoDeNotificacion = "";
		if(NewsOrCall == 0) {
			TipoDeNotificacion = "Nueva llamada ";
		}
		if(NewsOrCall == 1) {
			TipoDeNotificacion = "Nueva noticia ";
		}
		if(NewsOrCall == 2) {
			TipoDeNotificacion = "Te han llamado:";
		}
		if(hora != -1) {
			JLabel myLabel = new JLabel(TipoDeNotificacion + "a las " + hora/10 + " hrs -> " + titulo, SwingConstants.CENTER); 
			myLabel.setFont(new Font("Serif", Font.BOLD, 22));
			myLabel.setBackground(Color.white);
			myLabel.setOpaque(true);
			myLabel.setPreferredSize(new Dimension(100, 80));
			frame.getContentPane().add(myLabel, BorderLayout.NORTH);
		}
		else {
			JLabel myLabel = new JLabel(TipoDeNotificacion + titulo, SwingConstants.CENTER); 
			myLabel.setFont(new Font("Serif", Font.BOLD, 22));
			myLabel.setBackground(Color.white);
			myLabel.setOpaque(true);
			myLabel.setPreferredSize(new Dimension(100, 80));
			frame.getContentPane().add(myLabel, BorderLayout.NORTH);
		}
		// se muestra en la consola la llamada o noticia
	}
}
