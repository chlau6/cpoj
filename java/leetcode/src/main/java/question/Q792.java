package question;

import java.util.ArrayList;
import java.util.List;

public class Q792 {
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        ArrayList<StringBuilder>[] waiting = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            waiting[i] = new ArrayList();
        }

        for (String w : words) {
            waiting[w.charAt(0) - 'a'].add(new StringBuilder(w));
        }

        for (char c : s.toCharArray()) {
            List<StringBuilder> advance = waiting[c - 'a'];

            waiting[c - 'a'] = new ArrayList();

            for (StringBuilder sb : advance) {
                sb.deleteCharAt(0);

                if (sb.length() > 0) {
                    waiting[sb.charAt(0) - 'a'].add(sb);
                } else {
                    result++;
                }
            }
        }

        return result;
    }
}

/*
790. Domino and Tromino Tiling
 */
