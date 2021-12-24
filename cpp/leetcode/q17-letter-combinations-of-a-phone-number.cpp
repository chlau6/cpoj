#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if (digits.size() == 0) return {};

        vector<vector<char>> tables = {{' '}, {' '}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        vector<string> result;

        recursion(tables, result, digits, "", 0);

        return result;
    }

    void recursion(vector<vector<char>>& tables, vector<string>& result, string digits, string str, int curr) {
        if (curr == digits.size()) {
            result.push_back(str);
            return;
        }

        for (char c : tables[digits[curr] - '0']) {
            recursion(tables, result, digits, str + c, curr + 1);
        }
    }
};