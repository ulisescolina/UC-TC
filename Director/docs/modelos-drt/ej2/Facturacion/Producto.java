package Facturacion;
public class Producto{
	private int id;
	private int cantidad;
	private DescripcionProducto descripcion;

	// Constructor por defecto
	public Producto(int id, int cantidad,
			DescripcionProducto descripcion) {
		this.id = id;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
	}

	public int getId(){
		return this.id;
	}

	public int getCantidad(){
		return this.cantidad;
	}

	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}

	public DescripcionProducto getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(DescripcionProducto dp){
		this.descripcion = dp;
	}
}
