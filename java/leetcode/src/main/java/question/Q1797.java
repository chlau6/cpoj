package question;

import java.util.HashMap;
import java.util.Map;

public class Q1797 {
    class AuthenticationManager {
        int ttl = 0;
        Map<String, Integer> tokenMap = new HashMap<>();

        public AuthenticationManager(int timeToLive) {
            this.ttl = timeToLive;
        }

        public void generate(String tokenId, int currentTime) {
            tokenMap.put(tokenId, currentTime + ttl);
        }

        public void renew(String tokenId, int currentTime) {
            if (tokenMap.getOrDefault(tokenId, -1) > currentTime) {
                tokenMap.put(tokenId, currentTime + ttl);
            }
        }

        public int countUnexpiredTokens(int currentTime) {
            tokenMap.entrySet().removeIf(e -> e.getValue() <= currentTime);

            return tokenMap.size();
        }
    }
}

/*
1797. Design Authentication Manager
 */
