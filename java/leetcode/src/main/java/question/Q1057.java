package question;

import java.util.Arrays;

public class Q1057 {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        int m = workers.length;
        int n = bikes.length;
        int[] assignedWorkers = new int[m];
        int[] assignedBikes = new int[n];
        int[][] dist = new int[m * n][3];

        Arrays.fill(assignedWorkers, -1);
        Arrays.fill(assignedBikes, -1);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int d = dist(workers[i], bikes[j]);
                dist[i * m + j] = new int[]{d, i, j};
            }
        }

        Arrays.sort(dist, (a, b) -> {
            if (a[0] < b[0]) {
                return a[0] - b[0];
            } else if (a[1] < b[1]) {
                return a[1] - b[1];
            } else {
                return a[2] - b[2];
            }
        });

        for (int[] a : dist) {
            if (assignedWorkers[a[1]] == -1 && assignedBikes[a[2]] == -1) {
                assignedWorkers[a[1]] = a[2];
                assignedBikes[a[2]] = a[1];
            }
        }

        return assignedWorkers;
    }

    private int dist(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    }
}

/*
1057. Campus Bikes
 */
