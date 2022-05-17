package question;

public class Q798 {
    public int bestRotation(int[] nums) {
        int n = nums.length;
        int[] rotateLoss = new int[n];
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            rotateLoss[(i - nums[i] + 1 + n) % n]++;
        }

        int maxScore = score[0];
        int result = 0;

        for (int i = 1; i < n; i++) {
            score[i] = score[i - 1] - rotateLoss[i] + 1;

            if (score[i] > maxScore) {
                maxScore = score[i];
                result = i;
            }
        }

        return result;
    }
}

/*
798. Smallest Rotation with Highest Score
 */
