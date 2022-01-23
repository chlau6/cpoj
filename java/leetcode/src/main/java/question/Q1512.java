package question;

public class Q1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];
        int result = 0;

        for (int num : nums) {
            counts[num]++;
        }

        for (int count : counts) {
            if (count > 1) {
                result += count * (count - 1) / 2;
            }
        }

        return result;
    }
}

/*
1512. Number of Good Pairs
 */
