#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        heights.push_back(0);

        int i = 0;
        int j = heights.size() - 1;
        int result = 0;

        stack<int> stack;

        while (i <= j) {
            if (stack.empty() || heights[stack.top()] < heights[i]) {
                stack.push(i++);
            } else {
                int prev = stack.top();
                stack.pop();

                result = max(result, heights[prev] * (stack.empty() ? i : i - stack.top() - 1));
            }
        }

        return result;
    }
};