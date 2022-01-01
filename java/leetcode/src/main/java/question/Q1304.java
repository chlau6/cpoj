package question;

public class Q1304 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public int[] sumZero(int n) {
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int num = 1;

        while (left < right) {
            result[left++] = num;
            result[right--] = -num;
            num++;
        }

        return result;
    }
}

/*
1304. Find N Unique Integers Sum up to Zero
 */
