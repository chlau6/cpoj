package question;

public class Q2206 {
    public boolean divideArray(int[] nums) {
        int[] counts = new int[501];

        for (int num : nums) {
            counts[num]++;
        }

        for (int count : counts) {
            if (count % 2 != 0) return false;
        }

        return true;
    }
}

/*
2206. Divide Array Into Equal Pairs
 */
