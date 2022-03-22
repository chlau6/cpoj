package question;

import java.util.ArrayList;
import java.util.List;

public class Q352 {
    class SummaryRanges {
        List<int[]> intervals = new ArrayList<>();

        public SummaryRanges() {

        }

        public void addNum(int val) {
            int[] newInterval = new int[]{val, val};
            int overlap = 0;
            int i = 0;
            int n = intervals.size();

            while (i < n) {
                int[] interval = intervals.get(i);
                if (newInterval[1] + 1 < interval[0]) break;

                if (newInterval[0] <= interval[1] + 1) {
                    newInterval[0] = Math.min(newInterval[0], interval[0]);
                    newInterval[1] = Math.max(newInterval[1], interval[1]);
                    overlap++;
                }

                i++;
            }

            if (overlap > 0) {
                intervals.subList(i - overlap, i).clear();
            }

            intervals.add(i - overlap, newInterval);
        }

        public int[][] getIntervals() {
            int n = intervals.size();
            int[][] result = new int[n][2];

            for (int i = 0; i < n; i++) {
                result[i] = intervals.get(i);
            }

            return result;
        }
    }
}

/*
352. Data Stream as Disjoint Intervals
 */
