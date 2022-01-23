package question;

public class Q34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int n = nums.length - 1;

        if (nums.length == 0 || nums[0] > target || nums[n] < target) {
            return result;
        }

        int left = 0;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (nums[left] != target) {
            return result;
        }

        result[0] = left;
        right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        result[1] = right;
        return result;
    }

    /*
    Variation: Given a sorted array and target number, find how many times the target number appears in the array.
     */

    public int searchRepeatedTarget(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target) return 0;

        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (nums[right] != target) return 0;

        int firstFound = right;

        left = 0;
        right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right - firstFound;
    }
}

/*
34. Find First and Last Position of Element in Sorted Array
 */
