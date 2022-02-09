package pet.clinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import pet.clinic.datasource.FakeData;

import java.util.Locale;

//@PropertySource("classpath:datasource.properties") se comentar aqui ele vai rodar o valor do application.properties active
@Configuration
public class DatabaseConfigurationService implements WebMvcConfigurer {

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

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.US);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

}
