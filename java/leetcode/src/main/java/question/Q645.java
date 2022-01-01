package question;

public class Q645 {
    /*
    Time Complexity: O(1)   Space Complexity: O(1)
     */
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[] {nums[i], i + 1};
            }
        }

        return new int[] {-1, -1};
    }
}

/*
645. Set Mismatch
 */
