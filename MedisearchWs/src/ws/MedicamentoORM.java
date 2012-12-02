package ws;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

import org.orm.PersistentException;

import orm.DAOFactory;
import orm.Medicamento;

import SOAPVO.MedicamentoVO;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MedicamentoORM {

	/**
	 * @param args
	 */

		
		/**
		 * Muestra una lista con los pacientes de la base, nombre y rut
		 */

		public String getListaMedicamentos(){
			String ret="";
			Collection<MedicamentoVO> coleccionPaciente = new ArrayList<MedicamentoVO>();
			
			//DAO factory
			orm.DAOFactory lDaoFactory = DAOFactory.getDAOFactory();

			try{

				//Obj ORM todos los paciente de la tabla Paciente
				Medicamento[] paciente = lDaoFactory.getMedicamentoDAO().listMedicamentoByQuery(null, null);

				//
				for(int i=0;i<paciente.length;i++){
					
					System.out.println(paciente[i].getPrincipio_activo() + "producto:" + paciente[i].getProducto());
					
					MedicamentoVO obj = MedicamentoVO.crearMedicamento(paciente[i]);
					coleccionPaciente.add(obj);
					
				}

				ret = new Gson().toJson(coleccionPaciente);
			}catch(Exception e){
				System.out.println("Error ORM");

			}

			return ret;
		}

		
		public String buscarMedicamento(String prestacionJson)
				throws ParseException, PersistentException {
			String ret = "";
			Medicamento[] medicamentos;
			System.out.println("Json recibido: "+ prestacionJson);
			Collection<MedicamentoVO> coleccionPrestacion = new ArrayList<MedicamentoVO>();
			String medicamentoBuscar;
			
			// DAO factory
			orm.DAOFactory lDaoFactory = DAOFactory.getDAOFactory();
			// /////////////////////////////////////
		
			if (prestacionJson != null && !prestacionJson.isEmpty()) {
				JsonParser jsonParser = new JsonParser();
				JsonObject jsonBuscarPrestacion = jsonParser.parse(prestacionJson)
						.getAsJsonObject();
				// Validar parametros recibidos no nulos
				
				if (jsonBuscarPrestacion.has("stringBusqueda")) {
					
					
					medicamentoBuscar = jsonBuscarPrestacion.get("stringBusqueda")
							.getAsString();
					System.out.println(medicamentoBuscar);
					
					
					
					System.out.println("entrando al try");

					try {
						// Obj ORM todos los paciente de la tabla Paciente

					//	paciente = lDaoFactory.getMedicamentoDAO()
					//			.listMedicamentoByQuery("SELECT * FROM medicamento WHERE producto LIKE '%"+medicamentoBuscar+"% '", null);
						
						medicamentos = lDaoFactory.getMedicamentoDAO()
								.listMedicamentoByQuery("Medicamento.producto LIKE '%"+medicamentoBuscar+"%'", null);

						System.out.println("medicamentos encontrados: " + medicamentos.length);

						for (int i = 0; i < medicamentos.length; i++) {
							
						
							MedicamentoVO objPrestacion = MedicamentoVO.crearMedicamento(medicamentos[i]);
													
							coleccionPrestacion.add(objPrestacion);
							
							System.out.println(coleccionPrestacion.toString());

						}
						
					
						ret = new Gson().toJson(coleccionPrestacion);
						System.out.println("retorno; "+ret.toString());
					} catch (Exception e) {
						System.out.println("Error ORM");
					}

					return ret;
				}
			}
			return ret;
		}
		
		
		public String buscarGenericoPorUso(String stringUsoJson)
				throws ParseException, PersistentException {
			String ret = "";
			Medicamento[] medicamentos;
			System.out.println("Json recibido: "+ stringUsoJson);
			Collection<MedicamentoVO> coleccionPrestacion = new ArrayList<MedicamentoVO>();
			String medicamentoBuscar;
			
			// DAO factory
			orm.DAOFactory lDaoFactory = DAOFactory.getDAOFactory();
			// /////////////////////////////////////
		
			if (stringUsoJson != null && !stringUsoJson.isEmpty()) {
				JsonParser jsonParser = new JsonParser();
				JsonObject jsonBuscarPrestacion = jsonParser.parse(stringUsoJson)
						.getAsJsonObject();
				// Validar parametros recibidos no nulos
				
				if (jsonBuscarPrestacion.has("stringBusqueda")) {
					
					
					medicamentoBuscar = jsonBuscarPrestacion.get("stringBusqueda")
							.getAsString();
					System.out.println(medicamentoBuscar);
					
					
					
					System.out.println("entrando al try");

					try {
				
						medicamentos = lDaoFactory.getMedicamentoDAO()
								.listMedicamentoByQuery("Medicamento.uso_tratamiento LIKE '%"+medicamentoBuscar+"%'", null);

						System.out.println("medicamentos encontrados: " + medicamentos.length);

						for (int i = 0; i < medicamentos.length; i++) {
							
						
							MedicamentoVO objPrestacion = MedicamentoVO.crearMedicamento(medicamentos[i]);
													
							coleccionPrestacion.add(objPrestacion);
							
							System.out.println(coleccionPrestacion.toString());

						}
						
					
						ret = new Gson().toJson(coleccionPrestacion);
						System.out.println("retorno; "+ret.toString());
					} catch (Exception e) {
						System.out.println("Error ORM");
					}

					return ret;
				}
			}
			return ret;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


