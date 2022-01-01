package question;

public class Q1103 {
    /*
    Time Complexity: O(sqrt(m))   Space Complexity: O(n)
     */
    public int[] distributeCandies(int candies, int numPeople) {
        int[] result = new int[numPeople];

        for (int i = 0; candies > 0; i++) {
            result[i % numPeople] += Math.min(candies, i + 1);
            candies -= (i + 1);
        }

        return result;
    }
}

/*
1103. Distribute Candies to People
 */
