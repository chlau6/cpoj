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

class BSTIterator {
public:
    stack<TreeNode*> stack;

    BSTIterator(TreeNode* root) {
        pushAll(root);
    }

    int next() {
        TreeNode* node = stack.top();
        stack.pop();
        pushAll(node->right);

        return node->val;
    }

    bool hasNext() {
        return !stack.empty();
    }

    void pushAll(TreeNode* root) {
        while (root) {
            stack.push(root);
            root = root->left;
        }
    }
};
