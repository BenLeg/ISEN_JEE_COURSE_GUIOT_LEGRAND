package yncrea.lab02.launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yncrea.lab02.app.QuoteApplication;

public class SpringXMLAppLauncher {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(("META-INF/applicationContext.xml"));
        final QuoteApplication quoteApplication = context.getBean(QuoteApplication.class);
        quoteApplication.printQuoteInConsole();
    }

}
