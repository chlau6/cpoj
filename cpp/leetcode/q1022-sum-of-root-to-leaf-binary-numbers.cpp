#include<bits/stdc++.h>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    int sumRootToLeaf(TreeNode* root) {
        return helper(root, 0);
    }

    int helper(TreeNode* root, int val) {
        if (!root) return 0;

        val = (val << 1) + root->val;

        return (root->left == root->right) ? val : helper(root->left, val) + helper(root->right, val);
    }
};