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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MedicamentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression principio_activo;
	public final StringExpression producto;
	public final StringExpression registro;
	public final StringExpression resolucion;
	public final StringExpression fecha_resolucion;
	public final StringExpression uso_tratamiento;
	public final StringExpression titular;
	
	public MedicamentoDetachedCriteria() {
		super(orm.Medicamento.class, orm.MedicamentoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		principio_activo = new StringExpression("principio_activo", this.getDetachedCriteria());
		producto = new StringExpression("producto", this.getDetachedCriteria());
		registro = new StringExpression("registro", this.getDetachedCriteria());
		resolucion = new StringExpression("resolucion", this.getDetachedCriteria());
		fecha_resolucion = new StringExpression("fecha_resolucion", this.getDetachedCriteria());
		uso_tratamiento = new StringExpression("uso_tratamiento", this.getDetachedCriteria());
		titular = new StringExpression("titular", this.getDetachedCriteria());
	}
	
	public MedicamentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.MedicamentoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		principio_activo = new StringExpression("principio_activo", this.getDetachedCriteria());
		producto = new StringExpression("producto", this.getDetachedCriteria());
		registro = new StringExpression("registro", this.getDetachedCriteria());
		resolucion = new StringExpression("resolucion", this.getDetachedCriteria());
		fecha_resolucion = new StringExpression("fecha_resolucion", this.getDetachedCriteria());
		uso_tratamiento = new StringExpression("uso_tratamiento", this.getDetachedCriteria());
		titular = new StringExpression("titular", this.getDetachedCriteria());
	}
	
	public Medicamento uniqueMedicamento(PersistentSession session) {
		return (Medicamento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Medicamento[] listMedicamento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Medicamento[]) list.toArray(new Medicamento[list.size()]);
	}
}

