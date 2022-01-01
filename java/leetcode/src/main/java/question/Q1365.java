package question;

public class Q1365 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];

        for (int num : nums) {
            counts[num]++;
        }

        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[i] = counts[nums[i] - 1];
            }
        }

        return nums;
    }
}

/*
1365. How Many Numbers Are Smaller Than the Current Number
 */
