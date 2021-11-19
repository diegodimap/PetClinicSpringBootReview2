package services.map;

import model.Pet;
import services.CrudServices;

import java.util.Set;

public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements CrudServices <Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.deleteObject(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
