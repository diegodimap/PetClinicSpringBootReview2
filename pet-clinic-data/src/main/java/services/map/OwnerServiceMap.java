package services.map;

import model.OwnerPet;
import services.CrudServices;

import java.util.Set;

public class OwnerServiceMap extends AbstractServiceMap <OwnerPet, Long> implements CrudServices<OwnerPet, Long> {

    @Override
    public Set<OwnerPet> findAll() {
        return super.findAll();
    }

    @Override
    public OwnerPet save(OwnerPet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(OwnerPet object) {
        super.deleteObject(object);
    }

    @Override
    public OwnerPet findById(Long id) {
        return super.findById(id);
    }
}
