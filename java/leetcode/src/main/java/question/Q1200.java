package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int diff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int tempDiff = arr[i + 1] - arr[i];

            if (tempDiff <= diff) {
                if (tempDiff < diff) {
                    result.clear();
                }
                result.add(List.of(arr[i], arr[i + 1]));
                diff = tempDiff;
            }
        }

        return result;
    }
}

/*
1200. Minimum Absolute Difference
 */
