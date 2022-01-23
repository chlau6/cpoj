package question;

import java.util.Arrays;

public class Q748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] counts = new int[26];
        int totalChar = 0;
        String result = "";

        for (char c : licensePlate.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                counts[Character.toLowerCase(c) - 'a']++;
                totalChar++;
            }
        }

        for (String word : words) {
            int count = totalChar;
            int[] countCopy = Arrays.copyOf(counts, counts.length);

            for (char c : word.toCharArray()) {
                if (--countCopy[c - 'a'] >= 0) count--;
            }

            if (count == 0 && (result.isEmpty() || word.length() < result.length())) {
                result = word;
            }
        }

        return result;
    }
}

/*
748. Shortest Completing Word
 */
