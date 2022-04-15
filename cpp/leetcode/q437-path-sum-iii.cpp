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
    int pathSum(TreeNode* root, int targetSum) {
        if (!root) return 0;

        unordered_map<int, int> map;
        map[0] = 1;

        return dfs(map, root, targetSum, 0);
    }

    int dfs(unordered_map<int, int>& map, TreeNode* root, int targetSum, long currSum) {
        if (!root) return 0;

        currSum += root->val;

        int result = map[currSum - targetSum];

        map[currSum]++;

        result += dfs(map, root->left, targetSum, currSum) + dfs(map, root->right, targetSum, currSum);

        map[currSum]--;

        return result;
    }
};