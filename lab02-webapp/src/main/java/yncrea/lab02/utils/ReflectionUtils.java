package yncrea.lab02.utils;

import yncrea.lab02.core.dao.QuoteProvider;

public final class ReflectionUtils {

    public static QuoteProvider getQuoteProviderInstanceFromClassName(final String className){
        try {
            final Class<?> providerClass = Class.forName(className);
            return (QuoteProvider) providerClass.newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

}
