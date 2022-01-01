package question;

public class Q1217 {
    /*
    Time Complexity: O(n)   Space Complexity: O(1)
     */
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;

        for (int pos : position) {
            if (pos % 2 == 0) even++;
            else odd++;
        }

        return Math.min(odd, even);
    }
}

/*
1217. Minimum Cost to Move Chips to The Same Position
 */
