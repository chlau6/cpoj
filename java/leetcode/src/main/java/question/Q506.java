package question;

import java.util.Map;
import java.util.TreeMap;

public class Q506 {
    /*
    Time Complexity: O(n log n)   Space Complexity: O(n)
     */
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        String[] result = new String[score.length];

        int rank = score.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int index = entry.getValue();

            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }

            rank--;
        }

        return result;
    }
}

/*
504. Base 7
 */
