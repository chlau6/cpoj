package question;

import java.util.HashMap;
import java.util.Map;

public class Q388 {
    public int lengthLongestPath(String input) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        map.put(0, 0);

        for (String s : input.split("\n")) {
            int level = s.lastIndexOf("\t") + 1;

            int length = s.substring(level).length();

            if (s.contains(".")) {
                result = Math.max(result, map.get(level) + length);
            } else {
                map.put(level + 1, map.get(level) + length + 1);
            }
        }

        return result;
    }
}

/*
388. Longest Absolute File Path
 */
