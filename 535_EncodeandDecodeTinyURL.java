// I don't know whether this solution is right or wrong!
public class Codec {
    public HashMap<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int start = 0, end = longUrl.length();
        for (int i=end-1; i>=0; i--) {
            if (longUrl.charAt(i) == '/') {
                start = i+1;
                break;
            }
        }
        String encodedUrl = longUrl.substring(start, end);
        map.put(encodedUrl, longUrl);
        return encodedUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
