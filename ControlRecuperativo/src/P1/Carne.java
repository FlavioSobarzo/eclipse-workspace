package P1;

public class Carne extends Producto{

	private String marca;
	
	public Carne(String nombre, int fechaIngreso, int fechaFabricacion, int fechaVencimiento, String estado, String marca) {
		super(nombre, fechaIngreso, fechaFabricacion, fechaVencimiento, estado);
		this.marca = marca;
		
	}
	
	public String getMarca() {
		return this.marca;
	}
	
}
