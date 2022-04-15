package question;

import java.util.Map;
import java.util.TreeMap;

public class Q436 {
    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int n = intervals.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            treeMap.put(intervals[i][0], i);
        }

        for (int i = 0; i < n; i++) {
            Map.Entry<Integer, Integer> entry = treeMap.ceilingEntry(intervals[i][1]);
            result[i] = entry == null ? -1 : entry.getValue();
        }

        return result;
    }
}
/*
436. Find Right Interval
 */
