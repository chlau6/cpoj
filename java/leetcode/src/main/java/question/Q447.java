package question;

import java.util.HashMap;
import java.util.Map;

public class Q447 {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];
                int dist = dy * dy + dx * dx;

                map.compute(dist, (k, v) -> v == null ? 1 : v + 1);
            }

            for (int v : map.values()) {
                result += v * (v - 1);
            }
        }

        return result;
    }
}

/*
447. Number of Boomerangs
 */
