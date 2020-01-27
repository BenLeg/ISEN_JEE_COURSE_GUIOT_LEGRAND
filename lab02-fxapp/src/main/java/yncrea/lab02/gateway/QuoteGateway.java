package yncrea.lab02.gateway;

import yncrea.lab02.core.service.QuoteService;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.provider.DiceProvider;

public class QuoteGateway {

    private QuoteService quoteService;


    public QuoteGateway() {
        this.quoteService = new QuoteServiceImpl(new DiceProvider());
    }


    public String getRandomQuote() {
        return quoteService.getRandomQuote();
    }
}
