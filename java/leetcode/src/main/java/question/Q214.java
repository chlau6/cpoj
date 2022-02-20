package question;

public class Q214 {
    public String shortestPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        char[] str = s.toCharArray();

        while (j >= 0) {
            if (str[i] == str[j]) {
                i++;
            }

            j--;
        }

        if (i == n) return s;
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();

        return prefix + shortestPalindrome(s.substring(0, i)) + suffix;
    }
}

/*
214. Shortest Palindrome
 */