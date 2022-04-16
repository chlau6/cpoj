package question;

public class Q453 {
    public int minMoves(int[] nums) {
        int result = 0;
        int minimum = Integer.MAX_VALUE;

        for (int num : nums) {
            minimum = Math.min(minimum, num);
        }

        for (int num : nums) {
            result += (num - minimum);
        }

        return result;
    }
}

/*
453. Minimum Moves to Equal Array Elements
 */
