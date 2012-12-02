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
package orm.impl;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import orm.*;

public class MedicamentoDAOImpl implements orm.dao.MedicamentoDAO {
	public Medicamento loadMedicamentoByORMID(String registro) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return loadMedicamentoByORMID(session, registro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento getMedicamentoByORMID(String registro) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return getMedicamentoByORMID(session, registro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento loadMedicamentoByORMID(String registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return loadMedicamentoByORMID(session, registro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento getMedicamentoByORMID(String registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return getMedicamentoByORMID(session, registro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento loadMedicamentoByORMID(PersistentSession session, String registro) throws PersistentException {
		try {
			return (Medicamento) session.load(orm.Medicamento.class, registro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento getMedicamentoByORMID(PersistentSession session, String registro) throws PersistentException {
		try {
			return (Medicamento) session.get(orm.Medicamento.class, registro);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento loadMedicamentoByORMID(PersistentSession session, String registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medicamento) session.load(orm.Medicamento.class, registro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento getMedicamentoByORMID(PersistentSession session, String registro, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medicamento) session.get(orm.Medicamento.class, registro, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento[] listMedicamentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return listMedicamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento[] listMedicamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return listMedicamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento[] listMedicamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medicamento as Medicamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Medicamento[]) list.toArray(new Medicamento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento[] listMedicamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medicamento as Medicamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Medicamento[]) list.toArray(new Medicamento[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento loadMedicamentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return loadMedicamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento loadMedicamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return loadMedicamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento loadMedicamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Medicamento[] medicamentos = listMedicamentoByQuery(session, condition, orderBy);
		if (medicamentos != null && medicamentos.length > 0)
			return medicamentos[0];
		else
			return null;
	}
	
	public Medicamento loadMedicamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Medicamento[] medicamentos = listMedicamentoByQuery(session, condition, orderBy, lockMode);
		if (medicamentos != null && medicamentos.length > 0)
			return medicamentos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedicamentoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return iterateMedicamentoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.MedisearchPersistentManager.instance().getSession();
			return iterateMedicamentoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medicamento as Medicamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedicamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Medicamento as Medicamento");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento createMedicamento() {
		return new orm.Medicamento();
	}
	
	public boolean save(orm.Medicamento medicamento) throws PersistentException {
		try {
			orm.MedisearchPersistentManager.instance().saveObject(medicamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(orm.Medicamento medicamento) throws PersistentException {
		try {
			orm.MedisearchPersistentManager.instance().deleteObject(medicamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(orm.Medicamento medicamento) throws PersistentException {
		try {
			orm.MedisearchPersistentManager.instance().getSession().refresh(medicamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(orm.Medicamento medicamento) throws PersistentException {
		try {
			orm.MedisearchPersistentManager.instance().getSession().evict(medicamento);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Medicamento loadMedicamentoByCriteria(MedicamentoCriteria medicamentoCriteria) {
		Medicamento[] medicamentos = listMedicamentoByCriteria(medicamentoCriteria);
		if(medicamentos == null || medicamentos.length == 0) {
			return null;
		}
		return medicamentos[0];
	}
	
	public Medicamento[] listMedicamentoByCriteria(MedicamentoCriteria medicamentoCriteria) {
		return medicamentoCriteria.listMedicamento();
	}
}
