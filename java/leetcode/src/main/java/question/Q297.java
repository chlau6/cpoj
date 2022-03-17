package question;

import datastructure.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q297 {
    public class Codec {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) return "#";

            return root.val + " " + serialize(root.left) + " " + serialize(root.right);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] nodes = data.split(" ");

            Queue<String> queue = new LinkedList<>(Arrays.asList(nodes));

            return helper(queue);
        }

        public TreeNode helper(Queue<String> queue) {
            if (queue.peek().equals("#")) {
                queue.remove();

                return null;
            }

            int value = Integer.parseInt(queue.remove());
            TreeNode root = new TreeNode(value);

            root.left = helper(queue);
            root.right = helper(queue);

            return root;
        }
    }
}

/*
297. Serialize and Deserialize Binary Tree
 */
