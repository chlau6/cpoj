#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findSubstringInWraproundString(string p) {
        vector<int> counts(26);
        int n = p.size();
        int length = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0 && (p[i] == p[i - 1] + 1 || p[i - 1] - p[i] == 25)) {
                length++;
            } else {
                length = 1;
            }

            counts[p[i] - 'a'] = max(counts[p[i] - 'a'], length);
        }

        int result = 0;

        for (int count : counts) {
            result += count;
        }

        return result;
    }
};