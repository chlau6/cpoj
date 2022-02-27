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
    int countNodes(TreeNode* root) {
        int result = 0;

        int h = height(root);

        while (root) {
            int rightHeight = height(root->right);

            if (rightHeight == h - 1) {
                result += (1 << h);
                root = root->right;
            } else {
                result += (1 << (h - 1));
                root = root->left;
            }

            h--;
        }

        return result;
    }

    int height(TreeNode* root) {
        return !root ? -1 : 1 + height(root->left);
    }
};