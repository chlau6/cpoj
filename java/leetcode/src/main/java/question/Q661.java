package question;

public class Q661 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(mn)
     */
    public int[][] imageSmoother(int[][] img) {
        int[][] dirs = new int[][] {{-1, 1}, {0, 1}, {1, 1}, {-1, 0}, {0, 0}, {1, 0}, {-1, -1}, {0, -1}, {1, -1}};
        int[][] result = new int[img.length][img[0].length];
        int m = img.length;
        int n = img[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 0;
                for (int[] dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];

                    if (x < 0 || y < 0 || x == m || y == n) continue;

                    sum += img[x][y];
                    count++;
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
}

/*
661. Image Smoother
 */
