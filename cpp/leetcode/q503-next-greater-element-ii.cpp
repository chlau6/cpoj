#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n, -1);
        stack<int> stack;

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];

            while (!stack.empty() && nums[stack.top()] < num) {
                result[stack.top()] = num;
                stack.pop();
            }

            stack.push(i % n);
        }

        return result;
    }
};