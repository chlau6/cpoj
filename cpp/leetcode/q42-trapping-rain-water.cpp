#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        int i = 0;
        int j = height.size() - 1;
        int result = 0;

        while (i <= j) {
            int minHeight = min(height[i], height[j]);

            if (minHeight == height[i]) {
                i++;
                while (i < j && height[i] < minHeight) {
                    result += minHeight - height[i++];
                }
            } else {
                j--;
                while (i < j && height[j] < minHeight) {
                    result += minHeight - height[j--];
                }
            }
        }

        return result;
    }
};