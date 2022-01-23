package question;

import java.util.ArrayList;
import java.util.List;

public class Q118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals = new ArrayList<>();

        pascals.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> lastRow = pascals.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(lastRow.get(j - 1) + lastRow.get(j));
            }

            row.add(1);

            pascals.add(row);
        }

        return pascals;
    }
}

/*
118. Pascal's Triangle
 */
