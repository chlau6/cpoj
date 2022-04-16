#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool find132pattern(vector<int>& nums) {
        stack<int> stack;
        int n = nums.size();
        int last = INT_MIN;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < last) return true;

            while (!stack.empty() && nums[i] > stack.top()) {
                last = stack.top();
                stack.pop();
            }

            stack.push(nums[i]);
        }

        return false;
    }
};