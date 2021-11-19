package services.map;

import model.Owner;
import services.CrudServices;

import java.util.Set;

public class OwnerServiceMap extends AbstractServiceMap <Owner, Long> implements CrudServices <Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.deleteObject(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
