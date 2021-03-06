package logistica.common.dao;

import java.util.List;
import java.util.Map;

import logistica.common.BaseModel;

import org.springframework.dao.DataAccessException;

public interface BaseModelDAO<T extends BaseModel> {

	T find(Long id) throws DataAccessException;

	T findFULL(Long id) throws DataAccessException;

	List<T> getList() throws DataAccessException;

	T save(T object) throws DataAccessException;

	void saveList(List<T> objectList) throws DataAccessException;

	T edit(T object) throws DataAccessException;

	void delete(T object) throws DataAccessException;

	List<T> getList(String query) throws DataAccessException;

	T get(String query) throws DataAccessException;

	T get(Object query) throws DataAccessException;

	List<T> getList(Object query) throws DataAccessException;

	Long count() throws DataAccessException;

	public Long count(Map<String, Object> filters, Boolean startMode)
			throws DataAccessException;

	List<T> getList(int first, int pageSize, String sortField,
			boolean sortOrder, Map<String, Object> filters, Boolean startMode)
			throws DataAccessException;

	public List<T> getList(Object query, Object query2)
			throws DataAccessException;

	List<Object[]> getListQuery(Object query) throws DataAccessException;

	List<Object[]> getList2Query(Object query) throws DataAccessException;

	public Long count(Object query) throws DataAccessException;

	public Long count(Object query, Object param) throws DataAccessException;

	public Long count(String query) throws DataAccessException;

	public Long count(String query, Object param) throws DataAccessException;

}
