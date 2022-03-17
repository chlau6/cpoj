#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxProduct(vector<string>& words) {
        int n = words.size();
        vector<int> values(n);
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (char& c : words[i]) {
                values[i] |= (1 << (c - 'a'));
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((values[i] & values[j]) == 0) {
                    result = max(result, (int) (words[i].size() * words[j].size()));
                }
            }
        }

        return result;
    }
};