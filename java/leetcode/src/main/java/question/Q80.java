package question;

public class Q80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int num : nums) {
            if (i < 2 || num > nums[i - 2]) {
                nums[i++] = num;
            }
        }

        return i;
    }
}

/*
80. Remove Duplicates from Sorted Array II
 */
