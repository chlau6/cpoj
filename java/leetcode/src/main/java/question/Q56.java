package question;

import annotation.Array;
import annotation.Sorting;
import company.Facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Array
@Sorting
@Facebook
public class Q56 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> list = new ArrayList<>();

        list.add(intervals[0]);

        int[] lastInterval = intervals[0];
        for (int[] interval : intervals) {
            if (interval[0] <= lastInterval[1]) {
                lastInterval[1] = Math.max(interval[1], lastInterval[1]);
            } else {
                lastInterval = interval;
                list.add(interval);
            }
        }

        return list.toArray(new int[][]{});
    }

    /*
    Sorting
    Time Complexity: O(n log n) Space Complexity: O(n)
     */
    public int[][] merge2(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        List<int[]> list = new ArrayList<>();
        for (int i = 0, j = 0; i < intervals.length; i++) {
            if (i == intervals.length - 1 || start[i + 1] > end[i]) {
                list.add(new int[]{start[j], end[i]});
            }
            j = i + 1;
        }

        return list.toArray(new int[][]{});
    }
}

/*
56. MergeInterval
 */
