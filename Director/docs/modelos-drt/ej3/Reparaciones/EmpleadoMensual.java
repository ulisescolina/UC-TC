package Reparaciones;

import java.util.List;
import java.util.ArrayList;

public class EmpleadoMensual extends Tecnico{
	private double sueldoMensual;

	public EmpleadoMensual(String nombres, String apellidos,
			String documentoUnico, double sueldoMensual, boolean activo) {
		super(nombres, apellidos, documentoUnico, activo);
		this.sueldoMensual = sueldoMensual;
	}

	public String getNombre() {
		return this.nombres;
	}

	public void setNombre(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDocumentoUnico() {
		return this.documentoUnico;
	}

	public void setDocumentoUnico (String documentoUnico) {
		this.documentoUnico = documentoUnico;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public double getSueldoMensual() {
		return this.sueldoMensual;
	}

	public boolean getActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	/*Implementacion metodos abstractos de la superclase*/
	@Override
	public List<TipoDeArticulo> getArtEsp() {
		return this.artEsp;
	}

	@Override
	public void agregarArtEsp(TipoDeArticulo artEsp){
		this.articulosEspecializados.add(artEsp);
	}

	@Override
	public void quitarArtEsp(TipoDeArticulo artEsp) {
		this.articulosEspecializados.remove(artEsp);
	}

	@Override
	public List<TareaARealizar> getTareas() {
		return this.tareas;
	}

	@Override
	public void agregarTarea(TareaARealizar tarea) {
		this.tareas.add(tarea);
	}

	@Override
	public void quitarTarea(TareaARealizar tarea) {
		this.tareas.remove(tarea);
	}
}
