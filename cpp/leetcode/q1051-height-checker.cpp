#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> counts(101);

        for (int height : heights) {
            counts[height]++;
        }

        int j = 0;
        int result = 0;

        for (int height : heights) {
            while (counts[j] == 0) j++;

            if (height != j) result++;

            counts[j]--;
        }

        return result;
    }
};