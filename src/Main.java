public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world! its an Short URL ");

        URLDatabase urlDatabase = new URLDatabase();
        URLShortenerService urlShortener = new URLShortenerService(urlDatabase);

        String originalURL = "https://www.example.com";
        String shortURL = urlShortener.shortenURL(originalURL);

        System.out.println("Original URL: " + originalURL);
        System.out.println("Shortened URL: " + shortURL);

        String retrievedURL = urlShortener.getOriginalURL(shortURL);
        System.out.println("Retrieved Original URL: " + retrievedURL);


    }
}