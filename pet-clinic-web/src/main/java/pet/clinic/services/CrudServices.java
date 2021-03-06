package pet.clinic.services;

import java.util.Set;

public interface CrudServices <T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

}
