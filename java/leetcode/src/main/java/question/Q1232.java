
package question;

public class Q1232 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int x1 = coordinates[1][0];
        int y0 = coordinates[0][1];
        int y1 = coordinates[1][1];

        int dx = x1 - x0;
        int dy = y1 - y0;

        for (int[] c : coordinates) {
            int x = c[0];
            int y = c[1];

            if (dy * (x - x0) != dx * (y - y0)) return false;
        }

        return true;
    }
}

/*
1232. Check If It Is a Straight Line
 */
