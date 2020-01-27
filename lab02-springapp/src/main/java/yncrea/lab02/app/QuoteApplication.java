package yncrea.lab02.app;

import yncrea.lab02.core.service.QuoteService;

public class QuoteApplication {

    private QuoteService quoteService;


    public QuoteApplication(final QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    public void printQuoteInConsole() {
        System.out.println(quoteService.getRandomQuote());
    }
}
