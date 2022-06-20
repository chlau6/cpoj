package question;

public class Q2139 {
    public int minMoves(int target, int maxDoubles) {
        int result = 0;

        while (target > 1 && maxDoubles > 0) {
            if (target % 2 == 0) {
                target /= 2;
                maxDoubles--;
            } else {
                target--;
            }

            result++;
        }

        return result + target - 1;
    }
}
/*
2139. Minimum Moves to Reach Target Score
 */
