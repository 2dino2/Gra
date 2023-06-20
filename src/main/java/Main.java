import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.kohsuke.randname.RandomNameGenerator;

public class Main {
    public static void main(String[] args) {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println(jokes.getRandomQuote());
        RandomNameGenerator randomNameGenerator = new RandomNameGenerator();
        System.out.println(randomNameGenerator.next());
    }
}
