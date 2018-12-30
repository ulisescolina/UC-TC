package Reparaciones;

import java.util.List;
import java.util.ArrayList;

public class Articulo{
	private String nombre;
	private TipoDeArticulo tipo;
	private List<Reclamo> reclamos;

	public Articulo(String nombre){
		this.nombre = nombre;
		this.tipo = null;
		this.reclamos = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Articulo getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoDeArticulo tipo ) {
		this.tipo = tipo;
	}

	public List<Reclamo> getReclamos(){
		return this.reclamos;
	}

	public void agregarReclamo(Reclamo reclamo) {
		this.reclamos.add(reclamo);
	}

	public void quitarReclamo(Reclamo reclamo){
		if (this.reclamos.contains(reclamo)) {
			this.reclamos.remove(reclamo);
		} else {
			System.err.print("Error: no se encuentra el reclamo "+
				reclamo+" en la lista de reclamos del articulo");
		}
	}
}
