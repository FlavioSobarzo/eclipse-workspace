package P1;

public class Bodega extends Empleado{

	
	public Bodega(String nombre, String apellido, String cargo) {
		super(nombre, apellido, cargo);
		
	}
	
	public static void moverProductoBodega(Producto p) {
		String estado = p.getEstado();
		String nombre = p.getNombre();
		
		if(estado == "recibido") {
			p.cambiarEstado("almacenado");
			System.out.println("Se ha almacenado el producto " + nombre + " en la bodega");
		}
	}
}

