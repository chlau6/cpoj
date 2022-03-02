package question;

import java.util.Arrays;

public class Q274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        for (int i = n - 1; i >= 0; i--) {
            if (i >= citations[i]) {
                return i;
            }
        }

        return -1;
    }
}

/*
274. H-Index
 */
