package question;

import datastructure.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q297 {
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder builder = new StringBuilder();

            serialize(root, builder);

            return builder.toString();
        }

        public void serialize(TreeNode root, StringBuilder builder) {
            if (root == null) {
                builder.append("#").append(" ");
                return;
            }

            builder.append(root.val).append(",");
            serialize(root.left, builder);
            serialize(root.right, builder);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] nodes = data.split(" ");

            Queue<String> queue = new LinkedList<>(Arrays.asList(nodes));

            return deserialize(queue);
        }

        public TreeNode deserialize(Queue<String> queue) {
            String s = queue.poll();

            if (s.equals("#")) return null;

            int value = Integer.parseInt(s);
            TreeNode root = new TreeNode(value);

            root.left = deserialize(queue);
            root.right = deserialize(queue);

            return root;
        }
    }
}

/*
297. Serialize and Deserialize Binary Tree
 */
