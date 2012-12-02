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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MedicamentoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression principio_activo;
	public final StringExpression producto;
	public final StringExpression registro;
	public final StringExpression resolucion;
	public final StringExpression fecha_resolucion;
	public final StringExpression uso_tratamiento;
	public final StringExpression titular;
	
	public MedicamentoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		principio_activo = new StringExpression("principio_activo", this);
		producto = new StringExpression("producto", this);
		registro = new StringExpression("registro", this);
		resolucion = new StringExpression("resolucion", this);
		fecha_resolucion = new StringExpression("fecha_resolucion", this);
		uso_tratamiento = new StringExpression("uso_tratamiento", this);
		titular = new StringExpression("titular", this);
	}
	
	public MedicamentoCriteria(PersistentSession session) {
		this(session.createCriteria(Medicamento.class));
	}
	
	public MedicamentoCriteria() throws PersistentException {
		this(orm.MedisearchPersistentManager.instance().getSession());
	}
	
	public Medicamento uniqueMedicamento() {
		return (Medicamento) super.uniqueResult();
	}
	
	public Medicamento[] listMedicamento() {
		java.util.List list = super.list();
		return (Medicamento[]) list.toArray(new Medicamento[list.size()]);
	}
}

