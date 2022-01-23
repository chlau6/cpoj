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
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> result;
        vector<int> list;

        dfs(result, list, root, targetSum);

        return result;
    }

    void dfs(vector<vector<int>>& result, vector<int>& list, TreeNode* root, int targetSum) {
        if (!root) return;

        list.push_back(root->val);
        int newSum = targetSum - root->val;

        if (!root->left && !root->right && newSum == 0) {
            result.push_back(list);
        }

        dfs(result, list, root->left, newSum);
        dfs(result, list, root->right, newSum);

        list.pop_back();
    }
};