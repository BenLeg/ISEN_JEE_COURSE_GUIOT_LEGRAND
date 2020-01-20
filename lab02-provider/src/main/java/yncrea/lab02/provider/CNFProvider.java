package yncrea.lab02.provider;

import yncrea.lab02.core.dao.QuoteProvider;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CNFProvider implements QuoteProvider {

    private static final String FILE_PATH = "chuck-norris-facts.txt";

    private List<String> quotes;


    public CNFProvider() {
        try {
            final URI uri = Thread.currentThread().getContextClassLoader().getResource(FILE_PATH).toURI();
            if (uri.toString().contains("!")) {
                loadQuotesFromJar(uri);
            } else {
                loadQuotesFromFile(uri);
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }


    private void loadQuotesFromFile(final URI uri) {
        try {
            this.quotes = Files.readAllLines(Paths.get(uri));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadQuotesFromJar(final URI uri) {
        final String[] uriData = uri.toString().split("!");
        final Map<String, String> env = new HashMap<>();
        try (final FileSystem fileSystem = FileSystems.newFileSystem(URI.create(uriData[0]), env);) {
            final Path quotesFile = fileSystem.getPath(uriData[1]);
            loadQuotesFromFile(quotesFile.toUri());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public String getOneQuote(final int index) {
        return quotes.get(index);
    }


    @Override
    public int getNumberOfQuotes() {
        return quotes.size();
    }
}
