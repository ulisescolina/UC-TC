package Facturacion;

import java.util.ArrayList;
import java.util.List;

public class Factura{
	private int id;
	private int numero;
	private TipoFactura tipoFactura;
	private List<Producto> productos;

	// Constructor por defecto
	public Factura(int id, int numero
			TipoFactura tipoFactura) {
		this.id = id;
		this.numero = numero;
		this.productos = new ArrayList<>();
	}

	public int getId(){
		return this.id;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public TipoFactura getTipoFactura(){
		return this.tipoFactura;
	}

	public void setTipoFactura(TipoFactura tipoFactura){
		this.tipoFactura = tipoFactura;
	}
	public List<Producto> getProductos(){
		return this.productos;
	}

	public void quitarProducto(Producto producto){
		if (this.productos.contains(producto)) {
			this.productos.remove(producto);
		} else {
			System.err.print("Error: no se encuentra el Producto "+
				producto+" en la lista de Productos de la factura");
		}
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
}
