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
    int kthSmallest(TreeNode* root, int k) {
        stack<TreeNode*> stack;

        while (root) {
            stack.push(root);
            root = root -> left;
        }

        while (k != 0) {
            TreeNode* node = stack.top();
            stack.pop();
            k--;

            if (k == 0) return node->val;

            TreeNode* child = node->right;
            while (child) {
                stack.push(child);
                child = child->left;
            }
        }

        return -1;
    }
};