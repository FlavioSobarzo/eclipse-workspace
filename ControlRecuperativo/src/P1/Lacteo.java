package P1;

public class Lacteo extends Producto{

	private String marca;
	
	public Lacteo(String nombre, int fechaIngreso,int fechaFabricacion, int fechaVencimiento, String estado, String marca) {
		super(nombre, fechaIngreso, fechaFabricacion, fechaVencimiento, estado);
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
}
