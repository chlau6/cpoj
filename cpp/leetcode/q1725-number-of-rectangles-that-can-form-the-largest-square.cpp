#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countGoodRectangles(vector<vector<int>>& rectangles) {
        int maxLen = 0;
        int result = 0;

        for (auto r : rectangles) {
            int largest = min(r[0], r[1]);

            if (largest > maxLen) {
                maxLen = largest;
                result = 1;
            } else if (largest == maxLen) {
                result++;
            }
        }

        return result;
    }
};