package question;

public class Q1055 {
    public int shortestWay(String source, String target) {
        int result = 0;
        int j = 0;
        int m = source.length();
        int n = target.length();

        while (j < n) {
            int prev = j;

            for (int i = 0; i < m; i++) {
                if (j < n && source.charAt(i) == target.charAt(j)) {
                    j++;
                }

                if (j == prev) return -1;

                result++;
            }
        }

        return result;
    }
}

/*
1055. Shortest Way to Form String
 */
