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
    vector<string> summaryRanges(vector<int>& nums) {
        vector<string> s;
        int length = nums.size();

        for (int i = 0; i < length; i++) {
            int start = nums[i];

            while (i + 1 < length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            if (nums[i] == start) {
                s.push_back(to_string(start));
            } else {
                s.push_back(to_string(start) + "->" + to_string(nums[i]));
            }
        }

        return s;
    }
};