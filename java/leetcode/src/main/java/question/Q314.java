package question;

import datastructure.TreeNode;

import java.util.*;

public class Q314 {
    /*
    BFS
    Time Complexity: O(n log n) Space Complexity: O(n)
    */
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        Queue<Integer> columnQueue = new LinkedList<>();
        columnQueue.add(0);

        Map<Integer, List<Integer>> treeMap = new TreeMap<>();

        while (!treeNodeQueue.isEmpty()) {
            int size = treeNodeQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodeQueue.remove();
                Integer column = columnQueue.remove();

                List<Integer> list = treeMap.getOrDefault(column, new ArrayList<>());
                list.add(node.val);
                treeMap.put(column, list);

                if (node.left != null) {
                    treeNodeQueue.add(node.left);
                    columnQueue.add(column - 1);
                }
                if (node.right != null) {
                    treeNodeQueue.add(node.right);
                    columnQueue.add(column + 1);
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : treeMap.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}

/*
314. Binary Tree Vertical Order Traversal
 */
