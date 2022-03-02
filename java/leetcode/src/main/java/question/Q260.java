package question;

public class Q260 {
    public int[] singleNumber(int[] nums) {
        int mask = 0;

        for (int num : nums) {
            mask ^= num;
        }

        mask &= -mask;

        int[] result = new int[]{0, 0};

        for (int num : nums) {
            if ((num & mask) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }
}

/*
260. Single Number III
 */