package P1;

public class Producto {
	
	private String nombre;
	private int fechaIngreso;
	private int fechaFabricacion;
	private int fechaVencimiento;
	private String estado;

	public Producto(String nombre,int fechaIngreso,int fechaFabricacion, int fechaVencimiento, String estado) {
		
		this.nombre = nombre;
		this.fechaFabricacion = fechaFabricacion;
		this.fechaIngreso = fechaIngreso;
		this.fechaVencimiento = fechaVencimiento;
		this.estado = estado;
		
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getFechaVencimiento() {
		return this.fechaVencimiento;
	}
	
	public void cambiarEstado(String nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	
	public void mostrarEstado() {
		System.out.println("El estado de " + nombre + " es " + estado);
	}
}
