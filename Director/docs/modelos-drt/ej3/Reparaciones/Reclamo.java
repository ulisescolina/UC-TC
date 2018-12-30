package Reparaciones;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Reclamo{
	private int numero;
	private String descProblema;
	private Date fechaEntrada;
	private Date fechaEstimEntrega;
	private Articulo articulo;
	private List<TareaARealizar> tareas;

	public Reclamo(int numero, String descProblema,
			Date fechaEntrada, Date fechaEstimEntrega
			Articulo articulo){
		this.numero = numero;
		this.descProblema = descProblema;
		this.fechaEntrada = fechaEntrada;
		this.fechaEstimEntrega = fechaEstimEntrega;
		this.articulo = null;
		this.tareas  = new ArrayList<>();
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescProblema() {
		return this.descProblema;
	}

	public void setDescProblema(String descProblema) {
		this.descProblema = descProblema;
	}

	public Date getFechaEntrada() {
		return this.fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaEstimEntraga() {
		return this.fechaEstimEntrega;
	}

	public void setFechaEstimEntrega(Date fechaEstimEntrega) {
		this.fechaEstimEntrega = fechaEstimEntrega;
	}

	public List<TareaARealizar> getTareas(){
		return this.tareas;
	}

	public void quitarTarea(TareaARealizar tarea){
		if (this.tareas.contains(tarea)) {
			this.tareas.remove(tarea);
		} else {
			System.err.print("Error: no se encuentra la tarea "+
				tarea+" en la lista de tareas del reclamo");
		}
	}

	public void agregarTarea(TareaARealizar tarea) {
		this.tareas.add(tarea);
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
}
