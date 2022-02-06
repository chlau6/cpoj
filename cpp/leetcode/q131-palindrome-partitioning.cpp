#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<string>> partition(string s) {
        vector<vector<string>> result;
        vector<string> list;

        recursion(result, list, s, 0);

        return result;
    }

    void recursion(vector<vector<string>>& result, vector<string>& list, string s, int start) {
        if (start == s.size()) {
            result.push_back(list);
        }

        for (int i = start; i < s.size(); i++) {
            if (!isPalindrome(s, start, i)) continue;

            list.push_back(s.substr(start, i - start + 1));
            recursion(result, list, s, i + 1);
            list.pop_back();
        }
    }

    bool isPalindrome(string s, int i, int j) {
        while (i < j) {
            if (s[i++] != s[j--]) {
                return false;
            }
        }

        return true;
    }
};