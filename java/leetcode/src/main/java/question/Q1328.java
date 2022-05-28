package question;

public class Q1328 {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) return "";

        char[] s = palindrome.toCharArray();
        int n = s.length;

        for (int i = 0; i < n / 2; i++) {
            if (s[i] != 'a') {
                s[i] = 'a';
                return String.valueOf(s);
            }
        }

        s[n - 1] = 'b';

        return String.valueOf(s);
    }
}

/*
1328. Break a Palindrome
 */
