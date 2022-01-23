package question;

import java.util.ArrayList;
import java.util.List;

public class Q1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int sum = 0;
        List<Boolean> result = new ArrayList<>();

        for (int num : nums) {
            sum = ((sum << 1) + num) % 5;
            result.add(sum == 0);
        }

        return result;
    }
}

/*
1018. Binary Prefix Divisible By 5
 */
