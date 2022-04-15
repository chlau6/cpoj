#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int> result;

        int i = 0;
        int j = 0;
        int m = s.size();
        int n = p.size();
        int count = n;
        vector<int> map(256);

        for (char c : p) {
            map[c]++;
        }

        while (j < m) {
            if (map[s[j++]]-- >= 1) {
                count--;
            }

            if (count == 0) {
                result.push_back(i);
            }

            if (j - i == n && map[s[i++]]++ >= 0) {
                count++;
            }
        }

        return result;
    }
};