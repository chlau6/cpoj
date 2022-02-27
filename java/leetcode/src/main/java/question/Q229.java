package question;

import java.util.ArrayList;
import java.util.List;

public class Q229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int num1 = 0;
        int num2 = 0;
        int n = nums.length;

        for (int num : nums) {
            if (num == num1) {
                count1++;
            } else if (num == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == num1) {
                count1++;
            } else if (num == num2) {
                count2++;
            }
        }

        if (count1 > n / 3) result.add(num1);
        if (count2 > n / 3) result.add(num2);

        return result;
    }
}

/*
229. Majority Element II
 */
