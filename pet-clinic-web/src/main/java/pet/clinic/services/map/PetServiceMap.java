package pet.clinic.services.map;

import pet.clinic.model.Pet;
import org.springframework.stereotype.Service;
import pet.clinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService {
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
