#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string removeOuterParentheses(string s) {
        int count = 0;
        string result = "";

        for (char c : s) {
            if (c == '(' && count++ > 0) result += c;
            else if (c == ')' && count-- > 1) result += c;
        }

        return result;
    }
};