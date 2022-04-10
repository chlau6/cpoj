package question;

public class Q2185 {
    public int prefixCount(String[] words, String pref) {
        int result = 0;

        for (String w : words) {
            if (w.startsWith(pref)) {
                result++;
            }
        }

        return result;
    }
}

/*
2185. Counting Words With a Given Prefix
 */
