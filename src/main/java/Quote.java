public class Quote {

    private String name;
    private String quote;
    private boolean favourite;
    private int id;

    public Quote(String name, String quote, boolean favourite, int id) {
        this.name = name;
        this.quote = quote;
        this.favourite = favourite;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public int getId() {
        return id;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
