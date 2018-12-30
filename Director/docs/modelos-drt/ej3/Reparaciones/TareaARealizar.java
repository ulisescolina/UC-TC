package Reparaciones;

import java.util.List;
import java.util.ArrayList;

public class TareaARealizar{
	private boolean finalizado;
	private Reclamo reclamo;
	private List<TiempoInvertido> tiempos;
	private TareaDefinida tarea;
	private Tecnico tecnico;

	public TareaARealizar(boolean finalizado, Reclamo reclamo,
			TareaDefinida tarea, Tecnico tecnico){
		this.finalizado = finalizado;
		this.reclamo = reclamo;
		this.tiempos= new ArrayList<>();
		this.tarea = tarea;
		this.tecnico = tecnico;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Reclamo getReclamo() {
		return this.reclamo;
	}

	public void setReclamo(Reclamo reclamo){
		this.reclamo = reclamo;
	}

	public TareaDefinida getTarea() {
		return this.tarea;
	}

	public void setTarea(TareaDefinida tarea){
		this.tarea = tarea;
	}

	public Tecnico getTecnico() {
		return this.tecnico;
	}

	public void setTecnico(Tecnico tecnico){
		this.tecnico = tecnico;
	}

	public List<TiempoInvertido> getTiempos() {
		return this.tiempos;
	}

	public void agregarTiempo(TiempoInvertido tiempo){
		this.tiempos.add(tiempo);
	}

	public void quitarTiempo(TiempoInvertido tiempo) {
		this.tiempos.remove(tiempo);
	}
}
