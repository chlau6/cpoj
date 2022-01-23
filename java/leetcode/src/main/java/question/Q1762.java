package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1762 {
    public int[] findBuildings(int[] heights) {
        List<Integer> list = new ArrayList<>();
        int max = 0;

        for (int i = heights.length - 1; i >= 0; i--) {
            if (heights[i] > max) {
                list.add(i);
                max = heights[i];
            }
        }

        Collections.reverse(list);

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

/*
1762. Buildings With an Ocean View
 */
