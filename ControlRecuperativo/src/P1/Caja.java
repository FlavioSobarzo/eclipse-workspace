package P1;

public class Caja extends Empleado{
	
	public Caja(String nombre, String apellido,String cargo) {
		super(nombre, apellido, cargo);
		
	}
	
	public static void VenderProducto(Producto p, Reposicion r, Bodega b) {
		String estado = p.getEstado();
		String nombre = p.getNombre();
		if(estado == "repuesto") {
			p.cambiarEstado("vendido");
			System.out.println("Se ha vendido " + nombre);
		}
		else if(estado == "almacenado"){
			System.out.println("<<El producto se encuentra almacenado en bodega");
			System.out.println("Se llamara al reponedor para traer el producto>>");
			r.moverProductoTienda(p);
			VenderProducto(p, r, b);
		}
		else if(estado == "recibido"){
			System.out.println("<<El producto ha sido resibido");
			System.out.println("Se llamara para traer el producto>>");
			b.moverProductoBodega(p);
			r.moverProductoTienda(p);
			VenderProducto(p, r, b);
		}
		else if(estado == "vendido"){
			System.out.println("No se encuntra " + nombre + ", se necesita consegir más");
		}
	}
}
