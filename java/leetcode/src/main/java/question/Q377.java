package question;

public class Q377 {
    public int combinationSum4(int[] nums, int target) {
        int[] comb = new int[target + 1];
        comb[0] = 1;

        for (int i = 1; i < comb.length; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    comb[i] += comb[i - num];
                }
            }
        }

        return comb[target];
    }
}

/*
377. Combination Sum IV
 */
