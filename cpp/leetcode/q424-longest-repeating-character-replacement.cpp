#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int characterReplacement(string s, int k) {
        vector<int> counts(26);
        int result = 0;
        int start = 0;
        int maxCount = 0;
        int n = s.size();

        for (int i = 0; i < n; i++) {
            maxCount = max(maxCount, ++counts[s[i] - 'A']);

            while (i - start + 1 - maxCount > k) {
                counts[s[start] - 'A']--;
                start++;
            }

            result = max(result, i - start + 1);
        }

        return result;
    }
};