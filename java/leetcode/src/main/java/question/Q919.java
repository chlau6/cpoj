package question;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q919 {
    class CBTInserter {
        List<TreeNode> list = new ArrayList<>();

        public CBTInserter(TreeNode root) {
            list.add(root);

            for (int i = 0; i < list.size(); i++) {
                TreeNode node = list.get(i);

                if (node.left != null) {
                    list.add(node.left);
                }

                if (node.right != null) {
                    list.add(node.right);
                }
            }
        }

        public int insert(int val) {
            int size = list.size();
            TreeNode node = new TreeNode(val);
            list.add(node);

            int parentPos = (size - 1) / 2;
            TreeNode parent = list.get(parentPos);

            if (size % 2 == 1) {
                parent.left = node;
            } else {
                parent.right = node;
            }

            return parent.val;
        }

        public TreeNode get_root() {
            return list.get(0);
        }
    }
}

/*
919. Complete Binary Tree Inserter
 */
