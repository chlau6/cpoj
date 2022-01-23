package question;

public class Q2042 {
    public boolean areNumbersAscending(String s) {
        int n = s.length();

        int prev = 0;
        int curr = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                curr = curr * 10 + c - '0';
            } else if (curr > 0) {
                if (curr <= prev) return false;
                prev = curr;
                curr = 0;
            }
        }

        return curr == 0 || curr > prev;
    }
}
/*
2042. Check if Numbers Are Ascending in a Sentence
 */
