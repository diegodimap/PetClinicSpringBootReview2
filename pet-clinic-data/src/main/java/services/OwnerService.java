package services;

import model.Owner;

import java.util.Set;

public interface OwnerService extends CrudServices<Owner, Long>{

    Owner findByLastName(String lastName);

}
