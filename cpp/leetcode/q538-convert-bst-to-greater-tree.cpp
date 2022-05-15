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

    TreeNode* convertBST(TreeNode* root) {
        if (!root) return NULL;

        if (root->right) {
            convertBST(root->right);
        }

        suffixSum += root->val;
        root->val = suffixSum;

        if (root->left) {
            convertBST(root->left);
        }

        return root;
    }
};