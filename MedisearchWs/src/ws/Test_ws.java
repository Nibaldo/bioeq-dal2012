package ws;

import java.text.ParseException;

import org.orm.PersistentException;

public class Test_ws {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MedicamentoORM tester = new MedicamentoORM();
		
	String buscar = "{"+"stringBusqueda"+":"+"Gofyl"+"}";
		
		try {
			tester.buscarMedicamento(buscar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
