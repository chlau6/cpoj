package question;

public class Q1295 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if (num >= 10 && num <= 99 || num >= 1000 && num <= 9999 || num == 100000) {
                result++;
            }
        }

        return result;
    }
}

/*
1295. Find Numbers with Even Number of Digits
 */
