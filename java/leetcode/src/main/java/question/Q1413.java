package question;

public class Q1413 {
    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            min = Math.min(min, sum);
        }

        return -min + 1;
    }
}

/*
1413. Minimum Value to Get Positive Step by Step Sum
 */
