package yncrea.lab02.provider;

import yncrea.lab02.core.dao.QuoteProvider;

import java.util.Arrays;
import java.util.List;

public class DiceProvider implements QuoteProvider {

    private List<String> values = Arrays.asList("ONE","TWO","THREE","FOUR","FIVE","SIX");


    @Override
    public String getOneQuote(final int index) {
        return values.get(index);
    }


    @Override
    public int getNumberOfQuotes() {
        return values.size();
    }
}
