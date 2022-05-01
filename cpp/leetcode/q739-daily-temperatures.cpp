#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<int> stack;
        int n = temperatures.size();
        vector<int> result(n);

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && temperatures[i] > temperatures[stack.top()]) {
                int index = stack.top();
                stack.pop();

                result[index] = i - index;
            }

            stack.push(i);
        }

        return result;
    }
};