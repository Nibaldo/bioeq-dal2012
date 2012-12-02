/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMedisearchData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.MedisearchPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.MedicamentoDAO lormMedicamentoDAO = lDAOFactory.getMedicamentoDAO();
			orm.Medicamento lormMedicamento = lormMedicamentoDAO.loadMedicamentoByQuery(null, null);
			// Update the properties of the persistent object
			lormMedicamentoDAO.save(lormMedicamento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Medicamento by MedicamentoCriteria");
		orm.MedicamentoCriteria medicamentoCriteria = new orm.MedicamentoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//medicamentoCriteria.registro.eq();
		System.out.println(medicamentoCriteria.uniqueMedicamento());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMedisearchData retrieveAndUpdateMedisearchData = new RetrieveAndUpdateMedisearchData();
			try {
				retrieveAndUpdateMedisearchData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMedisearchData.retrieveByCriteria();
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
