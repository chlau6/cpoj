package question;

public class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int localMax = 0;
        int globalMax = 0;

        for (int num : nums) {
            if (num == 1) {
                globalMax = Math.max(++localMax, globalMax);
            } else {
                localMax = 0;
            }
        }

        return globalMax;
    }

}

/*
485. Max Consecutive Ones
 */
