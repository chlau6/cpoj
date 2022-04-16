package question;

import java.util.Arrays;

public class Q451 {
    public String frequencySort(String s) {
        int n = s.length();

        int[][] buckets = new int[128][2];
        char[] result = new char[n];

        for (char c : s.toCharArray()) {
            buckets[c][0] = c;
            buckets[c][1]++;
        }

        Arrays.sort(buckets, (a, b) -> (b[1] - a[1]));

        int j = 0;

        for (int[] bucket : buckets) {
            if (bucket[1] == 0) break;

            int freq = bucket[1];
            char c = (char) bucket[0];

            for (int i = 0; i < freq; i++) {
                result[j++] = c;
            }
        }

        return String.valueOf(result);
    }
}

/*
451. Sort Characters By Frequency
 */
