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
    int findSecondMinimumValue(TreeNode* root) {
        if (!root->left) return -1;

        int left = (root->val == root->left->val) ? findSecondMinimumValue(root->left) : root->left->val;
        int right = (root->val == root->right->val) ? findSecondMinimumValue(root->right) : root->right->val;

        return (left == -1 || right == -1) ? max(left, right) : min(left, right);
    }
};