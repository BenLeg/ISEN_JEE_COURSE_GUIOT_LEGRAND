package yncrea.lab02.web;

import yncrea.lab02.core.dao.QuoteProvider;
import yncrea.lab02.core.service.impl.QuoteServiceImpl;
import yncrea.lab02.utils.ReflectionUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class QuoteServlet extends HttpServlet {

    private QuoteServiceImpl quoteService;


    @Override
    public void init(final ServletConfig config) throws ServletException {
        final String parameter = config.getInitParameter("providerClass");
        final QuoteProvider quoteProvider = ReflectionUtils.getQuoteProviderInstanceFromClassName(parameter);
        quoteService = new QuoteServiceImpl(quoteProvider);
    }


    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print(quoteService.getRandomQuote());
    }
}
