/*
 * Si quiere comprar presione 1, si se quiere ir 0
1
Lista de productos
1.- Lomo
2.- Filete
3.- Leche
4.- Queso
5.- Lechuga
6.- Tomates
7.- Frutilla
8.- Manzana
Presione el numero del producto que quiere comprar
3
Se ha vendido Leche
Si quiere comprar presione 1, si se quiere ir 0
1
Lista de productos
1.- Lomo
2.- Filete
3.- Leche
4.- Queso
5.- Lechuga
6.- Tomates
7.- Frutilla
8.- Manzana
Presione el numero del producto que quiere comprar
3
No se encuntra Leche, se necesita consegir más
Si quiere comprar presione 1, si se quiere ir 0
1
Lista de productos
1.- Lomo
2.- Filete
3.- Leche
4.- Queso
5.- Lechuga
6.- Tomates
7.- Frutilla
8.- Manzana
Presione el numero del producto que quiere comprar
4
<<El producto se encuentra almacenado en bodega
Se llamara al reponedor para traer el producto>>
Se ha repuesto el producto Queso en los pasillos
Se ha vendido Queso
Si quiere comprar presione 1, si se quiere ir 0
1
Lista de productos
1.- Lomo
2.- Filete
3.- Leche
4.- Queso
5.- Lechuga
6.- Tomates
7.- Frutilla
8.- Manzana
Presione el numero del producto que quiere comprar
8
<<El producto ha sido resibido
Se llamara para traer el producto>>
Se ha almacenado el producto Manzana en la bodega
Se ha repuesto el producto Manzana en los pasillos
Se ha vendido Manzana
Si quiere comprar presione 1, si se quiere ir 0
 */
package P1;

import java.util.Scanner;

public class Main {

	private static Carne[] carnes = new Carne[2];
	private static Lacteo[] lacteos = new Lacteo[2];
	private static Verdura[] verduras= new Verdura[2];
	private static Fruta[] frutas = new Fruta[2];
	private static Caja cajero;
	private static Bodega bodegero;
	private static Reposicion reponedor;
	private static boolean dentroDeLaTienda = true;
	private static Scanner in = new Scanner(System.in);
	private static int N;
	private static int contador = 1;

	public static void main(String[] args) {
		
			cajero = new Caja("Juan", "Perez", "Cajero");
			bodegero = new Bodega("Pablo", "Perez", "El que esta en bodega");
			reponedor = new Reposicion("Pedro", "Perez", "Reponedor");
			carnes[0] = new Carne("Lomo", 2017, 2016, 2018, "repuesto", "PF");
			carnes[1] = new Carne("Filete", 2017, 2016, 2018, "repuesto", "PF");
			lacteos[0] = new Lacteo("Leche", 2017, 2016, 2018, "repuesto", "Colun");
			lacteos[1] = new Lacteo("Queso", 2017, 2016, 2018, "almacenado", "Philadelfia");
			verduras[0] = new Verdura("Lechuga", 2017, 2016, 2018, "repuesto");
			verduras[1] = new Verdura("Tomates", 2017, 2016, 2018, "vendido");
			frutas[0] = new Fruta("Frutilla", 2017, 2016, 2018, "repuesto");
			frutas[1] = new Fruta("Manzana", 2017, 2016, 2018, "recibido");
			
			while(dentroDeLaTienda == true) {
			System.out.println("Si quiere comprar presione 1, si se quiere ir 0");
			N = in.nextInt();
			if(N == 1) {
				System.out.println("Lista de productos");
					for(int j = 0; j <= 1; j++) {
						imprimirProducto(carnes[j], contador);
						contador = contador +1;
					}
					for(int j = 0; j <= 1; j++) {
						imprimirProducto(lacteos[j], contador);
						contador = contador +1;
					}
					for(int j = 0; j <= 1; j++) {
						imprimirProducto(verduras[j], contador);
						contador = contador +1;
					}
					for(int j = 0; j <= 1; j++) {
						imprimirProducto(frutas[j], contador);
						contador = contador +1;
					}
				contador = 1;
				System.out.println("Presione el numero del producto que quiere comprar");
				N = in.nextInt();
				Vender(N);
				
			}
			
			else if(N == 0) {
				dentroDeLaTienda = false;
			}
			else {
				System.out.println("Caracter no encontrado");
			}
		}
		
	}
	
	public static void imprimirProducto(Producto p, int n) {
		String nombre = p.getNombre();
		System.out.println(n + ".- " + nombre);
	}
	public static void Vender(int n) {
		if(n == 1) {
			cajero.VenderProducto(carnes[0], reponedor, bodegero);
		}
		if(n == 2) {
			cajero.VenderProducto(carnes[1], reponedor, bodegero);
		}
		if(n == 3) {
			cajero.VenderProducto(lacteos[0], reponedor, bodegero);
		}
		if(n == 4) {
			cajero.VenderProducto(lacteos[1], reponedor, bodegero);
		}
		if(n == 5) {
			cajero.VenderProducto(verduras[0], reponedor, bodegero);
		}
		if(n == 6) {
			cajero.VenderProducto(verduras[1], reponedor, bodegero);
		}
		if(n == 7) {
			cajero.VenderProducto(frutas[0], reponedor, bodegero);
		}
		if(n == 8) {
			cajero.VenderProducto(frutas[1], reponedor, bodegero);
		}
	}

}
