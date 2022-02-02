package pet.clinic.services.map;

import org.springframework.stereotype.Service;
import pet.clinic.model.Vet;
import pet.clinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteObject(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
