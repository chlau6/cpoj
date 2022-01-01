package question;

public class Q2047 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int countValidWords(String sentence) {
        int result = 0;
        String[] strs = sentence.strip().split("\\s+");

        for (String str : strs) {
            if (isValid(str)) {
                result++;
            }
        }

        return result;
    }

    public boolean isValid(String str) {
        int hyphen = 0;
        int n = str.length();
        char[] s = str.toCharArray();

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s[i])) return false;

            if (Character.isAlphabetic(s[i])) continue;

            if (s[i] == '-') {
                if (++hyphen > 1) return false;

                if (i - 1 < 0 || !Character.isAlphabetic(s[i - 1]) || i + 1 == n || !Character.isAlphabetic(s[i + 1]))
                    return false;

            } else if (i != n - 1) return false;
        }

        return true;
    }
}
/*
2047. Number of Valid Words in a Sentence
 */
