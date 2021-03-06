package question;

public class Q409 {
    public int longestPalindrome(String s) {
        int[] counts = new int[128];

        int oddCount = 0;

        for (char c : s.toCharArray()) {
            counts[c]++;
        }

        for (int count : counts) {
            if (count % 2 == 1) oddCount++;
        }

        return oddCount < 1 ? s.length() : s.length() - oddCount + 1;
    }
}

/*
409. Longest Palindrome
 */
