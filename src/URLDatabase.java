import java.util.HashMap;
import java.util.Map;

public class URLDatabase {
    private Map<String, URLMapping> mappings = new HashMap<>();


    public void addMapping(URLMapping mapping) {
        mappings.put(mapping.getShortURL(), mapping);
    }

    public URLMapping getMapping(String shortURL) {
        return mappings.get(shortURL);
    }

    public void removeMapping(String shortURL) {
        mappings.remove(shortURL);
    }
}
