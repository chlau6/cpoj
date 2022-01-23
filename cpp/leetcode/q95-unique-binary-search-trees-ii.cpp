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
    vector<TreeNode*> generateTrees(int n) {
        return recursion(1, n);
    }

    vector<TreeNode*> recursion(int start, int end) {
        vector<TreeNode*> result;

        if (start > end) {
            result.push_back(NULL);
            return result;
        }

        for (int i = start; i <= end; i++) {
            vector<TreeNode*> left = recursion(start, i - 1);
            vector<TreeNode*> right = recursion(i + 1, end);

            for (auto l : left) {
                for (auto r : right) {
                    TreeNode* node = new TreeNode(i);
                    node->left = l;
                    node->right = r;

                    result.push_back(node);
                }
            }
        }

        return result;
    }
};