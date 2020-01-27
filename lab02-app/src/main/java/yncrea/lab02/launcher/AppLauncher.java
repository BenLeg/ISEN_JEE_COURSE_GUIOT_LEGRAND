package yncrea.lab02.launcher;

import yncrea.lab02.app.Application;
import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.provider.CNFProvider;

public class AppLauncher {

    public static void main(String[] args) {
        QuoteProvider provider = new CNFProvider();
        QuoteService service = new QuoteServiceImpl(provider);
        Application app = new Application(service);
        app.printQuoteInConsole();
    }

}
