#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> divideString(string s, int k, char fill) {
        int n = s.size();
        int size = n / k + (n % k == 0 ? 0 : 1);
        int pad = k - n % k;
        vector<string> result;

        for (int i = 0; i < pad; i++) {
            s += fill;
        }

        for (int i = 0; i < n; i += k) {
            result.push_back(s.substr(i, k));
        }

        return result;
    }
};