#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string removeKdigits(string num, int k) {
        int n = num.size();
        int keep = n - k;
        string result;

        for (char c : num) {
            while (!result.empty() && result.back() > c && k > 0) {
                result.pop_back();
                k--;
            }

            result.push_back(c);
        }

        result.resize(keep);

        while (!result.empty() && result[0] == '0') {
            result.erase(result.begin());
        }

        return result.empty() ? "0" : result;
    }
};