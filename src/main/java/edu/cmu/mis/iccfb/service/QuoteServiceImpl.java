package edu.cmu.mis.iccfb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.mis.iccfb.model.Author;
import edu.cmu.mis.iccfb.model.Quote;


public class QuoteServiceImpl implements QuoteServiceCustom {

    Random random = new Random();
    
    @Autowired
    private QuoteService quoteService;
    @Override
    public Quote randomQuote() {
        ArrayList<Quote> quotes = new ArrayList<Quote>();
        for (Quote q: this.quoteService.findAll() ) {
            quotes.add(q);
        }
        Quote q = quotes.get(random.nextInt(quotes.size()));
        return q;
    }
    
    public List<Quote> findQuotesByAuthor(Author author){
    	   	List<Quote> quotes = author.getQuotes();
    	   	System.out.println(quotes);
    	return quotes;
    }


}
