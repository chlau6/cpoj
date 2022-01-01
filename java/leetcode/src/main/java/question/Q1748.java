package question;

public class Q1748 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        int result = 0;

        for (int i = 1; i <= 100; i++) {
            if (count[i] == 1) {
                result += i;
            }
        }

        return result;
    }
}

/*
1748. Sum of Unique Elements
 */
