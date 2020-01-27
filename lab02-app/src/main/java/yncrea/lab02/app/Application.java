package yncrea.lab02.app;

import yncrea.lab02.core.service.QuoteService;

public class Application {

    private QuoteService quoteService;


    public Application(final QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    public void printQuoteInConsole(){
        System.out.println(quoteService.getRandomQuote());
    }
}
