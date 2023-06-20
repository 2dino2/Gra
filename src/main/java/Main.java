import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Main {
    public static void main(String[] args) {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        System.out.println(jokes.getRandomQuote());
    }
}
