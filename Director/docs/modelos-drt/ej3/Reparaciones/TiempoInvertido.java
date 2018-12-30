package Reparaciones;

import java.util.Date;

public class TiempoInvertido{
	private double horasInvertidas;
	private Date fecha;
	private TareaARealizar tarea;

	public TiempoInvertido(TareaARealizar tarea,
		double horasInvertidas, Date fecha) {
		this.horasInvertidas = horasInvertidas;
		this.fecha = null;
		this.tarea = tarea;
	}

	public double getHorasInvertidas() {
		return this.horasInvertidas;
	}

	public void setHorasInvertidas(double horasInvertidas) {
		this.horasInvertidas = horasInvertidas;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date nFecha) {
		this.fecha = nFecha;
	}

	public TareaARealizar getTarea() {
		return this.tarea;
	}

	public void setTarea(TareaARealizar tarea) {
		this.tarea = tarea;
	}
}
