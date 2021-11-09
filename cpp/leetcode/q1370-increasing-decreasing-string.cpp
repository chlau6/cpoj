#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    string sortString(string s) {
        vector<int> counts(26);
        string result;
        int length = s.size();
        int count = 0;

        for (char c : s) {
            counts[c - 'a']++;
        }

        while (count < length) {
            for (int i = 0; i < 26; i++) {
                if (--counts[i] >= 0) {
                    result += (i + 'a');
                    count++;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (--counts[i] >= 0) {
                    result += (i + 'a');
                    count++;
                }
            }
        }

        return result;
    }
};