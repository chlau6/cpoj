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
    vector<vector<int>> levelOrder(TreeNode* root) {
        if (!root) return {};

        vector<vector<int>> result;
        queue<TreeNode*> queue;

        queue.push(root);

        while (!queue.empty()) {
            vector<int> level;

            int n = queue.size();

            for (int i = 0; i < n; i++) {
                TreeNode* node = queue.front();
                queue.pop();

                level.push_back(node->val);

                if (node->left) {
                    queue.push(node->left);
                }

                if (node->right) {
                    queue.push(node->right);
                }

            }

            result.push_back(level);
        }

        return result;
    }
};