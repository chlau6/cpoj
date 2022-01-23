package question;

import java.util.ArrayList;
import java.util.List;

public class Q1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();

        int j = 1;

        for (int num : target) {
            while (num != j) {
                result.add("Push");
                result.add("Pop");
                j++;
            }

            result.add("Push");
            j++;
        }

        return result;
    }
}

/*
1441. Build an Array With Stack Operations
 */
