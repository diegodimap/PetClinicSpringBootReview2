package services.map;

import model.Vet;
import services.CrudServices;

import java.util.Set;

public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements CrudServices<Vet, Long> {

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
