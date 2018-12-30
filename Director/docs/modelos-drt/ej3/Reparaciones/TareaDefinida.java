package Reparaciones;

import java.util.List;
import java.util.ArrayList;

public class TareaDefinida{
	private String codigoUnico;
	private String nombre;
	private String descripcion;
	private TipoDeArticulo tAA;
	private List<TareaARealizar> tareas = new ArrayList<>();

	public TareaDefinida(String codigo, String nombre,
			String descripcion) {
		this.codigoUnico = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tAA = null;
	}

	public String getCodigoUnico() {
		return this.codigoUnico;
	}

	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoDeArticulo getTipoArticuloAsociado() {
		return this.tAA;
	}

	public void setTipoArticuloAsociado(TipoDeArticulo tAA) {
		this.tAA = tAA;
	}

	public List<TareaARealizar> getTareas() {
		return this.tareas;
	}

	public void agregarTarea(TareaARealizar tarea) {
		this.tareas.add(tarea);
	}

	public void quitarTarea(TareaARealizar tarea){
		if (this.tareas.contains(tarea)) {
			this.tareas.remove(tarea);
		} else {
			System.err.print("Error: no se encuentra la tarea "+
				tarea+" en la lista de tareas de la tarea definida");
		}
	}
}
