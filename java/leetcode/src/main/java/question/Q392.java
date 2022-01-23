package question;

public class Q392 {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int sLength = s.length();
        int tLength = t.length();

        for (int j = 0; i < sLength && j < tLength; j++) {
            if (s.charAt(i) == t.charAt(j)) i++;
        }

        return i == sLength;
    }
}

/*
392. Is Subsequence
 */
