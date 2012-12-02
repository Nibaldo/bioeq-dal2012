/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteMedisearchData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.MedisearchPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.DAOFactory lDAOFactory = orm.DAOFactory.getDAOFactory();
			orm.dao.MedicamentoDAO lormMedicamentoDAO = lDAOFactory.getMedicamentoDAO();
			orm.Medicamento lormMedicamento = lormMedicamentoDAO.loadMedicamentoByQuery(null, null);
			// Delete the persistent object
			lormMedicamentoDAO.delete(lormMedicamento);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMedisearchData deleteMedisearchData = new DeleteMedisearchData();
			try {
				deleteMedisearchData.deleteTestData();
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
