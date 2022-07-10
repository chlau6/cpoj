package question;

import java.util.Arrays;

public class Q1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);

        int n = points.length;
        int result = 0;

        for (int i = 1; i < n; i++) {
            if (points[i - 1][0] < points[i][0]) {
                result = Math.max(result, points[i][0] - points[i - 1][0]);
            }
        }

        return result;
    }
}

/*
1637. Widest Vertical Area Between Two Points Containing No Points
 */
