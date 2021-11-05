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
    bool isCousins(TreeNode* root, int x, int y) {
        queue<TreeNode*> q;

        q.push(root);

        while (!q.empty()) {
            bool xFound = false;
            bool yFound = false;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                auto node = q.front();
                q.pop();

                if (!xFound) {
                    xFound = node->val == x;
                }

                if (!yFound) {
                    yFound = node->val == y;
                }

                if (node->left && node->right && (node->left->val == x && node->right->val == y || node->left->val == y && node->right->val == x)) {
                    return false;
                }

                if (node->left) {
                    q.push(node->left);
                }

                if (node->right) {
                    q.push(node->right);
                }
            }

            if (xFound && yFound) return true;

            if (xFound || yFound) return false;
        }

        return false;
    }
};