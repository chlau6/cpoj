package question;

public class Q1816 {
    public String truncateSentence(String s, int k) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ' && --k == 0) {
                return s.substring(0, i);
            }
        }

        return s;
    }
}

/*
1816. Truncate Sentence
 */
