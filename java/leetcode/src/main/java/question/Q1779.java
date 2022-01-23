package question;

public class Q1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = Integer.MAX_VALUE;
        int n = points.length;
        int result = -1;

        for (int i = 0; i < n; i++) {
            if (x != points[i][0] && y != points[i][1]) continue;

            int dist = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);

            if (dist < minDist) {
                minDist = dist;
                result = i;
            }
        }

        return result;
    }
}

/*
1779. Find Nearest Point That Has the Same X or Y Coordinate
 */
