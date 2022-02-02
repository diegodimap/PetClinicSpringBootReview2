package pet.clinic.services.map;

import org.springframework.stereotype.Service;
import pet.clinic.model.Owner;
import pet.clinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractServiceMap <Owner, Long> implements OwnerService {

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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
