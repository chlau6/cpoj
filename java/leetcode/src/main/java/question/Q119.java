package question;

import annotation.Array;
import annotation.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

@Array
@DynamicProgramming
public class Q119 {
    /*
    Time Complexity: O(n^2) Space Complexity: O(n)
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();

            curr.add(1);

            for (int j = 0; j < list.size() - 1; j++) {
                curr.add(list.get(j) + list.get(j + 1));
            }

            curr.add(1);

            list = curr;
        }

        return list;
    }
}

/*
119. Pascal's Triangle II
 */
