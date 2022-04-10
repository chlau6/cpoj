package question;

public class Q2190 {
    public int mostFrequent(int[] nums, int key) {
        int[] count = new int[1001];
        int n = nums.length;
        int result = 0;

        for (int i = 0; i <= n - 2; i++) {
            if (nums[i] == key && ++count[nums[i + 1]] > count[result]) {
                result = nums[i + 1];
            }
        }

        return result;
    }
}

/*
2190. Most Frequent Number Following Key In an Array
 */
