package Reparaciones;

import java.util.List;
import java.util.ArrayList;

public abstract class Tecnico{
	protected String nombres;
	protected String apellidos;
	protected String documentoUnico;
	protected boolean activo;
	protected List<TipoDeArticulo> artEsp;
	protected List<TareaARealizar> tareas;

	protected Tecnico(String nombres, String apellidos,
			String documentoUnico, boolean activo) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.documentoUnico = documentoUnico;
		this.activo = activo;
		this.artEsp = new ArrayList<>();
		this.tareas = new ArrayList<>();
	}

	protected abstract List<TipoDeArticulo> getArtEsp();
	protected abstract void agregarArtEsp(TipoDeArticulo artEsp);
	protected abstract void quitarArtEsp(TipoDeArticulo artEsp);

	protected abstract List<TareaARealizar> getTareas();
	protected abstract void agregarTarea(TareaARealizar tarea);
	protected abstract void quitarTarea(TareaARealizar tarea);
}
