#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minDeletionSize(vector<string>& strs) {
        int length = strs[0].size();
        int size = strs.size();
        int result = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (strs[j][i] > strs[j + 1][i]) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }
};