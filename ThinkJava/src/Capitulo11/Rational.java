package Capitulo11;

public class Rational {

	private int numerator;
	private int denominator;
	
	public Rational(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public static void main(String[] args) {
		
		Rational r = new Rational(2, 3);
		r.printRational();
		r.invert();
		r.printRational();
		r.negate();
		r.printRational();
		System.out.println(r.toDouble());
	}
	
	public void printRational() {
		System.out.println("El numero racional es " + this.numerator + "/" + this.denominator );
	}
	
	public String toString() {
		return String.format("e numerador es %02d y su numerador %02d\n",
				this.numerator, this.denominator);
	}
	
	public void negate() {
		this.numerator = this.numerator*-1;
	}
	
	public void invert() {
		int guardarNumerador = this.numerator;
		this.numerator = this.denominator;
		this.denominator = guardarNumerador;
	}
	
	public double toDouble() {
		double n = this.numerator;
		double d = this.denominator;
		return n/d;
	}
	
	public void reduce() {
		gcd(this.numerator, this.denominator);
		// No entendi
	}
	
	public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDominator() {
		return this.denominator;
	}
}
