import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public class QuoteService {
    private final List<Quote> quotes;

    List<String> getAllQuotes(){
        List<String> lista = new ArrayList<>();
        for(Quote quote : quotes){
            lista.add(quote.getQuote());
        }
        return lista;
    }

    List<String> getAllAuthors(){
        Set<String> result = new HashSet<>();
        for(Quote quote : quotes){
            result.add(quote.getAuthor());
        }
        return new ArrayList<>(result);
    }

    List<Quote> getQuotesForAuthor(String author){
        List<Quote> lista = new ArrayList<>();
        for(Quote quote : quotes){
            if(quote.getAuthor().equals(author)){
                lista.add(quote);
            }
        }
        return lista;
    }

    public void setFavourite(int id){
        for(Quote quote : quotes){
            if(quote.getId()==id){
                quote.setFavourite(true);
            }
        }
    }

    public List<Quote> getFavourites(){
        List<Quote> lista = new ArrayList<>();
        for(Quote quote : quotes){
            if(quote.isFavourite()){
                lista.add(quote);
            }
        }
        return lista;
    }

    public String  getRandomQuote(){
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex).getQuote();
    }
}
