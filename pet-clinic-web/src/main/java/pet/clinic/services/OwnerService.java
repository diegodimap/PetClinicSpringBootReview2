package pet.clinic.services;


import pet.clinic.model.Owner;

public interface OwnerService extends CrudServices<Owner, Long>{

    Owner findByLastName(String lastName);

}
