package question;

import datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q662 {
    class Solution {
        public int widthOfBinaryTree(TreeNode root) {
            int result = 0;
            Queue<Index> q = new LinkedList<>();

            q.add(new Index(root, 1));

            while (!q.isEmpty()) {
                int left = q.peek().pos;
                int n = q.size();

                for (int i = 0; i < n; i++) {
                    Index index = q.poll();
                    TreeNode node = index.node;
                    int pos = index.pos;

                    if (node.left != null) {
                        q.add(new Index(node.left, 2 * pos));
                    }

                    if (node.right != null) {
                        q.add(new Index(node.right, 2 * pos + 1));
                    }

                    result = Math.max(result, pos - left + 1);
                }
            }

            return result;
        }

        class Index {
            TreeNode node;
            int pos;

            public Index(TreeNode node, int pos) {
                this.node = node;
                this.pos = pos;
            }
        }
    }
}

/*
662. Maximum Width of Binary Tree
 */
