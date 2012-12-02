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
package orm.dao;

import org.orm.*;
import orm.*;

public interface MedicamentoDAO {
	public Medicamento loadMedicamentoByORMID(String registro) throws PersistentException;
	public Medicamento getMedicamentoByORMID(String registro) throws PersistentException;
	public Medicamento loadMedicamentoByORMID(String registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento getMedicamentoByORMID(String registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento loadMedicamentoByORMID(PersistentSession session, String registro) throws PersistentException;
	public Medicamento getMedicamentoByORMID(PersistentSession session, String registro) throws PersistentException;
	public Medicamento loadMedicamentoByORMID(PersistentSession session, String registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento getMedicamentoByORMID(PersistentSession session, String registro, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento[] listMedicamentoByQuery(String condition, String orderBy) throws PersistentException;
	public Medicamento[] listMedicamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento[] listMedicamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Medicamento[] listMedicamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento loadMedicamentoByQuery(String condition, String orderBy) throws PersistentException;
	public Medicamento loadMedicamentoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento loadMedicamentoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Medicamento loadMedicamentoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Medicamento createMedicamento();
	public boolean save(orm.Medicamento medicamento) throws PersistentException;
	public boolean delete(orm.Medicamento medicamento) throws PersistentException;
	public boolean refresh(orm.Medicamento medicamento) throws PersistentException;
	public boolean evict(orm.Medicamento medicamento) throws PersistentException;
	public Medicamento loadMedicamentoByCriteria(MedicamentoCriteria medicamentoCriteria);
	public Medicamento[] listMedicamentoByCriteria(MedicamentoCriteria medicamentoCriteria);
}
