package question;

import java.util.Arrays;

public class Q452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int n = points.length;
        int result = 1;
        int end = points[0][1];

        for (int i = 1; i < n; i++) {
            if (end >= points[i][0]) continue;

            result++;
            end = points[i][1];
        }

        return result;
    }
}

/*
452. Minimum Number of Arrows to Burst Balloons
 */
