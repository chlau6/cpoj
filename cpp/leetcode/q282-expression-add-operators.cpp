#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> addOperators(string num, int target) {
        vector<string> result;

        helper(result, "", num, target, 0, 0);

        return result;
    }

    void helper(vector<string>& result, string expr, string num, int target, long eval, long prev) {
        if (num.empty() && eval == target) {
            result.push_back(expr);
        }

        int n = num.size();

        for (int i = 1; i <= n; i++) {
            string current = num.substr(0, i);

            if (current.size() > 1 && current[0] == '0') return;

            string next = num.substr(i);
            long currVal = stol(current);

            if (expr.empty()) {
                helper(result, current, next, target, currVal, currVal);
            } else {
                helper(result, expr + "+" + current, next, target, eval + currVal, currVal);
                helper(result, expr + "-" + current, next, target, eval - currVal, -currVal);
                helper(result, expr + "*" + current, next, target, eval - prev + prev * currVal, prev * currVal);
            }
        }
    }
};