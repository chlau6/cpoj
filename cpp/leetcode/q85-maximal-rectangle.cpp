#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maximalRectangle(vector<vector<char>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        int result = 0;

        vector<int> height(n + 1);

        for (int i = 0; i < m; i++) {
            stack<int> stack;

            for (int j = 0; j < n + 1; j++) {
                if (j < n) {
                    height[j] = matrix[i][j] == '1' ? height[j] + 1 : 0;
                }

                while (!stack.empty() && height[stack.top()] >= height[j]) {
                    int prev = stack.top();
                    stack.pop();

                    result = max(result, height[prev] * (stack.empty() ? j : j - stack.top() - 1));
                }

                stack.push(j);
            }
        }

        return result;
    }
};