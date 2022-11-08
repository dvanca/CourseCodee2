import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
            List<String> lines = Files.readAllLines(Path.of("files","quotes.txt"));
            List<Quote> quotes = new ArrayList<>();
            int i=1;
            for(String line : lines){
                String [] components = line.split("\\~");
                quotes.add(new Quote(i,components[0], components[1]));
                i++;
            }

            QuoteService service = new QuoteService(quotes);
        System.out.println(service.getAllQuotes());
        System.out.println(service.getAllAuthors());
        System.out.println(service.getQuotesForAuthor("Hannah More"));
        service.setFavourite(4);
        service.setFavourite(224);
        service.setFavourite(15);
        System.out.println(service.getFavourites());
        System.out.println(service.getRandomQuote());



        }

}
