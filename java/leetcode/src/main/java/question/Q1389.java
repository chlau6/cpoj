package question;

import java.util.ArrayList;
import java.util.List;

public class Q1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int length = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}

/*
1389. Create Target Array in the Given Order
 */
