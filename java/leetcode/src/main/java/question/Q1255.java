package question;

public class Q1255 {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] counts = new int[26];

        for (char c : letters) {
            counts[c - 'a']++;
        }

        int result = dfs(words, counts, score, 0);

        return result;
    }

    public int dfs(String[] words, int[] counts, int[] score, int index) {
        int result = 0;

        for (int i = index; i < words.length; i++) {
            int sum = 0;
            boolean isValid = true;
            String w = words[i];
            int n = w.length();

            for (int j = 0; j < n; j++) {
                char c = w.charAt(j);

                if (--counts[c - 'a'] < 0) {
                    isValid = false;
                }

                sum += score[c - 'a'];
            }

            if (isValid) {
                sum += dfs(words, counts, score, i + 1);
                result = Math.max(result, sum);
            }

            for (int j = 0; j < n; j++) {
                char c = w.charAt(j);
                counts[c - 'a']++;
            }
        }

        return result;
    }
}

/*
1255. Maximum Score Words Formed by Letters
 */
