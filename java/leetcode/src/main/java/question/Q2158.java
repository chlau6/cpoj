package question;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Q2158 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Q2158().amountPainted(new int[][]{{6, 8}, {10, 15}, {18, 22}, {5, 20}})));
    }

    public int[] amountPainted(int[][] paint) {
        int n = paint.length;
        int[] result = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int currStart = paint[i][0];
            int currEnd = paint[i][1] - 1;
            int add = currEnd - currStart + 1;

            result[i] = currEnd - currStart;

            Map.Entry<Integer, Integer> floor = map.floorEntry(paint[i][0]);

            if (floor != null) {
                int s = floor.getKey();
                int e = floor.getValue();

                if (e >= currEnd) {
                    // the entire current interval has been covered by the floor, so no new numbers need to add, simply just return.
                    continue;
                }

                if (e >= currStart) {
                    // the current interval has been partially covered by the floor, so deduct the overlapping numbers.
                    add -= e - currStart + 1;
                    map.remove(s);
                    currStart = s;
                }
            }

            Map.Entry<Integer, Integer> ceiling = map.ceilingEntry(paint[i][0]);

            // there could be multiple ceilings overlap with the current interval.
            // e.g. current [5, 20], ceilings: [6, 8], [10, 15], [18, 22]
            // we need to deduct the overlapping numbers properly

            while (ceiling != null && ceiling.getKey() <= currEnd) {
                int s = ceiling.getKey();
                int e = ceiling.getValue();

                add -= Math.min(currEnd, e) - s + 1;
                currEnd = Math.max(currEnd, e);
                map.remove(s);
                ceiling = map.ceilingEntry(currStart);
            }

            map.put(currStart, currEnd);
            result[i] = add;
        }

        System.out.println(map);
        return result;
    }
}

/*
2158. Amount of New Area Painted Each Day
 */
