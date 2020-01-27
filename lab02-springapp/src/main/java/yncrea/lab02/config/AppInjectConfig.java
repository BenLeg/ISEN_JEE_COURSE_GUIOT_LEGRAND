package yncrea.lab02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.provider.CNFProvider;

@Configuration
@ComponentScan(basePackages = "yncrea.lab02.gateway")
public class AppInjectConfig {

    @Bean
    public QuoteProvider provider(){
        return new CNFProvider();
    }

    @Bean
    public QuoteService service(QuoteProvider provider){
        return new QuoteServiceImpl(provider);
    }

}
