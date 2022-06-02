package com.revature.groupproject.daos;
import java.util.List;
public interface CRUDDao<T> {
    void save(T obj);

    void update(T obj);

    void delete(String id);

    List<T> getAll();

    List<T> getById(String id);

}
