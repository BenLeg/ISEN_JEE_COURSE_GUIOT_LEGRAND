package yncrea.lab02.launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yncrea.lab02.app.QuoteApplication;
import yncrea.lab02.config.AppConfig;

public class SpringAppLauncher {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        final QuoteApplication quoteApplication = context.getBean(QuoteApplication.class);
        quoteApplication.printQuoteInConsole();
    }

}
