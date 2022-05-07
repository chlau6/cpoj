#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> partitionLabels(string s) {
        vector<int> map(26);
        vector<int> result;
        int n = s.size();
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            map[s[i] - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {
            end = max(end, map[s[i] - 'a']);

            if (end == i) {
                result.push_back(end - start + 1);
                start = i + 1;
            }
        }

        return result;
    }
};