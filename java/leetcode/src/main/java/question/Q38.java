package question;

public class Q38 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(m)
     */
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder builder = new StringBuilder();

            int k = result.length();
            char c = result.charAt(0);
            int count = 1;

            for (int j = 1; j < k; j++) {
                if (result.charAt(j) != result.charAt(j - 1)) {
                    builder.append(count).append(c);
                    c = result.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }

            result = builder.append(count).append(c).toString();
        }

        return result;
    }
}

/*
38. Count and Say
 */
