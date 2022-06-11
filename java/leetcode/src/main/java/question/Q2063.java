package question;

public class Q2063 {
    public long countVowels(String word) {
        long result = 0;
        long n = word.length();
        String vowels = "aeiou";

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);

            if ("aeiou".indexOf(c) >= 0) {
                result += ((i + 1) * (n - i));
            }
        }

        return result;
    }
}
/*
2063. Vowels of All Substrings
 */
