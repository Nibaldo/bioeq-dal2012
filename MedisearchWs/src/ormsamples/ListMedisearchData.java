/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListMedisearchData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
		System.out.println("Listing Medicamento...");
		orm.Medicamento[] ormMedicamentos = lDAOFactory.getMedicamentoDAO().listMedicamentoByQuery(null, null);
		int length = Math.min(ormMedicamentos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMedicamentos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Medicamento by Criteria...");
		orm.MedicamentoCriteria medicamentoCriteria = new orm.MedicamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//medicamentoCriteria.registro.eq();
		medicamentoCriteria.setMaxResults(ROW_COUNT);
		orm.Medicamento[] ormMedicamentos = medicamentoCriteria.listMedicamento();
		int length =ormMedicamentos== null ? 0 : Math.min(ormMedicamentos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMedicamentos[i]);
		}
		System.out.println(length + " Medicamento record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMedisearchData listMedisearchData = new ListMedisearchData();
			try {
				listMedisearchData.listTestData();
				//listMedisearchData.listByCriteria();
			}
			finally {
				orm.MedisearchPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
