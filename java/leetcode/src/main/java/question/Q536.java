package question;

import annotation.BinaryTree;
import annotation.DepthFirstSearch;
import annotation.Stacks;
import annotation.Strings;
import company.Facebook;
import datastructure.TreeNode;

import java.util.Stack;

@Stacks
@DepthFirstSearch
@Strings
@BinaryTree
@Facebook
public class Q536 {
    /*
    Time Complexity: O(n)   Space Complexity: O(n)
     */
    public TreeNode str2tree(String s) {
        Stack<TreeNode> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ')') {
                stack.pop();
            } else if (c == '-' || c >= '0' && c <= '9') {
                int start = i;
                while (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                    i++;
                }
                int num = Integer.parseInt(s.substring(start, i + 1));
                TreeNode child = new TreeNode(num);

                if (!stack.empty()) {
                    TreeNode parent = stack.peek();
                    if (parent.left == null) {
                        parent.left = child;
                    } else {
                        parent.right = child;
                    }
                }
                stack.push(child);
            }
        }

        if (stack.empty()) return null;
        return stack.pop();
    }
}

/*
536. Construct Binary Tree from String
 */
