package edu.cmu.mis.iccfb.service;

import java.util.List;

import edu.cmu.mis.iccfb.model.Author;
import edu.cmu.mis.iccfb.model.Quote;

public interface QuoteServiceCustom {
    public Quote randomQuote();
    public List<Quote> findQuotesByAuthor(Author author);
}
