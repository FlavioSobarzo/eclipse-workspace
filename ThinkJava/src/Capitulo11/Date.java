package Capitulo11;

public class Date {

	private int año;
	private int mes;
	private int dia;

	public Date() {
		
		this.año = 1996;
		this.mes = 5;
		this.dia = 24;
	}

	public Date(int año,int mes, int dia) {
		
		this.año = año;
		this.mes = mes;
		this.dia = dia;
	}
	
	public static void main(String[] args) {
		
		Date birthdayConst1 = new Date();
		Date birthdayConst2 = new Date(1996, 5, 24);
	}

}
