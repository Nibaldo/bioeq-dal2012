/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateMedisearchDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(orm.MedisearchPersistentManager.instance());
			orm.MedisearchPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
