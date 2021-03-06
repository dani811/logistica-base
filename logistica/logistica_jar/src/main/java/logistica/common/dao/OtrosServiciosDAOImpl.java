package logistica.common.dao;

import java.util.Date;
import java.util.List;

import logistica.model.OtrosServicios;
import logistica.query.OtrosServiciosQuery;
import logistica.util.DateUtil;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataAccessException;

public class OtrosServiciosDAOImpl extends
		BaseHibernateDAO<OtrosServicios, OtrosServiciosQuery> {

	@Override
	public Class<OtrosServicios> getModelClass() {
		return OtrosServicios.class;
	}

	@SuppressWarnings("unchecked")
	public List<OtrosServicios> getList(Object query)
			throws DataAccessException {
		OtrosServiciosQuery otrosServiciosQuery = (OtrosServiciosQuery) query;

		List<OtrosServicios> list = null;

		DetachedCriteria criteria = DetachedCriteria
				.forClass(OtrosServicios.class);
		Date desde = DateUtil.getFirstTime(otrosServiciosQuery.getFecha());
		Date hasta = DateUtil.getLastTime(otrosServiciosQuery.getFecha());
		criteria.add(Restrictions.between("horarioEntrada", desde, hasta));

		list = getHibernateTemplate().findByCriteria(criteria);
		return list;
	}
}
