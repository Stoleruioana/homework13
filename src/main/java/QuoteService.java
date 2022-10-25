import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class QuoteService {
    private ArrayList<Quote> quotes;

    public QuoteService(ArrayList<Quote> quotes) {
        this.quotes=quotes;
    }

    public ArrayList<String> getAllQuotes(){
        ArrayList<String> AllQuotes = new ArrayList<>();
        for (Quote q:quotes) {
            AllQuotes.add(q.getQuote());
        }
        return AllQuotes;
    }

    public ArrayList<Quote> getQuotesForAuthor(String name){
        ArrayList<Quote> QuotesForAuthor = new ArrayList<>();
        for (Quote q: quotes) {
            if (q.getName().equalsIgnoreCase(name)) {
                QuotesForAuthor.add(q);
            }
        }
        return QuotesForAuthor;
    }

    public ArrayList<String> getAllAuthors() {
        HashSet<String> allAuthors = new HashSet<>();
        for (Quote q: quotes) {
            allAuthors.add(q.getName());
        }
        ArrayList<String> allAuthorsList = new ArrayList<>(allAuthors);
        return allAuthorsList;
    }
    public void setFavourite (int id) {
        if ((id<0) || (id> quotes.size())) {
            System.out.println("No such quote");
        } else {
            quotes.get(id).setFavourite(true);
        }
    }

    public ArrayList<Quote> getFavourites() {
        ArrayList<Quote> favouriteQuotes = new ArrayList<>();
        for (Quote q:quotes) {
            if (q.isFavourite()) {
                favouriteQuotes.add(q);
            }
        }
        return favouriteQuotes;
    }

    public String getRandomQuote() {
        Random random = new Random();
        int x = random.nextInt(0, quotes.size()+1);
        return quotes.get(x).getQuote();
    }
}
