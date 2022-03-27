package question;

public class Q2114 {
    public int mostWordsFound(String[] sentences) {
        int result = 0;

        for (String sentence : sentences) {
            int n = sentence.length();
            int words = 1;

            for (int i = 0; i < n; i++) {
                if (sentence.charAt(i) == ' ') {
                    words++;
                }
            }

            result = Math.max(result, words);
        }

        return result;
    }
}
/*
2108. Find First Palindromic String in the Array
 */
