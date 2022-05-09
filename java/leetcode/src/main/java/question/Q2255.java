package question;

public class Q2255 {
    public int countPrefixes(String[] words, String s) {
        int result = 0;

        for (String word : words) {
            if (s.startsWith(word)) {
                result++;
            }
        }

        return result;
    }
}

/*
2255. Count Prefixes of a Given String
 */
