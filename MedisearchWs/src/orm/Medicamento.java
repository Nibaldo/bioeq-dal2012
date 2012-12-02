/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package orm;

import java.io.Serializable;
public class Medicamento implements Serializable {
	public Medicamento() {
	}
	
	private Integer id;
	
	private String principio_activo;
	
	private String producto;
	
	private String registro;
	
	private String resolucion;
	
	private String fecha_resolucion;
	
	private String uso_tratamiento;
	
	private String titular;
	
	public void setId(int value) {
		setId(new Integer(value));
	}
	
	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setPrincipio_activo(String value) {
		this.principio_activo = value;
	}
	
	public String getPrincipio_activo() {
		return principio_activo;
	}
	
	public void setProducto(String value) {
		this.producto = value;
	}
	
	public String getProducto() {
		return producto;
	}
	
	public void setRegistro(String value) {
		this.registro = value;
	}
	
	public String getRegistro() {
		return registro;
	}
	
	public String getORMID() {
		return getRegistro();
	}
	
	public void setResolucion(String value) {
		this.resolucion = value;
	}
	
	public String getResolucion() {
		return resolucion;
	}
	
	public void setFecha_resolucion(String value) {
		this.fecha_resolucion = value;
	}
	
	public String getFecha_resolucion() {
		return fecha_resolucion;
	}
	
	public void setUso_tratamiento(String value) {
		this.uso_tratamiento = value;
	}
	
	public String getUso_tratamiento() {
		return uso_tratamiento;
	}
	
	public void setTitular(String value) {
		this.titular = value;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public String toString() {
		return String.valueOf(getRegistro());
	}
	
}
