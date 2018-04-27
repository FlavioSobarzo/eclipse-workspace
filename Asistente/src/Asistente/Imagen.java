package Asistente;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Imagen {
	public Imagen(String imgBotonFilename, Image imgBoton ) {
	      // Prepare the ImageIcon and Image objects for drawImage()
	      ImageIcon iconBoton = null;
	      URL imgURL = getClass().getClassLoader().getResource(imgBotonFilename);
	      if (imgURL != null) {
	         iconBoton = new ImageIcon(imgURL);
	      } else {
	         System.err.println("Couldn't find file: " + imgBotonFilename);
	      }
	      imgBoton = iconBoton.getImage();
	 }

}
