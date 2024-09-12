public class URLMapping {
    private String shortURL;
    private String originalURL;
    private long creationDate;

    public URLMapping(String shortURL, String originalURL, long creationDate) {
        this.shortURL = shortURL;
        this.originalURL = originalURL;
        this.creationDate = creationDate;
    }

    public String getShortURL() {
        return shortURL;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public long getCreationDate() {
        return creationDate;
    }
}

