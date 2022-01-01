package question;

public class Q1460 {
    /*
    Time Complexity: O(n)  Space Complexity: O(1)
     */
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] counts = new int[1001];

        for (int num : target) {
            counts[num]++;
        }

        for (int num : arr) {
            counts[num]--;
        }

        for (int count : counts) {
            if (count > 0) return false;
        }

        return true;
    }
}

/*
1460. Make Two Arrays Equal by Reversing Sub-arrays
 */
