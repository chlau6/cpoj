#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minDiffInBST(TreeNode* root) {
        TreeNode* prev = NULL;
        int minDiff = INT_MAX;

        inorder(root, prev, minDiff);

        return minDiff;
    }

    void inorder(TreeNode* root, TreeNode*& prev, int& minDiff) {
        if (!root) return;

        inorder(root->left, prev, minDiff);

        if (prev) {
            minDiff = min(minDiff, abs(prev->val - root->val));
        }

        prev = root;

        inorder(root->right, prev, minDiff);
    }
};