package question;

public class Q477 {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        int n = nums.length;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int num : nums) {
                if ((num & (1 << i)) > 0) {
                    count++;
                }
            }

            result += count * (n - count);
        }

        return result;
    }
}

/*
477. Total Hamming Distance
 */
