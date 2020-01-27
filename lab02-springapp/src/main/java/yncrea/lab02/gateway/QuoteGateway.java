package yncrea.lab02.gateway;

import org.springframework.stereotype.Service;
import yncrea.lab02.core.service.QuoteService;

@Service
public class QuoteGateway {


    private QuoteService quoteService;


    public QuoteGateway(final QuoteService quoteService) {
        this.quoteService = quoteService;
    }


    public void printQuoteInConsole() {
        System.out.println(quoteService.getRandomQuote());
    }

}
