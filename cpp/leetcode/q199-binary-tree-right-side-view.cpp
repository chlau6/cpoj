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
    vector<int> rightSideView(TreeNode* root) {
        vector<int> result;

        dfs(result, root, 0);

        return result;
    }

    void dfs(vector<int>& result, TreeNode* root, int level) {
        if (!root) return;

        if (level >= result.size()) {
            result.push_back(root->val);
        }

        dfs(result, root->right, level + 1);
        dfs(result, root->left, level + 1);
    }
};