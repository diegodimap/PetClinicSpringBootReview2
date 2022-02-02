package pet.clinic.services;

import org.springframework.stereotype.Service;
import pet.clinic.model.Pet;

import java.util.Set;

@Service
public class CatPetService implements PetService{

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findById(Long aLong) {
        return null;
    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public void delete(Pet object) {

    }
}
