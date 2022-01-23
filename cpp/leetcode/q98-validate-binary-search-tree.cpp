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
    bool isValidBST(TreeNode* root) {
        stack<TreeNode*> stack;

        TreeNode* prev = NULL;
        TreeNode* curr = root;

        while (curr || !stack.empty()) {
            while (curr) {
                stack.push(curr);
                curr = curr->left;
            }

            curr = stack.top();
            stack.pop();

            if (prev && prev->val >= curr->val) return false;
            prev = curr;
            curr = curr->right;
        }

        return true;
    }
};