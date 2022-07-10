package question;

import java.util.ArrayList;
import java.util.List;

public class Q1253 {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> result = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;

        for (int cs : colsum) {
            if (cs == 1) {
                sum1++;
            } else if (cs == 2) {
                sum2++;
            }
        }

        int count1 = upper - sum2;
        int count2 = lower - sum2;

        if (count1 < 0 || count2 < 0 || count1 + count2 != sum1) return new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            result.add(new ArrayList<>());
        }

        for (int c : colsum) {
            if (c == 2) {
                result.get(0).add(1);
                result.get(1).add(1);
            } else if (c == 1) {
                if (count1 > 0) {
                    result.get(0).add(1);
                    result.get(1).add(0);
                    count1--;
                } else {
                    result.get(0).add(0);
                    result.get(1).add(1);
                }
            } else {
                result.get(0).add(0);
                result.get(1).add(0);
            }
        }

        return result;
    }
}

/*
1253. Reconstruct a 2-Row Binary Matrix
 */
