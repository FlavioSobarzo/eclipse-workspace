package Capitulo11;

public class Date{
	   public int año;
	   public int mes;
	   public int dia;
	
	   public static void main(String args[]){
	      Date birthday = new Date();
	      System.out.println(birthday.año+" "+birthday.mes+" "+birthday.dia);
	   }
	   
	   public Date(int año, int mes, int dia){
	      this.año = año;
	      this.mes = mes;
	      this.dia = dia;
	   }
	   
	   public Date(){
	      this(2018,4,20);
	   }
	}
