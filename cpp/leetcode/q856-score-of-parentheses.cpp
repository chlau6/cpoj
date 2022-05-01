#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int scoreOfParentheses(string s) {
        stack<char> stack;
        int result = 0;

        for (char c : s) {
            if (c == '(') {
                stack.push(result);
                result = 0;
            } else {
                result = stack.top() + max(result * 2, 1);
                stack.pop();
            }
        }

        return result;
    }
};