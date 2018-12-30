package Facturacion;

import java.util.ArrayList;
import java.util.List;

public class DescripcionProducto{
	private int id;
	private String descripcion;
	private String codigo;
	private Double precio;
	private List<Producto> productos = new ArrayList<>();

	// Constructor por defecto
	public DescripcionProducto(int id, String descripcion,
			String codigo, Double precio) {
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.precio = precio;
	}

	public int getId() {
		return this.id;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void seCodigo(String codigo){
		this.codigo = codigo;
	}

	public Double getPrecio(){
		return this.precio;
	}

	public void setPrecio(Double precio){
		this.precio = precio;
	}


	public List<Producto> getProductos(){
		return this.productos;
	}

	public void quitarProducto(Producto p){
		if (this.productos.contains(p)) {
			this.productos.remove(p);
		} else {
			System.err.print("Error: no se encuentra el Producto "+p
				+" en la lista de Productos en esta descripcion");
		}
	}

	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
}
