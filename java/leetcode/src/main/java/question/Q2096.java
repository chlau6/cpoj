package question;

import datastructure.TreeNode;

public class Q2096 {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder();
        StringBuilder d = new StringBuilder();

        find(root, startValue, s);
        find(root, destValue, d);

        int i = 0;
        int max = Math.min(s.length(), d.length());
        int m = s.length();
        int n = d.length();

        while (i < max && s.charAt(m - i - 1) == d.charAt(n - i - 1)) {
            i++;
        }

        return "U".repeat(m - i) + d.reverse().toString().substring(i);
    }

    private boolean find(TreeNode n, int val, StringBuilder builder) {
        if (n.val == val) return true;

        if (n.left != null && find(n.left, val, builder)) {
            builder.append("L");
        } else if (n.right != null && find(n.right, val, builder)) {
            builder.append("R");
        }

        return builder.length() > 0;
    }
}
/*
2096. Step-By-Step Directions From a Binary Tree Node to Another
 */
