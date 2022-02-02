package pet.clinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pet.clinic.model.Owner;
import pet.clinic.model.Vet;
import pet.clinic.services.OwnerService;
import pet.clinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    
    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception{
        Owner Owner1 = new Owner();
        Owner1.setId(1L);
        Owner1.setFirstName("Diego");
        Owner1.setFirstName("Oliveira");

        ownerService.save(Owner1);

        Owner Owner2 = new Owner();
        Owner2.setId(2L);
        Owner2.setFirstName("Flávia");
        Owner2.setFirstName("Angélica");

        ownerService.save(Owner2);

        System.out.println("loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Guilherme");
        vet1.setLastName("Toro");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Guilherme2");
        vet2.setLastName("Toro2");

        vetService.save(vet2);

        System.out.println("loaded vets...");

    }


}
