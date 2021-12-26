#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> result;

        recursion(result, "", n, 0, 0);

        return result;
    }

    void recursion(vector<string>& result, string str, int n, int left, int right) {
        if (str.size() == 2 * n) {
            result.push_back(str);
            return;
        }

        if (left < n) {
            recursion(result, str + "(", n, left + 1, right);
        }

        if (left > right) {
            recursion(result, str + ")", n, left, right + 1);
        }
    }
};