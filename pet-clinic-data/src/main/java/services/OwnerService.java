package services;

import model.OwnerPet;

public interface OwnerService extends CrudServices<OwnerPet, Long>{

    OwnerPet findByLastName(String lastName);

}
