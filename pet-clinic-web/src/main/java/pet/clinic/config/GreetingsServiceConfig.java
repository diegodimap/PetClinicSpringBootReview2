package pet.clinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import pet.clinic.datasource.FakeData;

@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingsServiceConfig {

    @Bean
    FakeData fakeData(@Value("${guru.username}") String username,
                      @Value("${guru.password}") String password,
                      @Value("${guru.jdbc}") String jdbc){
        FakeData fakeData = new FakeData();
        fakeData.setUserName(username);
        fakeData.setPassword(password);
        fakeData.setJdbc(jdbc);

        return fakeData;
    }

}
