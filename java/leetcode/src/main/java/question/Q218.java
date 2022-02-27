package question;

import java.util.ArrayList;
import java.util.List;

public class Q218 {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        int n = buildings.length;

        return helper(buildings, 0, n - 1);
    }

    public List<List<Integer>> helper(int[][] skylines, int i, int j) {
        if (i < j) {
            int mid = i + (j - i) / 2;

            return merge(helper(skylines, i, mid), helper(skylines, mid + 1, j));
        }

        List<List<Integer>> result = new ArrayList<>();

        result.add(List.of(skylines[i][0], skylines[i][2]));
        result.add(List.of(skylines[i][1], 0));

        return result;
    }

    public List<List<Integer>> merge(List<List<Integer>> r1, List<List<Integer>> r2) {
        List<List<Integer>> result = new ArrayList<>();
        int h1 = 0;
        int h2 = 0;
        int i = 0;
        int j = 0;
        int n1 = r1.size();
        int n2 = r2.size();

        while (i < n1 && j < n2) {
            int x1 = r1.get(i).get(0);
            int x2 = r2.get(j).get(0);
            int x;

            if (x1 < x2) {
                x = x1;
                h1 = r1.get(i).get(1);
                i++;
            } else if (x1 > x2) {
                x = x2;
                h2 = r2.get(j).get(1);
                j++;
            } else {
                x = x1;
                h1 = r1.get(i).get(1);
                h2 = r2.get(j).get(1);
                i++;
                j++;
            }

            int h = Math.max(h1, h2);

            if (result.isEmpty() || h != result.get(result.size() - 1).get(1)) {
                result.add(List.of(x, h));
            }
        }

        while (i < n1) result.add(r1.get(i++));
        while (j < n2) result.add(r2.get(j++));

        return result;
    }
}

/*
218. The Skyline Problem
 */
