package SOAPVO;

public class MedicamentoVO {

	/**
	 * @param args
	 */
	
	private int id;
	private String principioActivo;
	private String Producto ;
	private String Registro;
	private String Titular;
	private String Resoluci�n;
	private String fecharesoluci�n;
	private String usoTratamiento;
	
	
	
	/**
	* Muestra los pacientes de la base de datos
	* @param {String} metodo nombre del metodo
	* @param {String} mensaje mensaje a mostrar
	* @returns {integer} el codigo de retorno 0
	*/
	
	public static MedicamentoVO crearMedicamento(orm.Medicamento medicamentoORM){
		MedicamentoVO obj = new MedicamentoVO();
		
		obj.setId(medicamentoORM.getId());
		obj.setPrincipioActivo(medicamentoORM.getPrincipio_activo());
		obj.setProducto(medicamentoORM.getProducto());
		obj.setUsoTratamiento(medicamentoORM.getUso_tratamiento());
		obj.setTitular(medicamentoORM.getTitular());
		obj.setRegistro(medicamentoORM.getRegistro());
		obj.setResoluci�n(medicamentoORM.getResolucion());
		obj.setFecharesoluci�n(medicamentoORM.getFecha_resolucion());

		return obj;

	}

	
	@Override
	public String toString() {
		return "Medicamento [id=" + id + ", principioActivo=" + principioActivo
				+ ", Producto=" + Producto + ", Registro=" + Registro
				+ ", Titular=" + Titular + ", Resoluci�n=" + Resoluci�n
				+ ", fecharesoluci�n=" + fecharesoluci�n + ", usoTratamiento="
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



	public String getResoluci�n() {
		return Resoluci�n;
	}



	public void setResoluci�n(String resoluci�n) {
		Resoluci�n = resoluci�n;
	}



	public String getFecharesoluci�n() {
		return fecharesoluci�n;
	}



	public void setFecharesoluci�n(String fecharesoluci�n) {
		this.fecharesoluci�n = fecharesoluci�n;
	}



	public String getUsoTratamiento() {
		return usoTratamiento;
	}



	public void setUsoTratamiento(String usoTratamiento) {
		this.usoTratamiento = usoTratamiento;

	}
}
