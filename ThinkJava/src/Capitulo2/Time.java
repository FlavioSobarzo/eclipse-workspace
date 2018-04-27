package Capitulo2;

import java.util.Date;

public class Time {
	
	 public static void main (String[] args) {
	      int hora, minuto, segundo;
	      Date tiempo = new Date();
	      hora=tiempo.getHours();
	      minuto=tiempo.getMinutes();
	      segundo=tiempo.getSeconds();
	      
	      System.out.println("Son las: " + hora + ":" + minuto + ":" + segundo);
	      System.out.println("Porcentaje: " + ((hora*60*60+(minuto*60)+segundo)*100)/(24*60*60) + "%");
	      System.out.println("Segundos transcurridos " + (hora*60*60+(minuto*60)+segundo));
	      System.out.println("Segundos restantes: " + ((24*60*60)-(hora*60*60+(minuto*60)+segundo)));
	   }

}
