package com.example.medisearch2;

public class Medicamento {

	/**
	 * @param args
	 */
	
private static final long serialVersionUID = 6785087221236734704L;
	
	
	private int id;
	private String principioActivo;
	private String Producto ;
	private String Registro;
	private String Titular;
	private String Resolución;
	private String fecharesolución;
	private String usoTratamiento;
	
	
	
	@Override
	public String toString() {
		return "Medicamento [id=" + id + ", principioActivo=" + principioActivo
				+ ", Producto=" + Producto + ", Registro=" + Registro
				+ ", Titular=" + Titular + ", Resolución=" + Resolución
				+ ", fecharesolución=" + fecharesolución + ", usoTratamiento="
				+ usoTratamiento + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getPrincipioActivo() {
		return principioActivo;
	}



	public void setPrincipioActivo(String principioActivo) {
		this.principioActivo = principioActivo;
	}



	public String getProducto() {
		return Producto;
	}



	public void setProducto(String producto) {
		Producto = producto;
	}



	public String getRegistro() {
		return Registro;
	}



	public void setRegistro(String registro) {
		Registro = registro;
	}



	public String getTitular() {
		return Titular;
	}



	public void setTitular(String titular) {
		Titular = titular;
	}



	public String getResolución() {
		return Resolución;
	}



	public void setResolución(String resolución) {
		Resolución = resolución;
	}



	public String getFecharesolución() {
		return fecharesolución;
	}



	public void setFecharesolución(String fecharesolución) {
		this.fecharesolución = fecharesolución;
	}



	public String getUsoTratamiento() {
		return usoTratamiento;
	}



	public void setUsoTratamiento(String usoTratamiento) {
		this.usoTratamiento = usoTratamiento;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
