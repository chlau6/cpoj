package question;

public class Q268 {
    /*
    Bit Manipulation
    Time Complexity: O(n)   Space Complexity: O(1);
     */
    public int missingNumber(int[] nums) {
        int xor = 0;
        int i;

        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }

    /*
    Math
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int missingNumber2(int[] nums) {
        int sum = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum += (i - nums[i]);
        }
        return sum;
    }
}

/*
268. Missing Number
 */