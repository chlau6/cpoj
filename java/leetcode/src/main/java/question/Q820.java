package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q820 {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));

        for (String w : words) {
            int len = w.length();

            for (int i = 1; i < len; i++) {
                set.remove(w.substring(i));
            }
        }

        int result = 0;

        for (String s : set) {
            result += s.length() + 1;
        }

        return result;
    }
}

/*
820. Short Encoding of Words
 */
