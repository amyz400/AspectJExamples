package aspectj.examples.tx.dao.service;

/**
 * Created by amy on 5/2/17.
 */
public interface CrudService<T> {

    Integer create(T entity);
    T read(Integer id);
    boolean update(T entity);
    boolean delete(Integer id);

}
