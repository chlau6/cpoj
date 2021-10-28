#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string toLowerCase(string s) {
        int length = s.size();

        for (auto& c : s) {
            if (c >= 65 && c <= 90) c += 32;
        }

        return s;
    }
};