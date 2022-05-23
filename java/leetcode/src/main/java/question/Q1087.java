package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1087 {
    public String[] expand(String s) {
        List<String> result = new ArrayList<>();

        dfs(result, s, new StringBuilder(), 0);
        Collections.sort(result);

        return result.toArray(new String[0]);
    }

    private void dfs(List<String> result, String s, StringBuilder builder, int i) {
        if (i >= s.length()) {
            result.add(builder.toString());

            return;
        }

        if (s.charAt(i) == '{') {
            int j = i + 1;

            while (j < s.length() && s.charAt(j) != '}') {
                j++;
            }

            String[] candidates = s.substring(i + 1, j).split(",");

            for (String candidate : candidates) {
                builder.append(candidate);

                dfs(result, s, builder, j + 1);

                builder.deleteCharAt(builder.length() - 1);
            }
        } else {
            builder.append(s.charAt(i));
            dfs(result, s, builder, i + 1);
            builder.deleteCharAt(builder.length() - 1);
        }
    }
}

/*
1087. Brace Expansion
 */
