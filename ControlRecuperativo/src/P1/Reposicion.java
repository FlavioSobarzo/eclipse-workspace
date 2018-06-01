package P1;

public class Reposicion extends Empleado{
	
	public Reposicion(String nombre, String apellido, String cargo) {
		super(nombre, apellido, cargo);
		
	}
	
	public static void moverProductoTienda(Producto p) {
		String estado = p.getEstado();
		String nombre = p.getNombre();
		
		if(estado == "almacenado") {
			p.cambiarEstado("repuesto");
			System.out.println("Se ha repuesto el producto " + nombre + " en los pasillos");
		}
	}
}
