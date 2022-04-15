package question;

import java.util.Arrays;

public class Q435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int n = intervals.length;
        int result = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < prevEnd) {
                result++;
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return result;
    }
}
/*
435. Non-overlapping Intervals
 */
