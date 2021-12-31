#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int longestValidParentheses(string s) {
        int n = s.size();

        int result = 0;
        stack<int> stack;
        stack.push(-1);

        for (int i = 0; i < n; i++) {
            if (s[i] == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.empty()) {
                    stack.push(i);
                } else {
                    result = max(result, i - stack.top());
                }
            }
        }

        return result;
    }
};