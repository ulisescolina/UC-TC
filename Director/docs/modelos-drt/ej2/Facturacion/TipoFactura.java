package Facturacion;
public class TipoFactura {
	private int id;
	private String descripcion;
	/**
	* Se utiliza para establecer cual sera el porcentaje
	* del impuesto que se cobrara en la factura.
	*/
	private double pImpuesto;

	// Constructor por defecto
	public TipoFactura(int id, String descripcion,
			double pImpuesto){
		this.id = id;
		this.descripcion = descripcion;
		this.pImpuesto = pImpuesto;
	}

	public int getId(){
		return this.id;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public double getPImpuesto(){
		return this.pImpuesto;
	}

	public void setPImpuesto(double pi){
		this.pImpuesto = pi;
	}
}
