package logistica.common.dao;

import java.util.List;

import logistica.model.Localidad;
import logistica.query.LocalidadQuery;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;

public class LocalidadDAOImpl extends
		BaseHibernateDAO<Localidad, LocalidadQuery> {

	@Override
	public Class<Localidad> getModelClass() {
		return Localidad.class;
	}

	@SuppressWarnings("unchecked")
	public List<Localidad> getList(String nombreOID) throws DataAccessException {
		List<Localidad> list = null;

		DetachedCriteria criteria = DetachedCriteria.forClass(Localidad.class);
		criteria.add(Restrictions.ilike("descripcion", nombreOID,
				MatchMode.START));
		list = getHibernateTemplate().findByCriteria(criteria);
		return list;
	}
}