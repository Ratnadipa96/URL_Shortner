
import java.util.UUID;

public class URLShortenerService {
    private URLDatabase urlDatabase;

    public URLShortenerService(URLDatabase urlDatabase) {
        this.urlDatabase = urlDatabase;
    }

    public String shortenURL(String originalURL) {
        String shortURL = generateShortURL();
        URLMapping mapping = new URLMapping(shortURL, originalURL, System.currentTimeMillis());
        urlDatabase.addMapping(mapping);
        return shortURL;
    }

    public String getOriginalURL(String shortURL) {
        URLMapping mapping = urlDatabase.getMapping(shortURL);
        return (mapping != null) ? mapping.getOriginalURL() : null;
    }

    private String generateShortURL() {
        return UUID.randomUUID().toString().substring(0, 8); // Simple short URL generator
    }
}
