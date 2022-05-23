package question;

import java.util.Arrays;

public class Q1366 {
    public String rankTeams(String[] votes) {
        if (votes.length == 1) return votes[0];

        int[][] counts = new int[26][26];

        for (String vote : votes) {
            int len = vote.length();

            for (int i = 0; i < len; i++) {
                char c = vote.charAt(i);
                counts[c - 'A'][i]++;
            }
        }

        int n = votes[0].length();
        Character[] charSet = new Character[n];

        for (int i = 0; i < n; i++) {
            charSet[i] = votes[0].charAt(i);
        }

        Arrays.sort(charSet, (a, b) -> {
            for (int i = 0; i < n; i++) {
                if (counts[a - 'A'][i] != counts[b - 'A'][i]) {
                    return counts[b - 'A'][i] - counts[a - 'A'][i];
                }
            }

            return a - b;
        });

        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[i] = charSet[i];
        }

        return new String(result);
    }
}

/*
1366. Rank Teams by Votes
 */
