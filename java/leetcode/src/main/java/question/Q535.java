package question;

import java.util.HashMap;
import java.util.Map;

public class Q535 {
    public class Codec {
        String template = "https://tinyurl.com/";
        Map<String, String> map = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String url = template + hex(longUrl);

            map.put(url, longUrl);

            return url;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl);
        }

        public String hex(String longUrl) {
            String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            char[] result = new char[6];

            for (int i = 0; i < 6; i++) {
                result[i] = charSet.charAt((int) (Math.random() * 62));
            }

            return String.valueOf(result);
        }
    }
}

/*
535. Encode and Decode TinyURL
 */
