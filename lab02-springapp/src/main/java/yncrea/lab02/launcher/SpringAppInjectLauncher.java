package yncrea.lab02.launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yncrea.lab02.config.AppInjectConfig;
import yncrea.lab02.gateway.QuoteGateway;

public class SpringAppInjectLauncher {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppInjectConfig.class);
        final QuoteGateway quoteApplication = context.getBean(QuoteGateway.class);
        quoteApplication.printQuoteInConsole();
    }

}
