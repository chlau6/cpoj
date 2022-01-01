package question;

public class Q1394 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public int findLucky(int[] arr) {
        int[] counts = new int[501];

        for (int num : arr) {
            counts[num]++;
        }

        for (int i = 500; i >= 1; i--) {
            if (counts[i] == i) return i;
        }

        return -1;
    }
}

/*
1394. Find Lucky Integer in an Array
 */
