package question;

public class Q2243 {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < s.length(); i += k) {
                String substr = s.substring(i, Math.min(i + k, s.length()));
                int sum = 0;

                for (int j = 0; j < substr.length(); j++) {
                    sum += substr.charAt(j) - '0';
                }

                builder.append(sum);
            }

            s = builder.toString();
        }

        return s;
    }
}

/*
2243. Calculate Digit Sum of a String
 */
