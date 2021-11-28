#include<bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxDistance(vector<int>& colors) {
        int result = 0;
        int n = colors.size();

        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                result = n - 1 - i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (colors[0] != colors[i]) {
                result = max(result, i);
                break;
            }
        }

        return result;
    }
};