package question;

import java.util.HashMap;
import java.util.Map;

public class Q149 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            int duplicate = 1;

            for (int j = i + 1; j < n; j++) {
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1]) {
                    duplicate++;
                    continue;
                }

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int gcd = gcd(dx, dy);
                String key = dx / gcd + " " + dy / gcd;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            result = Math.max(result, duplicate);

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                result = Math.max(result, entry.getValue() + duplicate);
            }
        }

        return result;
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}

/*
149. Max Points on a Line
 */
