package yncrea.lab02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yncrea.lab02.app.QuoteApplication;
import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.provider.CNFProvider;

@Configuration
public class AppConfig {

    @Bean
    public QuoteProvider provider(){
        return new CNFProvider();
    }

    @Bean
    public QuoteService service(QuoteProvider provider){
        return new QuoteServiceImpl(provider);
    }

    @Bean
    public QuoteApplication application(QuoteService service){
        return new QuoteApplication(service);
    }
}
