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
    vector<int> findFrequentTreeSum(TreeNode* root) {
        unordered_map<int, int> map;
        int maxCount = 0;

        dfs(map, root, maxCount);

        vector<int> result;

        for (auto it = map.begin(); it != map.end(); it++) {
            if (it->second == maxCount) {
                result.push_back(it->first);
            }
        }

        return result;
    }

    int dfs(unordered_map<int, int>& map, TreeNode* root, int& maxCount) {
        if (!root) return 0;

        int sum = root->val;

        sum += dfs(map, root->left, maxCount);
        sum += dfs(map, root->right, maxCount);

        maxCount = max(maxCount, ++map[sum]);

        return sum;
    }
};