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
    void recoverTree(TreeNode* root) {
        stack<TreeNode*> stack;

        TreeNode* prev = NULL;
        TreeNode* curr = root;

        TreeNode* first = NULL;
        TreeNode* second = NULL;

        while (curr || !stack.empty()) {
            while (curr) {
                stack.push(curr);
                curr = curr->left;
            }

            curr = stack.top();
            stack.pop();

            if (prev && prev->val > curr->val) {
                if (!first) {
                    first = prev;
                }
                second = curr;
            }

            prev = curr;
            curr = curr->right;
        }

        swap(first->val, second->val);
    }
};