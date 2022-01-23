package question;

import java.util.ArrayList;
import java.util.List;

public class Q93 {
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        List<String> result = new ArrayList<>();

        for (int i = 1; i < 4; i++)
            for (int j = 1; j < 4; j++)
                for (int k = 1; k < 4; k++)
                    for (int l = 1; l < 4; l++) {
                        if (i + j + k + l != n) continue;

                        int a = Integer.parseInt(s.substring(0, i));
                        int b = Integer.parseInt(s.substring(i, i + j));
                        int c = Integer.parseInt(s.substring(i + j, i + j + k));
                        int d = Integer.parseInt(s.substring(i + j + k));

                        if (a > 255 || b > 255 || c > 255 || d > 255) continue;

                        var builder = new StringBuilder().append(a).append('.').append(b).append('.').append(c).append('.').append(d);
                        if (builder.length() == n + 3) {
                            result.add(builder.toString());
                        }
                    }

        return result;
    }
}

/*
93. Restore IP Addresses
 */
