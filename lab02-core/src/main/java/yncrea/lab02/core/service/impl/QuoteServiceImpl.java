package yncrea.lab02.core.service.impl;

import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.QuoteService;

import java.security.SecureRandom;

public class QuoteServiceImpl implements QuoteService {

    private QuoteProvider quoteProvider;

    private SecureRandom secureRandom;

    private int numberOfQuotes;


    public QuoteServiceImpl(final QuoteProvider quoteProvider) {
        this.quoteProvider = quoteProvider;
        this.secureRandom = new SecureRandom();
        numberOfQuotes = quoteProvider.getNumberOfQuotes();
    }


    @Override
    public String getRandomQuote() {
        final int randomIndex = secureRandom.nextInt(numberOfQuotes);
        return quoteProvider.getOneQuote(randomIndex);
    }
}
