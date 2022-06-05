package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1042 {
    public int[] gardenNoAdj(int n, int[][] paths) {
        int[] result = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[][] count = new int[n][2];

        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] path : paths) {
            map.get(path[0] - 1).add(path[1] - 1);
            map.get(path[1] - 1).add(path[0] - 1);
        }

        for (int i = 0; i < n; i++) {
            int[] colors = new int[5];

            for (int v : map.get(i)) {
                colors[result[v]] = 1;
            }

            for (int j = 1; j < 5; j++) {
                if (colors[j] == 0) {
                    result[i] = j;
                }
            }
        }

        return result;
    }
}

/*
1042. Flower Planting With No Adjacent
 */
