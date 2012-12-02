/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateMedisearchData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.MedisearchPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.MedicamentoDAO lormMedicamentoDAO = lDAOFactory.getMedicamentoDAO();
			orm.Medicamento lormMedicamento = lormMedicamentoDAO.createMedicamento();
			// Initialize the properties of the persistent object here
			lormMedicamentoDAO.save(lormMedicamento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMedisearchData createMedisearchData = new CreateMedisearchData();
			try {
				createMedisearchData.createTestData();
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
