#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int longestSubstring(string s, int k) {
        int result = 0;
        int n = s.size();

        for (int count = 1; count <= 26; count++) {
            vector<int> bucket(26);
            int start = 0;
            int i = 0;
            int uniqueCount = 0;

            while (i < n) {
                bool valid = true;

                if (bucket[s[i++] - 'a']++ == 0) {
                    uniqueCount++;
                }

                while (uniqueCount > count) {
                    if (--bucket[s[start++] - 'a'] == 0) {
                        uniqueCount--;
                    }
                }

                for (int j = 0; j < 26; j++) {
                    if (bucket[j] > 0 && bucket[j] < k) {
                        valid = false;
                    }
                }

                if (valid) {
                    result = max(result, i - start);
                }
            }
        }

        return result;
    }
};