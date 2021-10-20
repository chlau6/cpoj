package question;

import annotation.*;
import company.Facebook;
import datastructure.TreeNode;

import java.util.*;

@HashTable
@Tree
@DepthFirstSearch
@BreadthFirstSearch
@BinaryTree
@Facebook
public class Q987 {
    /*
    DFS
    Time Complexity: O(n log n) Space Complexity: O(n)
     */
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();

        dfs(root, map, 0, 0);

        List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Map<Integer, List<Integer>>> outer : map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, List<Integer>> inner : outer.getValue().entrySet()) {
                List<Integer> v = inner.getValue();

                Collections.sort(v);
                list.addAll(v);
            }
            ans.add(list);
        }
        return ans;
    }

    private void dfs(TreeNode root, Map<Integer, Map<Integer, List<Integer>>> map, int row, int col) {
        if (root == null) return;

        map.putIfAbsent(col, new TreeMap<>());
        map.get(col).putIfAbsent(row, new ArrayList<>());

        map.get(col).get(row).add(root.val);

        dfs(root.left, map, row + 1, col - 1);
        dfs(root.right, map, row + 1, col + 1);
    }
}

/*
987. Vertical Order Traversal of a Binary Tree
 */
