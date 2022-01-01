package question;

public class Q852 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}

/*
852. Peak Index in a Mountain Array
 */
