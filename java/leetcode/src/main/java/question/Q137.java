package question;

public class Q137 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums) {
                if (((num >> i) & 1) == 1) {
                    sum++;
                }
            }

            sum %= 3;

            if (sum != 0) {
                result |= 1 << i;
            }
        }

        return result;
    }
}

/*
137. Single Number II
 */
