package Reparaciones;

import java.util.List;
import java.util.ArrayList;

public class TipoDeArticulo{
	private String codigo;
	private String nombre;
	private List<Articulo> articulos;
	private List<Tecnico> tecnicos;
	private List<TareaDefinida> tDA;

	public TipoDeArticulo(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.articulos = new ArrayList<>();
		this.tDA = new ArrayList<>();
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Articulo> getArticulos() {
		return this.articulos;
	}

	public void agregarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
	}

	public void quitarArticulo(Articulo articulo) {
		this.articulos.remove(articulo);
	}

	public List<TareaDefinida> getTDA() {
		return this.tDA;
	}

	public void agregarTDA(TareaDefinida TDA) {
		this.tDA.add(TDA);
	}

	public void quitarTDA(TareaDefinida TDA){
		this.tDA.remove(TDA);
	}
}
