package question;

import java.util.Arrays;

public class Q179 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        StringBuilder builder = new StringBuilder();

        for (String s : strings) {
            builder.append(s);
        }

        return builder.charAt(0) == '0' ? "0" : builder.toString();
    }
}

/*
179. Largest Number
 */