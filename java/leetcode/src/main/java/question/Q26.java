package question;

public class Q26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i == 0 || num > nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }
}

/*
26. Remove Duplicates from Sorted Array
 */
