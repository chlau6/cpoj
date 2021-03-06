package question;

public class Q1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int x0 = points[i][0];
            int y0 = points[i][1];
            int x1 = points[i + 1][0];
            int y1 = points[i + 1][1];

            int xDiff = Math.abs(x0 - x1);
            int yDiff = Math.abs(y0 - y1);

            result += Math.max(xDiff, yDiff);
        }

        return result;
    }
}

/*
1266. Minimum Time Visiting All Points
 */
