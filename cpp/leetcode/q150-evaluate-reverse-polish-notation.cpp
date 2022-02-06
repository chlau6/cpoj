#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        int result = 0;
        string op = "+-*/";
        stack<int> stack;

        for (auto token : tokens) {
            if (op.find(token) == string::npos) {
                stack.push(stoi(token));
                continue;
            }

            int b = stack.top();
            stack.pop();

            int a = stack.top();
            stack.pop();

            if (token == "+") {
                stack.push(a + b);
            } else if (token == "-") {
                stack.push(a - b);
            } else if (token == "*") {
                stack.push(a * b);
            } else {
                stack.push(a / b);
            }
        }

        return stack.top();
    }
};