package pet.clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pet.clinic.datasource.FakeData;

@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(PetClinicApplication.class, args);



        System.out.println("Rodou!");

        FakeData fakeData = ctx.getBean(FakeData.class);

        System.out.println(fakeData.getUserName());
        System.out.println(fakeData.getPassword());
        System.out.println(fakeData.getJdbc());

    }

}
