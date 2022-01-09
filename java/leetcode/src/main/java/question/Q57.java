package question;

import java.util.ArrayList;
import java.util.List;

public class Q57 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int[] a = newInterval;

        for (int[] interval : intervals) {
            if (interval[1] < a[0]) {
                result.add(interval);
            } else if (interval[0] > a[1]) {
                result.add(a);
                a = interval;
            } else {
                a[0] = Math.min(a[0], interval[0]);
                a[1] = Math.max(a[1], interval[1]);
            }
        }

        result.add(a);

        return result.toArray(new int[result.size()][]);
    }
}

/*
57. Insert Interval
 */
