#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int calculate(string s) {
        int result = 0;
        int tempResult = 0;
        int num = 0;
        int n = s.size();
        char lastOp = '+';

        for (int i = 0; i < n; i++) {
            if (isdigit(s[i])) {
                num = num * 10 + (s[i] - '0');
            }

            if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/' || i == n - 1) {
                if (lastOp == '+') {
                    tempResult += num;
                } else if (lastOp == '-') {
                    tempResult -= num;
                } else if (lastOp == '*') {
                    tempResult *= num;
                } else {
                    tempResult /= num;
                }

                if (s[i] == '+' || s[i] == '-' || i == n - 1) {
                    result += tempResult;
                    tempResult = 0;
                }

                lastOp = s[i];
                num = 0;
            }
        }

        return result;
    }
};