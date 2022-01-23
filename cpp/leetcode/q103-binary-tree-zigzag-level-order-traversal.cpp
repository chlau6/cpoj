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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        if (!root) return {};

        vector<vector<int>> result;
        queue<TreeNode*> queue;
        bool isReverse = false;

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

            if (isReverse) reverse(level.begin(), level.end());

            result.push_back(level);
            isReverse = !isReverse;
        }

        return result;
    }
};