#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkIfPangram(string sentence) {
        vector<int> counts(26);
        int count = 0;

        for (auto c : sentence) {
            if (++counts[c - 'a'] == 1) {
                count++;
            }

            if (count == 26) return true;
        }

        return false;
    }
};