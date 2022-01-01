package question;

public class Q1704 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean halvesAreAlike(String s) {
        int vowel = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel = (i >= n / 2) ? vowel + 1 : vowel - 1;
            }
        }

        return vowel == 0;
    }
}

/*
1704. Determine if String Halves Are Alike
 */
