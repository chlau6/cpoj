#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string sortSentence(string s) {
        map<int, string> map;
        string result;
        int n = s.size();

        int start = 0;
        int i;

        for (i = 0; i <= n; i++) {
            if (i == n || s[i] == ' ') {
                map[s[i - 1] - '0'] = s.substr(start, i - 1 - start);
                start = i + 1;
            }
        }

        for (auto e : map) {
            if (result.size() > 0) result += ' ';
            result += e.second;
        }

        return result;
    }
};