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
    int diameterOfBinaryTree(TreeNode* root) {
        int longest = 0;

        helper(root, longest);

        return longest;
    }

    int helper(TreeNode* root, int& longest) {
        if (!root) return 0;

        int left = helper(root->left, longest);
        int right = helper(root->right, longest);

        longest = max(longest, left + right);

        return 1 + max(left, right);
    }
};