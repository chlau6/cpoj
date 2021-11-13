#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        int length = indices.size();
        string result = s;

        for (int i = 0; i < length; i++) {
            result[indices[i]] = s[i];
        }

        return result;
    }
};