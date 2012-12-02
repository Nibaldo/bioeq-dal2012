package ws;

import java.text.ParseException;

import java.util.HashMap;

import org.orm.PersistentException;




import com.google.gson.Gson;


public class MedicamentoORMWS {

	
	
	/**
	 * Gets the medicamento
	 *
	 * @return the medicamento
	 */
	public String getListaMedicamentos(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		MedicamentoORM paciente = new MedicamentoORM();
		map.put("Titulo", "Prestaciones");
		map.put("Subtitulo", "Prestaciones CLinicas");
		map.put("Fecha", "");
		map.put("Contenido", paciente.getListaMedicamentos());
		Gson gson = new Gson();
		return gson.toJson(map);
	}
	

	
	
	public String buscarMedicamento(String prestacionJson) throws ParseException, PersistentException{
		MedicamentoORM paciente = new MedicamentoORM();
	return paciente.buscarMedicamento(prestacionJson);
		
	}
	
	public String buscarGenericoPorUso(String prestacionJson) throws ParseException, PersistentException{
		MedicamentoORM paciente = new MedicamentoORM();
	return paciente.buscarGenericoPorUso(prestacionJson);
		
	}
	

}
