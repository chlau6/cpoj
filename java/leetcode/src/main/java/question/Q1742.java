package question;

public class Q1742 {
    /*
    Time Complexity: O(n log m)   Space Complexity: O(1)
     */
    public int countBalls(int lowLimit, int highLimit) {
        int[] counts = new int[46];

        for (int i = lowLimit; i <= highLimit; i++) {
            int digitSum = 0;
            int num = i;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            counts[digitSum]++;
        }

        int result = 0;

        for (int count : counts) {
            result = Math.max(result, count);
        }

        return result;
    }
}

/*
1742. Maximum Number of Balls in a Box
 */
