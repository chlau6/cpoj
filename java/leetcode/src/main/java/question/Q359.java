package question;

import java.util.HashMap;
import java.util.Map;

public class Q359 {
    class Logger {
        Map<String, Integer> map = new HashMap<>();

        public Logger() {

        }

        boolean shouldPrintMessage(int timestamp, String message) {
            if (!map.containsKey(message) || timestamp - map.get(message) >= 10) {
                map.put(message, timestamp);
                return true;
            }

            return false;
        }
    }
}

/*
359. Logger Rate Limiter
 */
