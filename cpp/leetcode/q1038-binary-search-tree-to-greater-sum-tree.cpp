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
    int suffixSum = 0;

    TreeNode* bstToGst(TreeNode* root) {
        if (root->right) {
            bstToGst(root->right);
        }

        suffixSum += root->val;
        root->val = suffixSum;

        if (root->left) {
            bstToGst(root->left);
        }

        return root;
    }
};