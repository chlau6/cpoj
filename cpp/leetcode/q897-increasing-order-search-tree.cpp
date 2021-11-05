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
    TreeNode* inorder(TreeNode* root, TreeNode* leaf) {
        if (!root) return leaf;

        TreeNode* node = inorder(root->left, root);
        root->left = NULL;
        root->right = inorder(root->right, leaf);

        return node;
    }

    TreeNode* increasingBST(TreeNode* root) {
        return inorder(root, NULL);
    }
};