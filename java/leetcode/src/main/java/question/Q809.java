package question;

public class Q809 {
    public int expressiveWords(String s, String[] words) {
        int result = 0;
        int m = s.length();

        for (String word : words) {
            int i = 0;
            int j = 0;

            while (i < m) {
                if (j < word.length() && s.charAt(i) == word.charAt(j)) {
                    j++;
                } else if (i > 0 && s.charAt(i) == s.charAt(i - 1) && i + 1 < m && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                } else if (!(i > 1 && s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i - 2))) {
                    break;
                }

                i++;
            }

            if (i == m && j == word.length()) {
                result++;
            }
        }

        return result;
    }
}

/*
809. Expressive Words
 */
