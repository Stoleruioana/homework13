import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainQuote {
    public ArrayList<Quote> QuoteList;
    public ArrayList<Quote> FinalQuoteList;

    public static void main(String[] args) {




    }
    public ArrayList<Quote> buildListOfQuotes() throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader("D:\\curs\\CourseCode2\\src\\main\\java\\Quote.txt"));
        String line;
        int i=0;
        while ((line = buffer.readLine()) != null) {
            addQuote(line,i);
            i++;
        }
        return QuoteList;
    }
    public void addQuote(String line, int i) {
        String[] authorAndQuote = line.split("~");
        QuoteList.add(new Quote (authorAndQuote[0], authorAndQuote[1], false, i));
    }

}
