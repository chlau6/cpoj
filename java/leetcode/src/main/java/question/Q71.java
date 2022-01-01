package question;

import java.util.Stack;

public class Q71 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public String simplifyPath(String path) {
        Stack<String> directories = new Stack<>();

        String[] splits = path.split("/");
        for (String split : splits) {
            if ("..".equals(split)) {
                if (!directories.empty()) {
                    directories.pop();
                }
            } else if (!".".equals(split) && !"".equals(split)) {
                directories.push(split);
            }
        }

        var builder = new StringBuilder();
        for (String dir : directories) {
            builder.append("/").append(dir);
        }

        return directories.empty() ? "/" : builder.toString();
    }
}

/*
71. Simplify Path
 */
