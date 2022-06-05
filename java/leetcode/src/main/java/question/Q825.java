package question;

public class Q825 {
    public int numFriendRequests(int[] ages) {
        int result = 0;
        int[] prefixSum = new int[121];
        int[] count = new int[121];

        for (int age : ages) {
            count[age]++;
        }

        for (int i = 1; i <= 120; i++) {
            prefixSum[i] = prefixSum[i - 1] + count[i];
        }

        for (int i = 15; i <= 120; i++) {
            if (count[i] == 0) continue;

            int total = prefixSum[i] - prefixSum[(int) (0.5 * i + 7)];
            result += total * count[i] - count[i];
        }

        return result;
    }
}

/*
825. Friends Of Appropriate Ages
 */
