/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package orm;

import orm.impl.*;
import orm.dao.*;

public class DAOFactoryImpl extends DAOFactory {
	private MedicamentoDAO _medicamentoDAO = new MedicamentoDAOImpl();
	public MedicamentoDAO getMedicamentoDAO() {
		return _medicamentoDAO;
	}
	
}

