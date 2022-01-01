package question;

public class Q2057 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int smallestEqual(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i % 10 == nums[i]) return i;
        }

        return -1;
    }
}
/*
2057. Smallest Index With Equal Value
 */
