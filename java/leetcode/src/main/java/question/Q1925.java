package question;

public class Q1925 {
    /*
    Time Complexity: O(n^2)   Space Complexity: O(1)
     */
    public int countTriples(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = i * i + j * j;
                int c = (int) Math.sqrt(sum);

                if (c * c == sum && c <= n) {
                    result += 2;
                }
            }
        }

        return result;
    }
}

/*
1925. Count Square Sum Triples
 */
