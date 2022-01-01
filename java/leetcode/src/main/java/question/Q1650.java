package question;

public class Q1650 {
    /*
    Time Complexity: O(log n)   Space Complexity: O(1)
     */
    public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
        TreeNode dummyP = p;
        TreeNode dummyQ = q;

        while (dummyP != dummyQ) {
            dummyP = dummyP == null ? dummyQ : dummyP.parent;
            dummyQ = dummyQ == null ? dummyP : dummyQ.parent;
        }

        return dummyP;
    }


    class TreeNode {
        public int val;
        public TreeNode parent;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {

        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode parent, TreeNode left, TreeNode right) {
            this.val = val;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }
}

/*
1644. Lowest Common Ancestor of a Binary Tree II
 */
