package question;

import java.util.Arrays;

public class Q164 {
    public int maximumGap(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int n = nums.length;
        int size = (max - min) / n + 1;
        int bucket = (max - min) / size + 1;

        int[] maxBucket = new int[bucket];
        int[] minBucket = new int[bucket];

        Arrays.fill(maxBucket, Integer.MIN_VALUE);
        Arrays.fill(minBucket, Integer.MAX_VALUE);

        for (int num : nums) {
            int i = (num - min) / size;
            maxBucket[i] = Math.max(maxBucket[i], num);
            minBucket[i] = Math.min(minBucket[i], num);
        }

        int result = 0;
        int prev = 0;

        for (int i = 0; i < bucket; i++) {
            if (maxBucket[i] == Integer.MIN_VALUE || minBucket[i] == Integer.MAX_VALUE) continue;
            result = Math.max(result, minBucket[i] - maxBucket[prev]);
            prev = i;
        }

        return result;
    }
}

/*
164. Maximum Gap
 */