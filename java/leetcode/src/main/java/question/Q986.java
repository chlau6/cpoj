package question;

import java.util.ArrayList;
import java.util.List;

public class Q986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {
            int firstStart = firstList[i][0];
            int firstEnd = firstList[i][1];
            int secondStart = secondList[j][0];
            int secondEnd = secondList[j][1];

            if (firstStart <= secondEnd && secondStart <= firstEnd) {
                list.add(new int[]{Math.max(firstStart, secondStart), Math.min(firstEnd, secondEnd)});
            }

            if (firstEnd <= secondEnd) {
                i++;
            } else {
                j++;
            }
        }
        return list.toArray(new int[][]{});
    }
}

/*
986. Interval List Intersections
 */
