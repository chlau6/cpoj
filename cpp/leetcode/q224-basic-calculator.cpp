#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int calculate(string s) {
        int result = 0;
        int sign = 1;
        int n = s.size();
        stack<int> stack;

        for (int i = 0; i < n; i++) {
            if (isdigit(s[i])) {
                int num = 0;

                while (i < n && isdigit(s[i])) {
                    num = num * 10 + (s[i++] - '0');
                }

                result += sign * num;
                i--;
            } else if (s[i] == '+') {
                sign = 1;
            } else if (s[i] == '-') {
                sign = -1;
            } else if (s[i] == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (s[i] == ')') {
                int prevSign = stack.top();
                stack.pop();

                int prevNum = stack.top();
                stack.pop();

                result = result * prevSign + prevNum;
            }
        }

        return result;
    }
};