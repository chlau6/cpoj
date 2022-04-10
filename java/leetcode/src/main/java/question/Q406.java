package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q406 {
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        List<List<Integer>> list = new ArrayList<>();
        int[][] result = new int[n][2];

        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));

        for (int[] p : people) {
            list.add(p[1], List.of(p[0], p[1]));
        }

        for (int i = 0; i < n; i++) {
            List<Integer> temp = list.get(i);

            result[i][0] = temp.get(0);
            result[i][1] = temp.get(1);
        }

        return result;
    }
}

/*
406. Queue Reconstruction by Height
 */
