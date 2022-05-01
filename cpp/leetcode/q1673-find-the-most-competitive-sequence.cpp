#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> mostCompetitive(vector<int>& nums, int k) {
        stack<int> stack;
        int n = nums.size();
        vector<int> result(k);

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && nums[i] < nums[stack.top()] && n - i + stack.size() > k) {
                stack.pop();
            }

            if (stack.size() < k) {
                stack.push(i);
            }
        }

        while (--k >= 0) {
            result[k] = nums[stack.top()];
            stack.pop();
        }

        return result;
    }
};