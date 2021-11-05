package question;

import annotation.Array;
import annotation.Matrix;
import annotation.Simulation;

import java.util.ArrayList;
import java.util.List;

@Array
@Matrix
@Simulation
public class Q1260 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(mn)
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            result.add(new ArrayList<>());
        }

        int start = m * n - k % (m * n);
        int end = m * n + start;

        for (int i = start; i < end; i++) {
            int index = i % (m * n);
            int r = index / n;
            int c = index % n;

            int newRow = (i - start) / n;

            result.get(newRow).add(grid[r][c]);
        }

        return result;
    }
}

/*
1260. Shift 2D Grid
 */
