#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int prefixCount(vector<string>& words, string pref) {
        int result = 0;

        for (auto& w : words) {
            if (w.find(pref) == 0) {
                result++;
            }
        }

        return result;
    }
};