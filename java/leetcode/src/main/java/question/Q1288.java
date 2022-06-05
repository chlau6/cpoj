package question;

import java.util.Arrays;

public class Q1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int n = intervals.length;
        int end = -1;
        int result = 0;

        for (int[] v : intervals) {
            if (v[1] > end) {
                result++;
                end = v[1];
            }
        }

        return result;
    }
}

/*
1288. Remove Covered Intervals
 */
