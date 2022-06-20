package question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q1153 {
    public boolean canConvert(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }

        int n = str1.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (map.containsKey(c1) && map.get(c1) != c2) {
                return false;
            }

            map.put(c1, c2);
        }

        return new HashSet<>(map.values()).size() < 26;
    }
}

/*
1153. String Transforms Into Another String
 */
