#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0;
        int j = height.size() - 1;
        int result = 0;

        while (i < j) {
            int volume = min(height[i], height[j]) * (j - i);
            result = max(result, volume);

            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
};