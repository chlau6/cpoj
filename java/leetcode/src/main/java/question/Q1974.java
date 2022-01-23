package question;

public class Q1974 {
    public int minTimeToType(String word) {
        int n = word.length();
        int result = n;
        char pointer = 'a';

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            int diff = Math.abs(c - pointer);
            result += Math.min(diff, 26 - diff);
            pointer = c;
        }

        return result;
    }
}
/*
1974. Minimum Time to Type Word Using Special Typewriter
 */
